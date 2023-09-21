package com.example.eltamalito.ui.menu_chilaquiles

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
import com.example.eltamalito.databinding.FragmentMenuChilaquilesBinding
import com.example.eltamalito.ui.menu_chilaquiles.Menu_ChilaquilesViewModel
import java.text.DecimalFormat

class Menu_ChilaquilesFragment : Fragment() {

    private var _binding: FragmentMenuChilaquilesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val menu_chilaquilesViewModel =
            ViewModelProvider(this).get(Menu_ChilaquilesViewModel::class.java)

        _binding = FragmentMenuChilaquilesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val dec = DecimalFormat("'$'#,##0.00")
        val Mesaid: Int? = arguments?.getInt("Mesa")

        val i= Mesaid!!;

        val descending_chila_sencillos: Button = binding.decreaseChilaSencillos
        descending_chila_sencillos.tag=Mesaid

        val ascending_chila_sencillos: Button = binding.increaseChilaSencillos
        ascending_chila_sencillos.tag=Mesaid

        val descending_chila_pollo: Button = binding.decreaseChilaPollo
        descending_chila_pollo.tag=Mesaid

        val ascending_chila_pollo: Button = binding.increaseChilaPollo
        ascending_chila_pollo.tag=Mesaid

        val descending_chila_bistec: Button = binding.decreaseChilaBistec
        descending_chila_bistec.tag=Mesaid

        val ascending_chila_bistec: Button = binding.increaseChilaBistec
        ascending_chila_bistec.tag=Mesaid

        val descending_chila_huevo: Button = binding.decreaseChilaHuevo
        descending_chila_huevo.tag=Mesaid

        val ascending_chila_huevo: Button = binding.increaseChilaHuevo
        ascending_chila_huevo.tag=Mesaid

        val descending_crema: Button = binding.decreaseCrema
        descending_crema.tag=Mesaid

        val ascending_crema: Button = binding.increaseCrema
        ascending_crema.tag=Mesaid

        val descending_Bolillo2: Button = binding.decreaseBolillo2
        descending_Bolillo2.tag=Mesaid

        val ascending_Bolillo2: Button = binding.increaseBolillo2
        ascending_Bolillo2.tag=Mesaid

        val chila_sencillos_text : TextView = binding.integerChilaSencillos
        val chila_sencillos: Int = (activity as MainActivity).chila_sencillos[i-1]
        chila_sencillos_text.text=chila_sencillos.toString()

        val chila_sencillosTotal_text : TextView = binding.integerChilaSencillostot
        val tot_chila_sencillos: String = dec.format((activity as MainActivity).tot_chila_sencillos[i-1])
        chila_sencillosTotal_text.text=tot_chila_sencillos

        val chila_pollo_text : TextView = binding.integerChilaPollo
        val chila_pollo: Int = (activity as MainActivity).chila_pollo[i-1]
        chila_pollo_text.text=chila_pollo.toString()

        val chila_polloTotal_text : TextView = binding.integerChilaPollotot
        val tot_chila_pollo: String = dec.format((activity as MainActivity).tot_chila_pollo[i-1])
        chila_polloTotal_text.text=tot_chila_pollo

        val chila_bistec_text : TextView = binding.integerChilaBistec
        val chila_bistec: Int = (activity as MainActivity).chila_bistec[i-1]
        chila_bistec_text.text=chila_bistec.toString()

        val chila_bistecTotal_text : TextView = binding.integerChilaBistectot
        val tot_chila_bistec: String = dec.format((activity as MainActivity).tot_chila_bistec[i-1])
        chila_bistecTotal_text.text=tot_chila_bistec

        val chila_huevo_text : TextView = binding.integerChilaHuevo
        val chila_huevo: Int = (activity as MainActivity).chila_huevo[i-1]
        chila_huevo_text.text=chila_huevo.toString()

        val chila_huevoTotal_text : TextView = binding.integerChilaHuevotot
        val tot_chila_huevo: String = dec.format((activity as MainActivity).tot_chila_huevo[i-1])
        chila_huevoTotal_text.text=tot_chila_huevo

        val crema_text : TextView = binding.integerCrema
        val crema: Int = (activity as MainActivity).crema[i-1]
        crema_text.text=crema.toString()

        val cremaTotal_text : TextView = binding.integerCrematot
        val tot_crema: String = dec.format((activity as MainActivity).tot_crema[i-1])
        cremaTotal_text.text=tot_crema

        val bolillo2_text : TextView = binding.integerBolillo2
        val bolillo2: Int = (activity as MainActivity).bolillo2[i-1]
        bolillo2_text.text=bolillo2.toString()

        val bolillo2Total_text : TextView = binding.integerBolillo2tot
        val tot_bolillo2: String = dec.format((activity as MainActivity).tot_bolillo2[i-1])
        bolillo2Total_text.text=tot_bolillo2

        val TotalChilaquiles_text : TextView = binding.integerTotalchilaquiles
        val tot_chilaquiles: String = dec.format((activity as MainActivity).tot_chilaquiles[i-1])
        TotalChilaquiles_text.text=tot_chilaquiles




        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}