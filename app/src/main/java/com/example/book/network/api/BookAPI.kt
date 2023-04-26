package com.example.book.network.api

import com.example.book.network.model.request.book.AddNoteUsingRequest
import com.example.book.network.model.request.book.EditNoteRequest
import com.example.book.network.model.request.book.HistoryCreationRequest
import com.example.book.network.model.response.book.GetBookInfoResponse
import com.example.book.network.model.response.book.GetQuizResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path

interface BookAPI {
    @POST("/books/{isbn}/history")
    fun createHistory(@Path("isbn") isbn : String, @Body request: HistoryCreationRequest) : Unit

    @DELETE("/books/{isbn}/note/{page}")
    fun deleteNote(@Path("isbn") isbn:String, @Path("page") page : Int) : Unit

    @PATCH("/books/{isbn}/note/{page}")
    fun editNote(@Path("isbn") isbn:String, @Path("page") page: Int, @Body request : EditNoteRequest) : Unit

    @POST("/books/{isbn}/note")
    fun addNote(@Path("isbn") isbn: String, @Body request: AddNoteUsingRequest) : Unit

    @GET("/books/{isbn}")
    suspend fun getBookInfo(@Path("isbn") isbn: String) : Flow<GetBookInfoResponse>

    @GET("/books/{isbn}/quiz")
    suspend fun getQuiz(@Path("isbn") isbn: String) : Flow<GetQuizResponse>
}