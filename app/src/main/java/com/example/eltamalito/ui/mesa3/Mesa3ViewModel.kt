package com.example.eltamalito.ui.mesa3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Mesa3ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "La mesa #3 está libre"
    }
    val text: LiveData<String> = _text
}