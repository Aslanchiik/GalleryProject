package com.example.gallery.domain.models

data class PhotoModel(
    val albumId: Int,
    val id: Int,
    val thumbnailUrl: String,
    val title: String,
    val url: String
)