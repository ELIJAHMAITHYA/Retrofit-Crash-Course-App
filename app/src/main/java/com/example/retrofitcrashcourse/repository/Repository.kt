package com.example.retrofitcrashcourse.repository

import com.example.retrofitcrashcourse.Api.RerofitInstance
import com.example.retrofitcrashcourse.model.Post
import retrofit2.Retrofit

class Repository {
    suspend fun getPost():Post{
        return RerofitInstance.api.getPost()
    }
}