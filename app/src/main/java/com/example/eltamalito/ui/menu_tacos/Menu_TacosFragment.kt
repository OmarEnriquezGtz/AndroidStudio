package com.example.eltamalito.ui.menu_tacos

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
import com.example.eltamalito.databinding.FragmentMenuTacosBinding
import com.example.eltamalito.ui.menu_tacos.Menu_TacosViewModel
import java.text.DecimalFormat

class Menu_TacosFragment : Fragment() {

    private var _binding: FragmentMenuTacosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val menu_tacosViewModel =
            ViewModelProvider(this).get(Menu_TacosViewModel::class.java)

        _binding = FragmentMenuTacosBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val dec = DecimalFormat("'$'#,##0.00")
        val Mesaid: Int? = arguments?.getInt("Mesa")

        val i= Mesaid!!;

        val descending_tacos: Button = binding.decreaseTacos
        descending_tacos.tag=Mesaid

        val ascending_tacos: Button = binding.increaseTacos
        ascending_tacos.tag=Mesaid

        val tacos_text : TextView = binding.integerTacos
        val tacos: Int = (activity as MainActivity).tacos[i-1]
        tacos_text.text=tacos.toString()

        val tacosTotal_text : TextView = binding.integerTacostot
        val tot_tacos: String = dec.format((activity as MainActivity).tot_tacos[i-1])
        tacosTotal_text.text=tot_tacos

        val tacosTot_text : TextView = binding.integerTotaltacos
        tacosTot_text.text=tot_tacos




        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}