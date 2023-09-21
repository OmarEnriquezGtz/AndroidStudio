package com.example.eltamalito.ui.mesa7

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Mesa7ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "La mesa #7 está libre"
    }
    val text: LiveData<String> = _text
}