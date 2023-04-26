package com.example.book.network.api

import com.example.book.network.model.response.user.GetRecommendResponse
import com.example.book.network.model.response.user.UserPageResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface UserAPI {

    @GET("/user/recommend")
    suspend fun getRecommend() : Flow<GetRecommendResponse>

    @GET("/user")
    suspend fun getUser() : Flow<UserPageResponse>

}