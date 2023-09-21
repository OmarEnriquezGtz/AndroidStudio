package com.example.eltamalito.ui.menu_pambazos

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
import com.example.eltamalito.databinding.FragmentMenuPambazosBinding
import com.example.eltamalito.ui.menu_pambazos.Menu_PambazosViewModel
import java.text.DecimalFormat

class Menu_PambazosFragment : Fragment() {

    private var _binding: FragmentMenuPambazosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val menu_pambazosViewModel =
            ViewModelProvider(this).get(Menu_PambazosViewModel::class.java)

        _binding = FragmentMenuPambazosBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val dec = DecimalFormat("'$'#,##0.00")
        val Mesaid: Int? = arguments?.getInt("Mesa")

        val i= Mesaid!!;

        val descending_pambazo: Button = binding.decreasePambazo
        descending_pambazo.tag=Mesaid

        val ascending_pambazo: Button = binding.increasePambazo
        ascending_pambazo.tag=Mesaid

        val pambazo_text : TextView = binding.integerPambazo
        val pambazo: Int = (activity as MainActivity).pambazo[i-1]
        pambazo_text.text=pambazo.toString()

        val pambazoTotal_text : TextView = binding.integerPambazotot
        val tot_pambazo: String = dec.format((activity as MainActivity).tot_pambazo[i-1])
        pambazoTotal_text.text=tot_pambazo

        val pambazoTot_text : TextView = binding.integerTotalpambazo
        pambazoTot_text.text=tot_pambazo



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}