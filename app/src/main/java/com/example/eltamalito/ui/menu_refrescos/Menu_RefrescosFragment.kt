package com.example.eltamalito.ui.menu_refrescos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.eltamalito.R
import com.example.eltamalito.databinding.FragmentMenuRefrescosBinding
import com.example.eltamalito.ui.menu_refrescos.Menu_RefrescosViewModel

class Menu_RefrescosFragment : Fragment() {

    private var _binding: FragmentMenuRefrescosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val menu_refrescosViewModel =
            ViewModelProvider(this).get(Menu_RefrescosViewModel::class.java)

        _binding = FragmentMenuRefrescosBinding.inflate(inflater, container, false)
        val root: View = binding.root



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}