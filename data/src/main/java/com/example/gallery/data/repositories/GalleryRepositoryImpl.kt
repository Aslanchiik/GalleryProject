package com.example.gallery.data.repositories

import com.example.gallery.data.base.BaseRepository
import com.example.gallery.data.local.db.daos.GalleryDao
import com.example.gallery.data.local.db.entities.toEntity
import com.example.gallery.data.remote.apiservices.PhotosApiService
import com.example.gallery.domain.models.PhotoModel
import com.example.gallery.domain.reposiitories.GalleryRepository
import javax.inject.Inject

class GalleryRepositoryImpl @Inject constructor(
    private val photosApiService: PhotosApiService,
    private val galleryDao: GalleryDao
) : BaseRepository(), GalleryRepository {

    override fun fetchPhotos() = doNetworkRequestForList {
        photosApiService.fetchPhotos()
    }

    override fun gePhotos() = doLocalRequestForList {
        galleryDao.getGallery()
    }

    override suspend fun insertAll(photos: List<PhotoModel>) {
        galleryDao.insertAll(photos.map { it.toEntity() })
    }
}