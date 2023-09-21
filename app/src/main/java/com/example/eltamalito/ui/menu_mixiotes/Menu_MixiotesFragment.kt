package com.example.eltamalito.ui.menu_mixiotes

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
import com.example.eltamalito.databinding.FragmentMenuMixiotesBinding
import com.example.eltamalito.ui.menu_mixiotes.Menu_MixiotesViewModel
import java.text.DecimalFormat

class Menu_MixiotesFragment : Fragment() {

    private var _binding: FragmentMenuMixiotesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val menu_mixiotessViewModel =
            ViewModelProvider(this).get(Menu_MixiotesViewModel::class.java)

        _binding = FragmentMenuMixiotesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val dec = DecimalFormat("'$'#,##0.00")
        val Mesaid: Int? = arguments?.getInt("Mesa")

        val i= Mesaid!!;

        val descending_mixiotepollo: Button = binding.decreaseMixiotepollo
        descending_mixiotepollo.tag=Mesaid

        val ascending_mixiotepollo: Button = binding.increaseMixiotepollo
        ascending_mixiotepollo.tag=Mesaid

        val mixiotepollo_text : TextView = binding.integerMixiotepollo
        val mixiotepollo: Int = (activity as MainActivity).mixiote_pollo[i-1]
        mixiotepollo_text.text=mixiotepollo.toString()

        val mixiotepolloTotal_text : TextView = binding.integerMixiotepollotot
        val tot_mixiotepollo: String = dec.format((activity as MainActivity).tot_mixiote_pollo[i-1])
        mixiotepolloTotal_text.text=tot_mixiotepollo

        val descending_mixiotepuerco: Button = binding.decreaseMixiotepuerco
        descending_mixiotepuerco.tag=Mesaid

        val ascending_mixiotepuerco: Button = binding.increaseMixiotepuerco
        ascending_mixiotepuerco.tag=Mesaid

        val mixiotepuerco_text : TextView = binding.integerMixiotepuerco
        val mixiotepuerco: Int = (activity as MainActivity).mixiote_puerco[i-1]
        mixiotepuerco_text.text=mixiotepuerco.toString()

        val mixiotepuercoTotal_text : TextView = binding.integerMixiotepuercotot
        val tot_mixiotepuerco: String = dec.format((activity as MainActivity).tot_mixiote_puerco[i-1])
        mixiotepuercoTotal_text.text=tot_mixiotepuerco



        val mixioteTotal_text : TextView = binding.integerTotalmixiote
        val tot_mixiote: String = dec.format((activity as MainActivity).tot_mixiote[i-1])
        mixioteTotal_text.text=tot_mixiote





        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}