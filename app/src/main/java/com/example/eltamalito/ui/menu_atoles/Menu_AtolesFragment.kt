package com.example.eltamalito.ui.menu_atoles

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
import com.example.eltamalito.databinding.FragmentMenuAtolesBinding
import com.example.eltamalito.ui.menu_atoles.Menu_AtolesViewModel
import java.text.DecimalFormat

class Menu_AtolesFragment : Fragment() {

    private var _binding: FragmentMenuAtolesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val menu_atolesViewModel =
            ViewModelProvider(this).get(Menu_AtolesViewModel::class.java)

        _binding = FragmentMenuAtolesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val dec = DecimalFormat("'$'#,##0.00")
        val Mesaid: Int? = arguments?.getInt("Mesa")

        val i= Mesaid!!;

        val descending_solo_chico: Button = binding.decreaseSoloChico
        descending_solo_chico.tag=Mesaid

        val ascending_solo_chico: Button = binding.increaseSoloChico
        ascending_solo_chico.tag=Mesaid

        val descending_solo_mediano: Button = binding.decreaseSoloMediano
        descending_solo_mediano.tag=Mesaid

        val ascending_solo_mediano: Button = binding.increaseSoloMediano
        ascending_solo_mediano.tag=Mesaid

        val descending_solo_grande: Button = binding.decreaseSoloGrande
        descending_solo_grande.tag=Mesaid

        val ascending_solo_grande: Button = binding.increaseSoloGrande
        ascending_solo_grande.tag=Mesaid

        val descending_crema_chico: Button = binding.decreaseCremaChico
        descending_crema_chico.tag=Mesaid

        val ascending_crema_chico: Button = binding.increaseCremaChico
        ascending_crema_chico.tag=Mesaid

        val descending_crema_mediano: Button = binding.decreaseCremaMediano
        descending_crema_mediano.tag=Mesaid

        val ascending_crema_mediano: Button = binding.increaseCremaMediano
        ascending_crema_mediano.tag=Mesaid

        val descending_crema_grande: Button = binding.decreaseCremaGrande
        descending_crema_grande.tag=Mesaid

        val ascending_crema_grande: Button = binding.increaseCremaGrande
        ascending_crema_grande.tag=Mesaid

        val descending_arroz_chico: Button = binding.decreaseArrozChico
        descending_arroz_chico.tag=Mesaid

        val ascending_arroz_chico: Button = binding.increaseArrozChico
        ascending_arroz_chico.tag=Mesaid

        val descending_arroz_mediano: Button = binding.decreaseArrozMediano
        descending_arroz_mediano.tag=Mesaid

        val ascending_arroz_mediano: Button = binding.increaseArrozMediano
        ascending_arroz_mediano.tag=Mesaid

        val descending_arroz_grande: Button = binding.decreaseArrozGrande
        descending_arroz_grande.tag=Mesaid

        val ascending_arroz_grande: Button = binding.increaseArrozGrande
        ascending_arroz_grande.tag=Mesaid

        val descending_chocolate_chico: Button = binding.decreaseChocolateChico
        descending_chocolate_chico.tag=Mesaid

        val ascending_chocolate_chico: Button = binding.increaseChocolateChico
        ascending_chocolate_chico.tag=Mesaid

        val descending_chocolate_mediano: Button = binding.decreaseChocolateMediano
        descending_chocolate_mediano.tag=Mesaid

        val ascending_chocolate_mediano: Button = binding.increaseChocolateMediano
        ascending_chocolate_mediano.tag=Mesaid

        val descending_chocolate_grande: Button = binding.decreaseChocolateGrande
        descending_chocolate_grande.tag=Mesaid

        val ascending_chocolate_grande: Button = binding.increaseChocolateGrande
        ascending_chocolate_grande.tag=Mesaid



        val solo_chico_text : TextView = binding.integerSoloChico
        val solo_chico: Int = (activity as MainActivity).solo_chico[i-1]
        solo_chico_text.text=solo_chico.toString()

        val solo_chicoTotal_text : TextView = binding.integerSoloChicotot
        val tot_solo_chico: String = dec.format((activity as MainActivity).tot_solo_chico[i-1])
        solo_chicoTotal_text.text=tot_solo_chico

        val solo_mediano_text : TextView = binding.integerSoloMediano
        val solo_mediano: Int = (activity as MainActivity).solo_mediano[i-1]
        solo_mediano_text.text=solo_mediano.toString()

        val solo_medianoTotal_text : TextView = binding.integerSoloMedianotot
        val tot_solo_mediano: String = dec.format((activity as MainActivity).tot_solo_mediano[i-1])
        solo_medianoTotal_text.text=tot_solo_mediano

        val solo_grande_text : TextView = binding.integerSoloGrande
        val solo_grande: Int = (activity as MainActivity).solo_grande[i-1]
        solo_grande_text.text=solo_grande.toString()

        val solo_grandeTotal_text : TextView = binding.integerSoloGrandetot
        val tot_solo_grande: String = dec.format((activity as MainActivity).tot_solo_grande[i-1])
        solo_grandeTotal_text.text=tot_solo_grande

        val crema_chico_text : TextView = binding.integerCremaChico
        val crema_chico: Int = (activity as MainActivity).crema_chico[i-1]
        crema_chico_text.text=crema_chico.toString()

        val crema_chicoTotal_text : TextView = binding.integerCremaChicotot
        val tot_crema_chico: String = dec.format((activity as MainActivity).tot_crema_chico[i-1])
        crema_chicoTotal_text.text=tot_crema_chico

        val crema_mediano_text : TextView = binding.integerCremaMediano
        val crema_mediano: Int = (activity as MainActivity).crema_mediano[i-1]
        crema_mediano_text.text=crema_mediano.toString()

        val crema_medianoTotal_text : TextView = binding.integerCremaMedianotot
        val tot_crema_mediano: String = dec.format((activity as MainActivity).tot_crema_mediano[i-1])
        crema_medianoTotal_text.text=tot_crema_mediano

        val crema_grande_text : TextView = binding.integerCremaGrande
        val crema_grande: Int = (activity as MainActivity).crema_grande[i-1]
        crema_grande_text.text=crema_grande.toString()

        val crema_grandeTotal_text : TextView = binding.integerCremaGrandetot
        val tot_crema_grande: String = dec.format((activity as MainActivity).tot_crema_grande[i-1])
        crema_grandeTotal_text.text=tot_crema_grande

        val arroz_chico_text : TextView = binding.integerArrozChico
        val arroz_chico: Int = (activity as MainActivity).arroz_chico[i-1]
        arroz_chico_text.text=arroz_chico.toString()

        val arroz_chicoTotal_text : TextView = binding.integerArrozChicotot
        val tot_arroz_chico: String = dec.format((activity as MainActivity).tot_arroz_chico[i-1])
        arroz_chicoTotal_text.text=tot_arroz_chico

        val arroz_mediano_text : TextView = binding.integerArrozMediano
        val arroz_mediano: Int = (activity as MainActivity).arroz_mediano[i-1]
        arroz_mediano_text.text=arroz_mediano.toString()

        val arroz_medianoTotal_text : TextView = binding.integerArrozMedianotot
        val tot_arroz_mediano: String = dec.format((activity as MainActivity).tot_arroz_mediano[i-1])
        arroz_medianoTotal_text.text=tot_arroz_mediano

        val arroz_grande_text : TextView = binding.integerArrozGrande
        val arroz_grande: Int = (activity as MainActivity).arroz_grande[i-1]
        arroz_grande_text.text=arroz_grande.toString()

        val arroz_grandeTotal_text : TextView = binding.integerArrozGrandetot
        val tot_arroz_grande: String = dec.format((activity as MainActivity).tot_arroz_grande[i-1])
        arroz_grandeTotal_text.text=tot_arroz_grande

        val chocolate_chico_text : TextView = binding.integerChocolateChico
        val chocolate_chico: Int = (activity as MainActivity).chocolate_chico[i-1]
        chocolate_chico_text.text=chocolate_chico.toString()

        val chocolate_chicoTotal_text : TextView = binding.integerChocolateChicotot
        val tot_chocolate_chico: String = dec.format((activity as MainActivity).tot_chocolate_chico[i-1])
        chocolate_chicoTotal_text.text=tot_chocolate_chico

        val chocolate_mediano_text : TextView = binding.integerChocolateMediano
        val chocolate_mediano: Int = (activity as MainActivity).chocolate_mediano[i-1]
        chocolate_mediano_text.text=chocolate_mediano.toString()

        val chocolate_medianoTotal_text : TextView = binding.integerChocolateMedianotot
        val tot_chocolate_mediano: String = dec.format((activity as MainActivity).tot_chocolate_mediano[i-1])
        chocolate_medianoTotal_text.text=tot_chocolate_mediano

        val chocolate_grande_text : TextView = binding.integerChocolateGrande
        val chocolate_grande: Int = (activity as MainActivity).chocolate_grande[i-1]
        chocolate_grande_text.text=chocolate_grande.toString()

        val chocolate_grandeTotal_text : TextView = binding.integerChocolateGrandetot
        val tot_chocolate_grande: String = dec.format((activity as MainActivity).tot_chocolate_grande[i-1])
        chocolate_grandeTotal_text.text=tot_chocolate_grande


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}