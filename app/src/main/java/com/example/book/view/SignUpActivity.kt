package com.example.book.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.book.R
import com.example.book.databinding.ActivitySignUpBinding
import com.example.book.vm.SignUpViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SignUpActivity : AppCompatActivity() {

    private val binding : ActivitySignUpBinding by lazy { ActivitySignUpBinding.inflate(layoutInflater) }
    @Inject lateinit var model : SignUpViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.activity = this
        binding.model = model
    }
}