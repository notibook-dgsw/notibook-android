package com.example.book.repository

import com.example.book.network.model.StateResponse
import com.example.book.network.model.request.login.SignInRequest
import com.example.book.network.model.request.login.SignUpRequest
import com.example.book.network.model.response.login.SignInResponse
import com.example.book.network.retrofit.RetrofitImpl
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class SignRepository {
    private val retrofit = RetrofitImpl.signService

    fun signIn(request : SignInRequest) : Flow<SignInResponse> = flow {
        emit(retrofit.signIn(request))
    }

    fun signUp(request: SignUpRequest) : Flow<StateResponse> = flow {
        emit(retrofit.signUp(request))
    }
}