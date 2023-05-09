package com.example.book.view.adapter.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.book.databinding.ItemMyBooksBinding
import com.example.book.network.model.response.book.GetBookInfoResponse

class MyBooksAdapter : RecyclerView.Adapter<MyBooksAdapter.MyBooksViewHolder>() {

    lateinit var data : ArrayList<GetBookInfoResponse>

    inner class MyBooksViewHolder(private val binding : ItemMyBooksBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(book : GetBookInfoResponse) {
            binding.book = book
            itemView.setOnClickListener {

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyBooksViewHolder {
        val binding = ItemMyBooksBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyBooksViewHolder(binding)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: MyBooksViewHolder, position: Int) {
        holder.bind(data[position])
    }

}

