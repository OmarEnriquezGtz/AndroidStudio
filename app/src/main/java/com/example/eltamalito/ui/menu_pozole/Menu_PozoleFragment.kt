package com.example.eltamalito.ui.menu_pozole

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
import com.example.eltamalito.databinding.FragmentMenuPozoleBinding
import com.example.eltamalito.ui.menu_pozole.Menu_PozoleViewModel
import java.text.DecimalFormat

class Menu_PozoleFragment : Fragment() {

    private var _binding: FragmentMenuPozoleBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val menu_pozoleViewModel =
            ViewModelProvider(this).get(Menu_PozoleViewModel::class.java)

        _binding = FragmentMenuPozoleBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val dec = DecimalFormat("'$'#,##0.00")
        val Mesaid: Int? = arguments?.getInt("Mesa")

        val i= Mesaid!!;

        val descending_pozolepollo: Button = binding.decreasePozolepollo
        descending_pozolepollo.tag=Mesaid

        val ascending_pozolepollo: Button = binding.increasePozolepollo
        ascending_pozolepollo.tag=Mesaid

        val pozolepollo_text : TextView = binding.integerPozolepollo
        val pozolepollo: Int = (activity as MainActivity).pozole_pollo[i-1]
        pozolepollo_text.text=pozolepollo.toString()

        val pozolepolloTotal_text : TextView = binding.integerPozolepollotot
        val tot_pozolepollo: String = dec.format((activity as MainActivity).tot_pozole_pollo[i-1])
        pozolepolloTotal_text.text=tot_pozolepollo

        val descending_pozolepuerco: Button = binding.decreasePozolepuerco
        descending_pozolepuerco.tag=Mesaid

        val ascending_pozolepuerco: Button = binding.increasePozolepuerco
        ascending_pozolepuerco.tag=Mesaid

        val pozolepuerco_text : TextView = binding.integerPozolepuerco
        val pozolepuerco: Int = (activity as MainActivity).pozole_puerco[i-1]
        pozolepuerco_text.text=pozolepuerco.toString()

        val pozolepuercoTotal_text : TextView = binding.integerPozolepuercotot
        val tot_pozolepuerco: String = dec.format((activity as MainActivity).tot_pozole_puerco[i-1])
        pozolepuercoTotal_text.text=tot_pozolepuerco



        val pozoleTotal_text : TextView = binding.integerTotalpozole
        val tot_pozole: String = dec.format((activity as MainActivity).tot_pozole[i-1])
        pozoleTotal_text.text=tot_pozole

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}