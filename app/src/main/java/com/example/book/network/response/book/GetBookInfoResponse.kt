package com.example.book.network.response.book

import com.google.gson.annotations.SerializedName

data class GetBookInfoResponse(
    @SerializedName("all_pages")
    var allPages : Int,
    @SerializedName("author")
    var author : String,
    @SerializedName("current_page")
    var currentPage : Int,
    @SerializedName("history")
    var history : List<HistoryResponse>,
    @SerializedName("isbn")
    var isbn : String,
    @SerializedName("notes")
    var notes : List<NoteResponse>,
    @SerializedName("progress")
    var progress : Int,
    @SerializedName("started_at")
    var startedAt : String,
    @SerializedName("summary")
    var summary : String,
    @SerializedName("title")
    var title : String
) {
    data class HistoryResponse (
        @SerializedName("created_at")
        var createdAt : String,
        @SerializedName("page")
        var page : Int
    )
    data class NoteResponse (
        @SerializedName("content")
        var content : String,
        @SerializedName("created_at")
        var createdAt : String,
        @SerializedName("modified_at")
        var modifiedAt : String,
        @SerializedName("page")
        var page : Int
    )
}
