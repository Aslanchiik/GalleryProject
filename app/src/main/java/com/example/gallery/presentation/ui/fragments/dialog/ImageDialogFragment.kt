package com.example.gallery.presentation.ui.fragments.dialog

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.gallery.databinding.FragmentImageDialogBinding
import dagger.hilt.android.AndroidEntryPoint

@Suppress("UNREACHABLE_CODE")
@AndroidEntryPoint
class ImageDialogFragment : DialogFragment() {

    private lateinit var binding: FragmentImageDialogBinding
    private val args by navArgs<ImageDialogFragmentArgs>()

    @SuppressLint("UseGetLayoutInflater")
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        binding = FragmentImageDialogBinding.inflate(LayoutInflater.from(requireContext()))
        val dialog = AlertDialog.Builder(requireContext()).setView(binding.root).create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        initialize()
        return dialog
    }

    private fun initialize() {
        Glide.with(binding.imageDialog).load(args.photo).into(binding.imageDialog)
    }
}