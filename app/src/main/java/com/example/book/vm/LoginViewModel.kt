package com.example.book.vm

import android.app.Activity
import android.content.Intent
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.book.network.model.request.login.SignInRequest
import com.example.book.repository.SignRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import javax.inject.Inject

class LoginViewModel @Inject constructor(private val repository: SignRepository): ViewModel() {

    lateinit var token : String

    fun login(id : String, pw : String, activity : Activity, intent : Intent) {
        viewModelScope.launch {
            val request = SignInRequest(id,pw)
            repository.signIn(request)
                .flowOn(Dispatchers.IO)
                .catch { e -> Log.e("로그인 에러", e.stackTraceToString()) }
                .collect {
                    token = it.token
                    activity.startActivity(intent)
                }
        }
    }
}