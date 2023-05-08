package com.example.book.view.adapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.book.network.model.response.book.GetBookInfoResponse
import com.example.book.view.adapter.recyclerview.MyBooksAdapter
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.toList

@BindingAdapter("app:items")
fun bindRecyclerView(
    recyclerView: RecyclerView,
    data : StateFlow<GetBookInfoResponse>
) {
    val adapter = recyclerView.adapter as MyBooksAdapter
    val list = ArrayList<GetBookInfoResponse>()
    data.map { list.add(it) }
    adapter.data = list
}