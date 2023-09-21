package com.example.eltamalito.ui.inicio

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InicioViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "''Oh tamal de fina masa mantecada\n"+
                "Que me aumentas la lonja, el cachete y la papada\n" +
                "Eres más que un copo suculento\n" +
                "en hojas de maiz envuelto\n" +
                "Eres tradición, compañía y recuerdo\n" +
                "Ya sea solito o con un bolillito\n" +
                "con un champurrado o rico atolito.\n" +
                "A quién no le gusta que le arrimen el tamalito?\n" +
                "Los muy fufurufos te piden gurmet.\n" +
                "Los cuates del barrio te comen de pie.\n" +
                "Ya sea en familia o en la soledad.\n" +
                "No hay quién se resista al sabor de un Buen Tamal.''\n"
    }
    val text: LiveData<String> = _text
}