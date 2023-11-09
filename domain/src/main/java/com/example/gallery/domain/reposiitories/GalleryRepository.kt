package com.example.gallery.domain.reposiitories

import com.example.gallery.domain.models.PhotoModel
import com.example.gallery.domain.utils.RemoteWrapper
import kotlinx.coroutines.flow.Flow

interface GalleryRepository {

    fun fetchPhotos(): RemoteWrapper<List<PhotoModel>>

    fun gePhotos(): Flow<List<PhotoModel>>
    suspend fun insertAll(photos: List<PhotoModel>)

}