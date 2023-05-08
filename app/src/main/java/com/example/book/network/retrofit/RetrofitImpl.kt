package com.example.book.network.retrofit

import com.example.book.network.api.BookAPI
import com.example.book.network.api.SignAPI
import com.example.book.network.api.UserAPI
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitImpl {
    private const val BASEURL = "http://ericmacbook.local:8080"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASEURL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val bookService : BookAPI = retrofit.create(BookAPI::class.java)
    val signService : SignAPI = retrofit.create(SignAPI::class.java)
    val userService : UserAPI = retrofit.create(UserAPI::class.java)
}