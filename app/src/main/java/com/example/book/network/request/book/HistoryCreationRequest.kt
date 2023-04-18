package com.example.book.network.request.book

import com.google.gson.annotations.SerializedName

data class HistoryCreationRequest (
    @SerializedName("page")
    var page : Int
    )