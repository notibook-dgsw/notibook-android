package com.example.book.network.response.user

import com.google.gson.annotations.SerializedName

data class GetRecommendResponse(
    @SerializedName("books")
    var books : List<String>
)
