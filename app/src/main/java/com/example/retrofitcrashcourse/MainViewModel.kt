package com.example.retrofitcrashcourse

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitcrashcourse.model.Post
import com.example.retrofitcrashcourse.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository) : ViewModel() {
    fun getPost() {
        val myResponse: MutableLiveData<Post> = MutableLiveData()
        viewModelScope.launch {
            val response:Post = repository.getPost()
            myResponse.value = response
        }
    }
}