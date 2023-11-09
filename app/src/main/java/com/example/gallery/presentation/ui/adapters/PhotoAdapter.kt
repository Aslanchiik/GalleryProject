package com.example.gallery.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.gallery.databinding.ItemPhotoBinding
import com.example.gallery.model.PhotoModelUI
import com.example.gallery.presentation.base.BaseDiffUtilItemCallback
import com.example.gallery.presentation.extensions.loadImagesWithGlide
import com.example.gallery.presentation.extensions.setOnSingleClickListener

class PhotoAdapter(private val onItemLongClickListener: (photo: String) -> Unit) :
    ListAdapter<PhotoModelUI, PhotoAdapter.ViewHolder>(BaseDiffUtilItemCallback()) {

    inner class ViewHolder(private val binding: ItemPhotoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            itemView.setOnSingleClickListener {
                onItemLongClickListener(getItem(adapterPosition).thumbnailUrl)
            }
        }

        fun onBind(item: PhotoModelUI?) = with(binding) {
            itemImage.loadImagesWithGlide(item?.thumbnailUrl.toString(), progressBar)
            itemTxt.text = item?.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemPhotoBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }
}