package com.example.eltamalito.ui.menu_tamales

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.eltamalito.MainActivity
import com.example.eltamalito.databinding.FragmentMenuTamalesBinding
import org.w3c.dom.Text
import java.text.DecimalFormat

class Menu_TamalesFragment : Fragment() {

    private var _binding: FragmentMenuTamalesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val menu_tamalesViewModel =
            ViewModelProvider(this).get(Menu_TamalesViewModel::class.java)

        _binding = FragmentMenuTamalesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val dec = DecimalFormat("'$'#,##0.00")
        val Mesaid: Int? = arguments?.getInt("Mesa")

        val i= Mesaid!!;

        val descending_verde: Button = binding.decreaseVerde
        descending_verde.tag=Mesaid

        val ascending_verde: Button = binding.increaseVerde
        ascending_verde.tag=Mesaid

        val descending_rajas: Button = binding.decreaseRajas
        descending_rajas.tag=Mesaid

        val ascending_rajas: Button = binding.increaseRajas
        ascending_rajas.tag=Mesaid

        val descending_mole: Button = binding.decreaseMole
        descending_mole.tag=Mesaid

        val ascending_mole: Button = binding.increaseMole
        ascending_mole.tag=Mesaid

        val descending_pasas: Button = binding.decreasePasas
        descending_pasas.tag=Mesaid

        val ascending_pasas: Button = binding.increasePasas
        ascending_pasas.tag=Mesaid

        val descending_pina: Button = binding.decreasePina
        descending_pina.tag=Mesaid

        val ascending_pina: Button = binding.increasePina
        ascending_pina.tag=Mesaid

        val descending_champi: Button = binding.decreaseChampi
        descending_champi.tag=Mesaid

        val ascending_champi: Button = binding.increaseChampi
        ascending_champi.tag=Mesaid

        val descending_quesozar: Button = binding.decreaseQuesozar
        descending_quesozar.tag=Mesaid

        val ascending_quesozar: Button = binding.increaseQuesozar
        ascending_quesozar.tag=Mesaid

        val descending_bolillo: Button = binding.decreaseBolillo
        descending_bolillo.tag=Mesaid

        val ascending_bolillo: Button = binding.increaseBolillo
        ascending_bolillo.tag=Mesaid

        val verdes_text : TextView = binding.integerVerde
        val n_verdes: Int = (activity as MainActivity).t_verde[i-1]
        verdes_text.text=n_verdes.toString()

        val verdesTotal_text : TextView = binding.integerVerdetot
        val tot_verdes: String = dec.format((activity as MainActivity).tot_verde[i-1])
        verdesTotal_text.text=tot_verdes

        val rajas_text : TextView = binding.integerRajas
        val n_rajas: Int = (activity as MainActivity).t_rajas[i-1]
        rajas_text.text=n_rajas.toString()

        val rajasTotal_text : TextView = binding.integerRajastot
        val tot_rajas: String = dec.format((activity as MainActivity).tot_rajas[i-1])
        rajasTotal_text.text=tot_rajas

        val mole_text : TextView = binding.integerMole
        val n_mole: Int = (activity as MainActivity).t_mole[i-1]
        mole_text.text=n_mole.toString()

        val moleTotal_text : TextView = binding.integerMoletot
        val tot_mole: String = dec.format((activity as MainActivity).tot_mole[i-1])
        moleTotal_text.text=tot_mole

        val pasas_text : TextView = binding.integerPasas
        val n_pasas: Int = (activity as MainActivity).t_pasas[i-1]
        pasas_text.text=n_pasas.toString()

        val pasasTotal_text : TextView = binding.integerPasastot
        val tot_pasas: String = dec.format((activity as MainActivity).tot_pasas[i-1])
        pasasTotal_text.text=tot_pasas

        val pina_text : TextView = binding.integerPina
        val n_pina: Int = (activity as MainActivity).t_pina[i-1]
        pina_text.text=n_pina.toString()

        val pinaTotal_text : TextView = binding.integerPinatot
        val tot_pina: String = dec.format((activity as MainActivity).tot_pina[i-1])
        pinaTotal_text.text=tot_pina

        val champi_text : TextView = binding.integerChampi
        val n_champi: Int = (activity as MainActivity).t_champi[i-1]
        champi_text.text=n_champi.toString()

        val champiTotal_text : TextView = binding.integerChampitot
        val tot_champi: String = dec.format((activity as MainActivity).tot_champi[i-1])
        champiTotal_text.text=tot_champi

        val quesozar_text : TextView = binding.integerQuesozar
        val n_quesozar: Int = (activity as MainActivity).t_quesozar[i-1]
        quesozar_text.text=n_quesozar.toString()

        val quesozarTotal_text : TextView = binding.integerQuesozartot
        val tot_quesozar: String = dec.format((activity as MainActivity).tot_quesozar[i-1])
        quesozarTotal_text.text=tot_quesozar

        val bolillo_text : TextView = binding.integerBolillo
        val n_bolillo: Int = (activity as MainActivity).t_bolillo[i-1]
        bolillo_text.text=n_bolillo.toString()

        val bolilloTotal_text : TextView = binding.integerBolillotot
        val tot_bolillo: String = dec.format((activity as MainActivity).tot_bolillo[i-1])
        bolilloTotal_text.text=tot_bolillo

        val TotalTamales_text : TextView = binding.integerTotaltamales
        val tot_tamales: String = dec.format((activity as MainActivity).tot_tamales[i-1])
        TotalTamales_text.text=tot_tamales




        return root
    }






    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}