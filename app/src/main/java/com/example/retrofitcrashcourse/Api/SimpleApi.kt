package com.example.retrofitcrashcourse.Api

import com.example.retrofitcrashcourse.model.Post
import retrofit2.http.GET

interface SimpleApi {
    @GET("posts/1")
    suspend fun getPost(): Post
}