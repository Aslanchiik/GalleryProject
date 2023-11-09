package com.example.gallery.data.dtos

import com.example.gallery.data.utils.DataMapper
import com.example.gallery.domain.models.PhotoModel
import com.google.gson.annotations.SerializedName

data class PhotoModelDto(
    @SerializedName("albumId") val albumId: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("thumbnailUrl") val thumbnailUrl: String,
    @SerializedName("title") val title: String,
    @SerializedName("url") val url: String
) : DataMapper<PhotoModel> {
    override fun mapToDomain() = PhotoModel(
        albumId, id, thumbnailUrl, title, url
    )
}
