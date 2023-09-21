package com.example.eltamalito.ui.inicio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.eltamalito.R
import com.example.eltamalito.databinding.FragmentInicioBinding
import com.example.eltamalito.ui.inicio.InicioViewModel
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class InicioFragment : Fragment() {

    private var _binding: FragmentInicioBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val inicioViewModel =
            ViewModelProvider(this).get(InicioViewModel::class.java)

        _binding = FragmentInicioBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textInicio
        inicioViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        val floatingButton: FloatingActionButton = binding.floatingWhatsApp
        floatingButton.getDrawable().mutate().setTintList(null)
        floatingButton.setOnClickListener {
            val phoneNumber = "+525521833186"
            val message = "Hola Omar!\nTengo problemas con la aplicación de _El Tamalito,_ ¿Me podrías ayudar?"
            sendWhatsAppMessage(phoneNumber, message)
        }

        return root
    }
    private fun sendWhatsAppMessage(phoneNumber: String, message: String) {
//

        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://api.whatsapp.com/send?phone=$phoneNumber&text=${Uri.encode(message)}")

        startActivity(intent)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}