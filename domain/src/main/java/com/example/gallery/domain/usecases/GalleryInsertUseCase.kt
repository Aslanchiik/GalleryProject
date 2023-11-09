package com.example.gallery.domain.usecases

import com.example.gallery.domain.models.PhotoModel
import com.example.gallery.domain.reposiitories.GalleryRepository
import javax.inject.Inject

class GalleryInsertUseCase @Inject constructor(
    private val repository: GalleryRepository
) {
    suspend operator fun invoke(list: List<PhotoModel>) = repository.insertAll(list)
}