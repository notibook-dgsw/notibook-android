package com.example.book.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.book.R
import com.example.book.databinding.ActivityLoginBinding
import com.example.book.vm.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {

    lateinit var signUpIntent : Intent
    lateinit var mainIntent : Intent

    @Inject lateinit var viewmodel : LoginViewModel
    lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        signUpIntent = Intent(this, SignUpActivity::class.java)
        mainIntent = Intent(this, MainActivity::class.java)
        binding.viewmodel = viewmodel
        binding.activity = this
        binding.lifecycleOwner = this


    }
}