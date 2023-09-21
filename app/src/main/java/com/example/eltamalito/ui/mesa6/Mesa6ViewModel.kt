package com.example.eltamalito.ui.mesa6

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Mesa6ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "La mesa #6 está libre"
    }
    val text: LiveData<String> = _text
}