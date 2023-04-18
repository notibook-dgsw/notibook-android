package com.example.book.network.request.book

import com.google.gson.annotations.SerializedName

data class EditNoteRequest(
    @SerializedName("content")
    var content: String
)
