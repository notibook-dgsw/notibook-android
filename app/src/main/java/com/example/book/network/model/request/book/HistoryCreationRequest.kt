package com.example.book.network.model.request.book

import com.google.gson.annotations.SerializedName

data class HistoryCreationRequest (
    @SerializedName("page")
    var page : Int
    )