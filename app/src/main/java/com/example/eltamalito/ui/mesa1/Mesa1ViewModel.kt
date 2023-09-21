package com.example.eltamalito.ui.mesa1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Mesa1ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "La mesa #1 está libre"
    }
    val text: LiveData<String> = _text
}