package com.example.gallery.di

import android.content.Context
import com.example.gallery.data.local.db.AppDatabase
import com.example.gallery.data.local.db.RoomClient
import com.example.gallery.data.local.db.daos.GalleryDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    val roomClient = RoomClient()

    @Singleton
    @Provides
    fun provideAppDatabase(
        @ApplicationContext context: Context
    ): AppDatabase = roomClient.provideAppDatabase(context)

    @Singleton
    @Provides
    fun provideGalleryDao(
        appDatabase: AppDatabase
    ): GalleryDao = roomClient.provideGalleryDao(appDatabase)
}