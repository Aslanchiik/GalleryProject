package com.example.gallery.data.utils

interface DataMapper<T> {
    fun mapToDomain(): T
}