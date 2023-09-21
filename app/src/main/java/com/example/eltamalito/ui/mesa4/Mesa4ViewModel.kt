package com.example.eltamalito.ui.mesa4

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Mesa4ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "La mesa #4 está libre"
    }
    val text: LiveData<String> = _text
}