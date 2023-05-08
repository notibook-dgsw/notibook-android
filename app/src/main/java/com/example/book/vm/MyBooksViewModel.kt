package com.example.book.vm

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.book.network.model.response.book.GetBookInfoResponse
import com.example.book.repository.BookRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import javax.inject.Inject

class MyBooksViewModel @Inject constructor(private val repository: BookRepository) : ViewModel() {

    val isbn = "test"

    private lateinit var _books : MutableStateFlow<GetBookInfoResponse>
    val books get() = _books

    private fun getBook() {
        viewModelScope.launch {
            repository.getBookInfo(isbn)
                .flowOn(Dispatchers.IO)
                .catch { e ->
                    Log.e("책 가져오기 에러", e.stackTrace.toString())
                }
                .collect {
                    _books = MutableStateFlow(it)
                }
        }
    }
}