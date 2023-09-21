package com.example.eltamalito.ui.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.eltamalito.R
import com.example.eltamalito.databinding.FragmentMenuBinding
import com.example.eltamalito.ui.menu.MenuViewModel

class MenuFragment : Fragment() {

    private var _binding: FragmentMenuBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val menuViewModel =
            ViewModelProvider(this).get(MenuViewModel::class.java)

        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val Mesaid: Int? = arguments?.getInt("Mesa")
        val bundle = Bundle()
        bundle.putInt("Mesa", Mesaid!!)

        val btn_tamales : ImageButton = binding.btnTamales
        btn_tamales.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_menu_tamales,bundle))

        val btn_atoles : ImageButton = binding.btnAtoles
        btn_atoles.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_menu_atoles,bundle))

        val btn_chilaquiles : ImageButton = binding.btnChilaquiles
        btn_chilaquiles.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_menu_chilaquiles,bundle))

        val btn_pozole : ImageButton = binding.btnPozole
        btn_pozole.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_menu_pozole,bundle))

        val btn_pancita : ImageButton = binding.btnPancita
        btn_pancita.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_menu_pancita,bundle))

        val btn_huaraches : ImageButton = binding.btnHuaraches
        btn_huaraches.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_menu_huaraches,bundle))

        val btn_pambazos : ImageButton = binding.btnPambazos
        btn_pambazos.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_menu_pambazos,bundle))

        val btn_tacos : ImageButton = binding.btnTacos
        btn_tacos.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_menu_tacos,bundle))

        val btn_refrescos : ImageButton = binding.btnRefrescos
        btn_refrescos.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_menu_refrescos,bundle))

       // val btn_extras : ImageButton = binding.btnExtras
        //btn_extras.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_menu_extras))

        val btn_mixiotes : ImageButton = binding.btnMixiotes
        btn_mixiotes.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_menu_mixiotes,bundle))
        return root


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}