package com.example.book.network.model.response.book

import com.google.gson.annotations.SerializedName

data class GetQuizResponse(
    @SerializedName("answer")
    var answer : String,
    @SerializedName("question")
    var question : String
)
