package com.example.eltamalito.ui.menu_huaraches

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
import com.example.eltamalito.databinding.FragmentMenuHuarachesBinding
import com.example.eltamalito.ui.menu_huaraches.Menu_HuarachesViewModel
import java.text.DecimalFormat

class Menu_HuarachesFragment : Fragment() {

    private var _binding: FragmentMenuHuarachesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val menu_huarachesViewModel =
            ViewModelProvider(this).get(Menu_HuarachesViewModel::class.java)

        _binding = FragmentMenuHuarachesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val dec = DecimalFormat("'$'#,##0.00")
        val Mesaid: Int? = arguments?.getInt("Mesa")

        val i= Mesaid!!;

        val descending_huara_sencillos: Button = binding.decreaseHuaraSencillos
        descending_huara_sencillos.tag=Mesaid

        val ascending_huara_sencillos: Button = binding.increaseHuaraSencillos
        ascending_huara_sencillos.tag=Mesaid

        val descending_huara_pollo: Button = binding.decreaseHuaraPollo
        descending_huara_pollo.tag=Mesaid

        val ascending_huara_pollo: Button = binding.increaseHuaraPollo
        ascending_huara_pollo.tag=Mesaid

        val descending_huara_bistec: Button = binding.decreaseHuaraBistec
        descending_huara_bistec.tag=Mesaid

        val ascending_huara_bistec: Button = binding.increaseHuaraBistec
        ascending_huara_bistec.tag=Mesaid

        val descending_huara_huevo: Button = binding.decreaseHuaraHuevo
        descending_huara_huevo.tag=Mesaid

        val ascending_huara_huevo: Button = binding.increaseHuaraHuevo
        ascending_huara_huevo.tag=Mesaid


        val huara_sencillos_text : TextView = binding.integerHuaraSencillos
        val huara_sencillos: Int = (activity as MainActivity).huara_sencillos[i-1]
        huara_sencillos_text.text=huara_sencillos.toString()

        val huara_sencillosTotal_text : TextView = binding.integerHuaraSencillostot
        val tot_huara_sencillos: String = dec.format((activity as MainActivity).tot_huara_sencillos[i-1])
        huara_sencillosTotal_text.text=tot_huara_sencillos

        val huara_pollo_text : TextView = binding.integerHuaraPollo
        val huara_pollo: Int = (activity as MainActivity).huara_pollo[i-1]
        huara_pollo_text.text=huara_pollo.toString()

        val huara_polloTotal_text : TextView = binding.integerHuaraPollotot
        val tot_huara_pollo: String = dec.format((activity as MainActivity).tot_huara_pollo[i-1])
        huara_polloTotal_text.text=tot_huara_pollo

        val huara_bistec_text : TextView = binding.integerHuaraBistec
        val huara_bistec: Int = (activity as MainActivity).huara_bistec[i-1]
        huara_bistec_text.text=huara_bistec.toString()

        val huara_bistecTotal_text : TextView = binding.integerHuaraBistectot
        val tot_huara_bistec: String = dec.format((activity as MainActivity).tot_huara_bistec[i-1])
        huara_bistecTotal_text.text=tot_huara_bistec

        val huara_huevo_text : TextView = binding.integerHuaraHuevo
        val huara_huevo: Int = (activity as MainActivity).huara_huevo[i-1]
        huara_huevo_text.text=huara_huevo.toString()

        val huara_huevoTotal_text : TextView = binding.integerHuaraHuevotot
        val tot_huara_huevo: String = dec.format((activity as MainActivity).tot_huara_huevo[i-1])
        huara_huevoTotal_text.text=tot_huara_huevo


        val TotalHuaraches_text : TextView = binding.integerTotalhuaraches
        val tot_huaraches: String = dec.format((activity as MainActivity).tot_huaraches[i-1])
        TotalHuaraches_text.text=tot_huaraches




        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}