package com.example.eltamalito.ui.menu_extras

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
import com.example.eltamalito.databinding.FragmentMenuExtrasBinding
import com.example.eltamalito.ui.menu_extras.Menu_ExtrasViewModel

class Menu_ExtrasFragment : Fragment() {

    private var _binding: FragmentMenuExtrasBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val menu_extrasViewModel =
            ViewModelProvider(this).get(Menu_ExtrasViewModel::class.java)

        _binding = FragmentMenuExtrasBinding.inflate(inflater, container, false)
        val root: View = binding.root



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}