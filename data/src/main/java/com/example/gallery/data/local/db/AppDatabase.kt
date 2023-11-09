package com.example.gallery.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.gallery.data.local.db.daos.GalleryDao
import com.example.gallery.data.local.db.entities.PhotoEntity

@Database(entities = [PhotoEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun galleryDao(): GalleryDao
}