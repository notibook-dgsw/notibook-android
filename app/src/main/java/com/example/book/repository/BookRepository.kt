package com.example.book.repository

import com.example.book.network.model.response.book.GetBookInfoResponse
import com.example.book.network.retrofit.RetrofitImpl
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class BookRepository {
    private val retrofit = RetrofitImpl.bookService

    suspend fun getBookInfo(isbn : String) : Flow<GetBookInfoResponse> = flow {
        emit(retrofit.getBookInfo(isbn))
    }
}