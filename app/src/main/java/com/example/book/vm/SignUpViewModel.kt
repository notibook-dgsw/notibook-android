package com.example.book.vm

import android.app.Activity
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.book.network.model.request.login.SignUpRequest
import com.example.book.repository.SignRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import javax.inject.Inject

class SignUpViewModel @Inject constructor(private val repository: SignRepository) : ViewModel() {

    fun signUp(id : String, name : String, pw : String, activity : Activity) {
        viewModelScope.launch {
            val request = SignUpRequest(id,name,pw)
            repository.signUp(request)
                .flowOn(Dispatchers.IO)
                .catch { e -> Log.e("회원가입 에러", e.stackTraceToString()) }
                .collect {
                    if (it.status == 201) activity.finish()
                    else Log.e("status", it.status.toString())
                }
        }
    }

}