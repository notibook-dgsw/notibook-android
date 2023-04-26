package com.example.book.network.api

import com.example.book.network.model.request.login.SignInRequest
import com.example.book.network.model.request.login.SignUpRequest
import retrofit2.http.Body
import retrofit2.http.POST

interface SignAPI {

    @POST("/auth/sign-in")
    fun signIn(@Body request : SignInRequest) : Unit

    @POST("/auth/sign-up")
    fun signUp(@Body request: SignUpRequest) : Unit

}