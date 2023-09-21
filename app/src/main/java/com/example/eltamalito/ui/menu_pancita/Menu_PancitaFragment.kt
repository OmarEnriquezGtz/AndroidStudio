package com.example.eltamalito.ui.menu_pancita

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.eltamalito.MainActivity
import com.example.eltamalito.R
import com.example.eltamalito.databinding.FragmentMenuPancitaBinding
import com.example.eltamalito.ui.menu_pancita.Menu_PancitaViewModel
import java.text.DecimalFormat

class Menu_PancitaFragment : Fragment() {

    private var _binding: FragmentMenuPancitaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val menu_papancitaViewModel =
            ViewModelProvider(this).get(Menu_PancitaViewModel::class.java)

        _binding = FragmentMenuPancitaBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val dec = DecimalFormat("'$'#,##0.00")
        val Mesaid: Int? = arguments?.getInt("Mesa")

        val i= Mesaid!!;

        val descending_pancita: Button = binding.decreasePancita
        descending_pancita.tag=Mesaid

        val ascending_pancita: Button = binding.increasePancita
        ascending_pancita.tag=Mesaid

        val pancita_text : TextView = binding.integerPancita
        val pancita: Int = (activity as MainActivity).pancita[i-1]
        pancita_text.text=pancita.toString()

        val pancitaTotal_text : TextView = binding.integerPancitatot
        val tot_pancita: String = dec.format((activity as MainActivity).tot_pancita[i-1])
        pancitaTotal_text.text=tot_pancita

        val pancitaTot_text : TextView = binding.integerTotalpancita
        pancitaTot_text.text=tot_pancita



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}