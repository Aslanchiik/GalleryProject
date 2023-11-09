package com.example.gallery.data.remote.apiservices

import com.example.gallery.data.dtos.PhotoModelDto
import retrofit2.Response
import retrofit2.http.GET

interface PhotosApiService {

    @GET("photos")
    suspend fun fetchPhotos(): Response<List<PhotoModelDto>>
}