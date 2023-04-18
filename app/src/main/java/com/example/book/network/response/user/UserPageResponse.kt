package com.example.book.network.response.user

import com.google.gson.annotations.SerializedName

data class UserPageResponse(
    @SerializedName("books")
    var books : List<BookSimpleResponse>,
    @SerializedName("login_id")
    var loginId : String,
    @SerializedName("name")
    var name : String
) {
    data class BookSimpleResponse(
        @SerializedName("all_pages")
        var allPages : Int,
        @SerializedName("author")
        var author : String,
        @SerializedName("current_page")
        var current_page : Int,
        @SerializedName("isbn")
        var isbn : String,
        @SerializedName("progress")
        var progress : Int,
        @SerializedName("started_at")
        var startedAt : String,
        @SerializedName("title")
        var title : String
    )
}
