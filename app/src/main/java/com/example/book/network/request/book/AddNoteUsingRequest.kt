package com.example.book.network.request.book

import com.google.gson.annotations.SerializedName

data class AddNoteUsingRequest (
    @SerializedName("content")
    var content : String,
    @SerializedName("page")
    var page : Int
    )