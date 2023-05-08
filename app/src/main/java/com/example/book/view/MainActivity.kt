package com.example.book.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.book.R
import com.example.book.databinding.ActivityMainBinding
import com.example.book.view.adapter.recyclerview.MyBooksAdapter
import com.example.book.vm.MyBooksViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var viewModel : MyBooksViewModel
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.mybooks = viewModel
        binding.lifecycleOwner = this

        binding.myBooks.adapter = MyBooksAdapter()


    }
}