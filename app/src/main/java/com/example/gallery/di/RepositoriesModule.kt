package com.example.gallery.di

import com.example.gallery.data.repositories.GalleryRepositoryImpl
import com.example.gallery.domain.reposiitories.GalleryRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {

    @Binds
    abstract fun bindGalleryRepository(
        repositoryImpl: GalleryRepositoryImpl
    ): GalleryRepository
}