package com.example.retrofitcrashcourse.Api

import com.example.retrofitcrashcourse.model.Post
import okhttp3.Response
import retrofit2.http.GET

interface SimpleApi {
    @GET("posts/1")
    suspend fun getPost(): retrofit2.Response<Post>
}