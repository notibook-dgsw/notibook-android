package com.example.book.network.request.login

import com.google.gson.annotations.SerializedName

data class SignUpRequest(
    @SerializedName("login_id")
    var loginId : String,
    @SerializedName("name")
    var name : String,
    @SerializedName("password")
    var password : String
)
