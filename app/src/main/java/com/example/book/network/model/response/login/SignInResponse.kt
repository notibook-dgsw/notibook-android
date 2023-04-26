package com.example.book.network.model.response.login

import com.google.gson.annotations.SerializedName

data class SignInResponse (
    @SerializedName("access_token")
    var token : String
)