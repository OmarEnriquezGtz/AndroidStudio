package com.example.eltamalito.ui.mesa2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Mesa2ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "La mesa #2 está libre"
    }
    val text: LiveData<String> = _text
}