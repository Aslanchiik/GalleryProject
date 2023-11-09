package com.example.gallery.presentation.ui.fragments

import androidx.lifecycle.viewModelScope
import com.example.gallery.domain.usecases.GalleryGetUseCase
import com.example.gallery.domain.usecases.GalleryInsertUseCase
import com.example.gallery.domain.usecases.GalleryUseCase
import com.example.gallery.model.PhotoModelUI
import com.example.gallery.model.toUI
import com.example.gallery.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GalleryViewModel @Inject constructor(
    private val galleryUseCase: GalleryUseCase,
    private val galleryGetUseCase: GalleryGetUseCase,
    private val galleryInsertUseCase: GalleryInsertUseCase
) : BaseViewModel() {

    private val _galleryState = MutableUIStateFlow<List<PhotoModelUI>>()
    val galleryState = _galleryState.asStateFlow()

    fun fetchPhotos() {
        galleryUseCase().collectRequest(_galleryState) {
            viewModelScope.launch {
                galleryInsertUseCase(it)
            }
            it.map { item ->
                item.toUI()
            }
        }
    }

    fun getPhotos() =
        galleryGetUseCase().collectLocalRequestForList {
            it.toUI()
        }

}