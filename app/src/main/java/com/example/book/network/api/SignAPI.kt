package com.example.book.network.api

import com.example.book.network.model.StateResponse
import com.example.book.network.model.request.login.SignInRequest
import com.example.book.network.model.request.login.SignUpRequest
import com.example.book.network.model.response.login.SignInResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface SignAPI {

    @POST("/auth/sign-in")
    suspend fun signIn(@Body request : SignInRequest) : SignInResponse

    @POST("/auth/sign-up")
    suspend fun signUp(@Body request: SignUpRequest) : StateResponse

}