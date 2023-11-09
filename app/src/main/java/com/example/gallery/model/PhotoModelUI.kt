package com.example.gallery.model

import com.example.gallery.domain.models.PhotoModel
import com.example.gallery.presentation.base.IBaseDiffModel

data class PhotoModelUI(
    val albumId: Int,
    override val id: Int,
    val thumbnailUrl: String,
    val title: String,
    val url: String
) : IBaseDiffModel<Int>

fun PhotoModel.toUI() = PhotoModelUI(
    albumId, id, thumbnailUrl, title, url
)