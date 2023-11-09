package com.example.gallery.presentation.ui.fragments

import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.gallery.R
import com.example.gallery.databinding.FragmentGalleryBinding
import com.example.gallery.presentation.base.BaseFragment
import com.example.gallery.presentation.ui.adapters.PhotoAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class GalleryFragment :
    BaseFragment<GalleryViewModel, FragmentGalleryBinding>(R.layout.fragment_gallery) {

    override val viewModel: GalleryViewModel by viewModels()
    override val binding by viewBinding(FragmentGalleryBinding::bind)
    private val photoAdapter = PhotoAdapter(this::onItemClick)

    private fun onItemClick(photo: String) {
        findNavController().navigate(
            GalleryFragmentDirections.actionGalleryFragmentToImageDialogFragment(photo)
        )
    }

    override fun initialize() {
        binding.galleryRecView.apply {
            layoutManager = GridLayoutManager(requireContext(), 2)
            adapter = photoAdapter
        }
    }

    override fun setupSubscribers() {
        viewModel.galleryState.collectUIState(
            onError = {
                it.setupApiErrors()
            },
            onSuccess = {
                photoAdapter.submitList(it)
            }
        )
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.getPhotos().collectLatest {
                if (it.isEmpty()) {
                    viewModel.fetchPhotos()
                } else {
                    photoAdapter.submitList(it)
                }
            }
        }
    }
}