package com.example.book.network.model.request.login

import com.google.gson.annotations.SerializedName

data class SignInRequest(
    @SerializedName("login_id") var loginId : String,
    @SerializedName("password") var password : String
    )
