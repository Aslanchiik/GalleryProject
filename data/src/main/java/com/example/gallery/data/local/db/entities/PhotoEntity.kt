package com.example.gallery.data.local.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.gallery.data.utils.DataMapper
import com.example.gallery.domain.models.PhotoModel

@Entity(tableName = "photoEntity")
data class PhotoEntity(
    val albumId: Int,
    @PrimaryKey val id: Int,
    val thumbnailUrl: String,
    val title: String,
    val url: String
) : DataMapper<PhotoModel> {
    override fun mapToDomain() = PhotoModel(
        albumId, id, thumbnailUrl, title, url
    )
}

fun PhotoModel.toEntity() = PhotoEntity(
    albumId, id, thumbnailUrl, title, url
)
