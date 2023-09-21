package com.example.eltamalito.ui.mesa5

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Mesa5ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "La mesa #5 está libre"
    }
    val text: LiveData<String> = _text
}