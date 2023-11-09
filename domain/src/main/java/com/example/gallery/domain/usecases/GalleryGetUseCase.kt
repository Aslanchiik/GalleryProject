package com.example.gallery.domain.usecases

import com.example.gallery.domain.reposiitories.GalleryRepository
import javax.inject.Inject

class GalleryGetUseCase @Inject constructor(
    private val repository: GalleryRepository
){
    operator fun invoke() = repository.gePhotos()
}