package com.example.eltamalito.ui.mesa7

import android.app.AlertDialog
import android.content.DialogInterface
import android.graphics.Typeface
import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.eltamalito.MainActivity
import com.example.eltamalito.R
import com.example.eltamalito.databinding.FragmentMesa7Binding
import com.example.eltamalito.ui.mesa7.Mesa7ViewModel
import java.text.DecimalFormat

class Mesa7Fragment : Fragment() {

    private var _binding: FragmentMesa7Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val mesa7ViewModel =
            ViewModelProvider(this).get(Mesa7ViewModel::class.java)

        _binding = FragmentMesa7Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMesa7
        mesa7ViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        val Mesaid = 7
        val bundle = Bundle()
        bundle.putInt("Mesa", Mesaid)
        val btn : Button = binding.buttonMenu
        btn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_menu,bundle))

        val btn_limpiar : Button = binding.buttonLimpiar
        btn_limpiar.setOnClickListener {


            val builder = AlertDialog.Builder(activity,AlertDialog.THEME_DEVICE_DEFAULT_LIGHT)
            builder.setCancelable(true)
            builder.setIcon(R.drawable.ic_warning);
            builder.setTitle("Atención")
            builder.setMessage("¿Esta seguro de que quiere eliminar los registros de la Mesa "+Mesaid+"?")
            builder.setPositiveButton(
                "Confirmar"
            ) { dialog, which ->
//tamales
                (activity as MainActivity).t_verde[Mesaid-1]=0
                (activity as MainActivity).t_rajas[Mesaid-1]=0
                (activity as MainActivity).t_mole[Mesaid-1]=0
                (activity as MainActivity).t_pasas[Mesaid-1]=0
                (activity as MainActivity).t_pina[Mesaid-1]=0
                (activity as MainActivity).t_champi[Mesaid-1]=0
                (activity as MainActivity).t_quesozar[Mesaid-1]=0
                (activity as MainActivity).t_bolillo[Mesaid-1]=0
                (activity as MainActivity).tot_verde[Mesaid-1]=0
                (activity as MainActivity).tot_rajas[Mesaid-1]=0
                (activity as MainActivity).tot_mole[Mesaid-1]=0
                (activity as MainActivity).tot_pasas[Mesaid-1]=0
                (activity as MainActivity).tot_pina[Mesaid-1]=0
                (activity as MainActivity).tot_champi[Mesaid-1]=0
                (activity as MainActivity).tot_quesozar[Mesaid-1]=0
                (activity as MainActivity).tot_bolillo[Mesaid-1]=0
//chilaquiles
                (activity as MainActivity).chila_sencillos[Mesaid-1]=0
                (activity as MainActivity).chila_pollo[Mesaid-1]=0
                (activity as MainActivity).chila_bistec[Mesaid-1]=0
                (activity as MainActivity).chila_huevo[Mesaid-1]=0
                (activity as MainActivity).crema[Mesaid-1]=0
                (activity as MainActivity).bolillo2[Mesaid-1]=0
                (activity as MainActivity).tot_chila_sencillos[Mesaid-1]=0
                (activity as MainActivity).tot_chila_pollo[Mesaid-1]=0
                (activity as MainActivity).tot_chila_bistec[Mesaid-1]=0
                (activity as MainActivity).tot_chila_huevo[Mesaid-1]=0
                (activity as MainActivity).tot_crema[Mesaid-1]=0
                (activity as MainActivity).tot_bolillo2[Mesaid-1]=0
//huaraches
                (activity as MainActivity).huara_sencillos[Mesaid-1]=0
                (activity as MainActivity).huara_pollo[Mesaid-1]=0
                (activity as MainActivity).huara_bistec[Mesaid-1]=0
                (activity as MainActivity).huara_huevo[Mesaid-1]=0
                (activity as MainActivity).tot_huara_sencillos[Mesaid-1]=0
                (activity as MainActivity).tot_huara_pollo[Mesaid-1]=0
                (activity as MainActivity).tot_huara_bistec[Mesaid-1]=0
                (activity as MainActivity).tot_huara_huevo[Mesaid-1]=0
//atoles y cafe
                (activity as MainActivity).solo_chico[Mesaid-1]=0
                (activity as MainActivity).solo_mediano[Mesaid-1]=0
                (activity as MainActivity).solo_grande[Mesaid-1]=0
                (activity as MainActivity).crema_chico[Mesaid-1]=0
                (activity as MainActivity).crema_mediano[Mesaid-1]=0
                (activity as MainActivity).crema_grande[Mesaid-1]=0
                (activity as MainActivity).arroz_chico[Mesaid-1]=0
                (activity as MainActivity).arroz_mediano[Mesaid-1]=0
                (activity as MainActivity).arroz_grande[Mesaid-1]=0
                (activity as MainActivity).chocolate_chico[Mesaid-1]=0
                (activity as MainActivity).chocolate_mediano[Mesaid-1]=0
                (activity as MainActivity).chocolate_grande[Mesaid-1]=0
                (activity as MainActivity).tot_solo_chico[Mesaid-1]=0
                (activity as MainActivity).tot_solo_mediano[Mesaid-1]=0
                (activity as MainActivity).tot_solo_grande[Mesaid-1]=0
                (activity as MainActivity).tot_crema_chico[Mesaid-1]=0
                (activity as MainActivity).tot_crema_mediano[Mesaid-1]=0
                (activity as MainActivity).tot_crema_grande[Mesaid-1]=0
                (activity as MainActivity).tot_arroz_mediano[Mesaid-1]=0
                (activity as MainActivity).tot_arroz_chico[Mesaid-1]=0
                (activity as MainActivity).tot_arroz_grande[Mesaid-1]=0
                (activity as MainActivity).tot_chocolate_chico[Mesaid-1]=0
                (activity as MainActivity).tot_chocolate_mediano[Mesaid-1]=0
                (activity as MainActivity).tot_chocolate_grande[Mesaid-1]=0
//pozole
                (activity as MainActivity).pozole_pollo[Mesaid-1]=0
                (activity as MainActivity).tot_pozole_pollo[Mesaid-1]=0
                (activity as MainActivity).pozole_puerco[Mesaid-1]=0
                (activity as MainActivity).tot_pozole_puerco[Mesaid-1]=0
//pancita
                (activity as MainActivity).pancita[Mesaid-1]=0
                (activity as MainActivity).tot_pancita[Mesaid-1]=0
//mixiote
                (activity as MainActivity).mixiote_pollo[Mesaid-1]=0
                (activity as MainActivity).tot_mixiote_pollo[Mesaid-1]=0
                (activity as MainActivity).mixiote_puerco[Mesaid-1]=0
                (activity as MainActivity).tot_mixiote_puerco[Mesaid-1]=0
//pambazo
                (activity as MainActivity).pambazo[Mesaid-1]=0
                (activity as MainActivity).tot_pambazo[Mesaid-1]=0
//tacos
                (activity as MainActivity).tacos[Mesaid-1]=0
                (activity as MainActivity).tot_tacos[Mesaid-1]=0






                val navController = findNavController()
                navController.run {
                    popBackStack()
                    navigate(R.id.nav_mesa7)
                }
            }
            builder.setNegativeButton(
                "Cancelar"
            ) { dialog, which -> }

            val dialog = builder.create()
            dialog.show()
            val nbutton: Button = dialog.getButton(DialogInterface.BUTTON_NEGATIVE)
            nbutton.setTextColor(getResources().getColor(R.color.red2))
            val nbutton2: Button = dialog.getButton(DialogInterface.BUTTON_POSITIVE)
            nbutton2.setTextColor(getResources().getColor(R.color.green_700))




        }
//////////////// Termina funcion limpiar
//tamales
        val n_verdes: Int = (activity as MainActivity).t_verde[Mesaid-1]
        val n_rajas: Int = (activity as MainActivity).t_rajas[Mesaid-1]
        val n_mole: Int = (activity as MainActivity).t_mole[Mesaid-1]
        val n_pasas: Int = (activity as MainActivity).t_pasas[Mesaid-1]
        val n_pina: Int = (activity as MainActivity).t_pina[Mesaid-1]
        val n_champi: Int = (activity as MainActivity).t_champi[Mesaid-1]
        val n_quesozar: Int = (activity as MainActivity).t_quesozar[Mesaid-1]
        val n_bolillo: Int = (activity as MainActivity).t_bolillo[Mesaid-1]
        val tot_verdes: Int = (activity as MainActivity).tot_verde[Mesaid-1]
        val tot_rajas: Int = (activity as MainActivity).tot_rajas[Mesaid-1]
        val tot_mole: Int = (activity as MainActivity).tot_mole[Mesaid-1]
        val tot_pasas: Int = (activity as MainActivity).tot_pasas[Mesaid-1]
        val tot_pina: Int = (activity as MainActivity).tot_pina[Mesaid-1]
        val tot_champi: Int = (activity as MainActivity).tot_champi[Mesaid-1]
        val tot_quesozar: Int = (activity as MainActivity).tot_quesozar[Mesaid-1]
        val tot_bolillo: Int = (activity as MainActivity).tot_bolillo[Mesaid-1]

//chilaquiles
        val chila_sencillos: Int = (activity as MainActivity).chila_sencillos[Mesaid-1]
        val chila_pollo: Int = (activity as MainActivity).chila_pollo[Mesaid-1]
        val chila_bistec: Int = (activity as MainActivity).chila_bistec[Mesaid-1]
        val chila_huevo: Int = (activity as MainActivity).chila_huevo[Mesaid-1]
        val crema: Int = (activity as MainActivity).crema[Mesaid-1]
        val bolillo2: Int = (activity as MainActivity).bolillo2[Mesaid-1]
        val tot_chila_sencilos: Int = (activity as MainActivity).tot_chila_sencillos[Mesaid-1]
        val tot_chila_pollo: Int = (activity as MainActivity).tot_chila_pollo[Mesaid-1]
        val tot_chila_bistec: Int = (activity as MainActivity).tot_chila_bistec[Mesaid-1]
        val tot_chila_huevo: Int = (activity as MainActivity).tot_chila_huevo[Mesaid-1]
        val tot_crema: Int = (activity as MainActivity).tot_crema[Mesaid-1]
        val tot_bolillo2: Int = (activity as MainActivity).tot_bolillo2[Mesaid-1]

//huaraches
        val huara_sencillos: Int = (activity as MainActivity).huara_sencillos[Mesaid-1]
        val huara_pollo: Int = (activity as MainActivity).huara_pollo[Mesaid-1]
        val huara_bistec: Int = (activity as MainActivity).huara_bistec[Mesaid-1]
        val huara_huevo: Int = (activity as MainActivity).huara_huevo[Mesaid-1]
        val tot_huara_sencilos: Int = (activity as MainActivity).tot_huara_sencillos[Mesaid-1]
        val tot_huara_pollo: Int = (activity as MainActivity).tot_huara_pollo[Mesaid-1]
        val tot_huara_bistec: Int = (activity as MainActivity).tot_huara_bistec[Mesaid-1]
        val tot_huara_huevo: Int = (activity as MainActivity).tot_huara_huevo[Mesaid-1]

//atoles y cafe
        val solo_chico: Int = (activity as MainActivity).solo_chico[Mesaid-1]
        val solo_mediano: Int = (activity as MainActivity).solo_mediano[Mesaid-1]
        val solo_grande: Int = (activity as MainActivity).solo_grande[Mesaid-1]
        val crema_chico: Int = (activity as MainActivity).crema_chico[Mesaid-1]
        val crema_mediano: Int = (activity as MainActivity).crema_mediano[Mesaid-1]
        val crema_grande: Int = (activity as MainActivity).crema_grande[Mesaid-1]
        val arroz_chico: Int = (activity as MainActivity).arroz_chico[Mesaid-1]
        val arroz_mediano: Int = (activity as MainActivity).arroz_mediano[Mesaid-1]
        val arroz_grande: Int = (activity as MainActivity).arroz_grande[Mesaid-1]
        val chocolate_chico: Int = (activity as MainActivity).chocolate_chico[Mesaid-1]
        val chocolate_mediano: Int = (activity as MainActivity).chocolate_mediano[Mesaid-1]
        val chocolate_grande: Int = (activity as MainActivity).chocolate_grande[Mesaid-1]
        val tot_solo_chico: Int = (activity as MainActivity).tot_solo_chico[Mesaid-1]
        val tot_solo_mediano: Int = (activity as MainActivity).tot_solo_mediano[Mesaid-1]
        val tot_solo_grande: Int = (activity as MainActivity).tot_solo_grande[Mesaid-1]
        val tot_crema_chico: Int = (activity as MainActivity).tot_crema_chico[Mesaid-1]
        val tot_crema_mediano: Int = (activity as MainActivity).tot_crema_mediano[Mesaid-1]
        val tot_crema_grande: Int = (activity as MainActivity).tot_crema_grande[Mesaid-1]
        val tot_arroz_chico: Int = (activity as MainActivity).tot_arroz_chico[Mesaid-1]
        val tot_arroz_mediano: Int = (activity as MainActivity).tot_arroz_mediano[Mesaid-1]
        val tot_arroz_grande: Int = (activity as MainActivity).tot_arroz_grande[Mesaid-1]
        val tot_chocolate_chico: Int = (activity as MainActivity).tot_chocolate_chico[Mesaid-1]
        val tot_chocolate_mediano: Int = (activity as MainActivity).tot_chocolate_mediano[Mesaid-1]
        val tot_chocolate_grande: Int = (activity as MainActivity).tot_chocolate_grande[Mesaid-1]
        //pozole
        val pozolepollo: Int = (activity as MainActivity).pozole_pollo[Mesaid-1]
        val tot_pozolepollo: Int = (activity as MainActivity).tot_pozole_pollo[Mesaid-1]
        val pozolepuerco: Int = (activity as MainActivity).pozole_puerco[Mesaid-1]
        val tot_pozolepuerco: Int = (activity as MainActivity).tot_pozole_puerco[Mesaid-1]


//pancita
        val pancita: Int = (activity as MainActivity).pancita[Mesaid-1]
        val tot_pancita: Int = (activity as MainActivity).tot_pancita[Mesaid-1]
//mixiote
        val mixiotepollo: Int = (activity as MainActivity).mixiote_pollo[Mesaid-1]
        val tot_mixiotepollo: Int = (activity as MainActivity).tot_mixiote_pollo[Mesaid-1]
        val mixiotepuerco: Int = (activity as MainActivity).mixiote_puerco[Mesaid-1]
        val tot_mixiotepuerco: Int = (activity as MainActivity).tot_mixiote_puerco[Mesaid-1]
//pambazo
        val pambazo: Int = (activity as MainActivity).pambazo[Mesaid-1]
        val tot_pambazo: Int = (activity as MainActivity).tot_pambazo[Mesaid-1]
//tacos
        val tacos: Int = (activity as MainActivity).tacos[Mesaid-1]
        val tot_tacos: Int = (activity as MainActivity).tot_tacos[Mesaid-1]






//tamales
        val verdes = arrayOf("Tamal Verde",resources.getInteger(R.integer.price_verde),n_verdes,tot_verdes)
        val rajas = arrayOf("Tamal Rajas",resources.getInteger(R.integer.price_rajas),n_rajas,tot_rajas)
        val mole = arrayOf("Tamal Mole",resources.getInteger(R.integer.price_mole),n_mole,tot_mole)
        val pasas = arrayOf("Tamal Pasas",resources.getInteger(R.integer.price_pasas),n_pasas,tot_pasas)
        val pina = arrayOf("Tamal Piña",resources.getInteger(R.integer.price_pina),n_pina,tot_pina)
        val champi = arrayOf("Tamal Champiñones",resources.getInteger(R.integer.price_champi),n_champi,tot_champi)
        val quesozar = arrayOf("Tamal Queso\n con Zarzamora",resources.getInteger(R.integer.price_quesozar),n_quesozar,tot_quesozar)
        val bolillo = arrayOf("Bolillo",resources.getInteger(R.integer.price_bolillo),n_bolillo+bolillo2,tot_bolillo+tot_bolillo2)

//chilaquiles
        val chil_sencillos = arrayOf("Chilaquiles\nSencillos",resources.getInteger(R.integer.price_chila_sencillos),chila_sencillos,tot_chila_sencilos)
        val chil_pollo = arrayOf("Chilaquiles\ncon Pollo",resources.getInteger(R.integer.price_chila_pollo),chila_pollo,tot_chila_pollo)
        val chil_bistec = arrayOf("Chilaquiles\ncon Bistec",resources.getInteger(R.integer.price_chila_bistec),chila_bistec,tot_chila_bistec)
        val chil_huevo = arrayOf("Chilaquiles\ncon Huevo",resources.getInteger(R.integer.price_chila_huevo),chila_huevo,tot_chila_huevo)
        val chil_crema = arrayOf("Crema",resources.getInteger(R.integer.price_crema),crema,tot_crema)

//huaraches
        val huar_sencillo = arrayOf("Huarache\nSencillo",resources.getInteger(R.integer.price_huara_sencillos),huara_sencillos,tot_huara_sencilos)
        val huar_pollo = arrayOf("Huarache\ncon Pollo",resources.getInteger(R.integer.price_huara_pollo),huara_pollo,tot_huara_pollo)
        val huar_bistec = arrayOf("Huarache\ncon Bistec",resources.getInteger(R.integer.price_huara_bistec),huara_bistec,tot_huara_bistec)
        val huar_huevo = arrayOf("Huarache\ncon Huevo",resources.getInteger(R.integer.price_huara_huevo),huara_huevo,tot_huara_huevo)

//atoles y cafe
        val solos_chico = arrayOf("Café Chico",resources.getInteger(R.integer.price_cafe_chico),solo_chico,tot_solo_chico)
        val solos_mediano = arrayOf("Café Mediano",resources.getInteger(R.integer.price_cafe_mediano),solo_mediano,tot_solo_mediano)
        val solos_grande = arrayOf("Café Grande",resources.getInteger(R.integer.price_cafe_grande),solo_grande,tot_solo_grande)
        val cremas_chico = arrayOf("Café Chico\ncon Crema",resources.getInteger(R.integer.price_cafecrema_chico),crema_chico,tot_crema_chico)
        val cremas_mediano = arrayOf("Café Mediano\ncon Crema",resources.getInteger(R.integer.price_cafecrema_mediano),crema_mediano,tot_crema_mediano)
        val cremas_grande = arrayOf("Café Grande\ncon Crema",resources.getInteger(R.integer.price_cafecrema_grande),crema_grande,tot_crema_grande)
        val arrozs_chico = arrayOf("Atole de Arroz\nChico",resources.getInteger(R.integer.price_atole_chico),arroz_chico,tot_arroz_chico)
        val arrozs_mediano = arrayOf("Atole de Arroz\nMediano",resources.getInteger(R.integer.price_atole_chico),arroz_mediano,tot_arroz_mediano)
        val arrozs_grande = arrayOf("Atole de Arroz\nGrande",resources.getInteger(R.integer.price_atole_chico),arroz_grande,tot_arroz_grande)
        val chocolates_chico = arrayOf("Chocolate\nChico",resources.getInteger(R.integer.price_atole_chico),chocolate_chico,tot_chocolate_chico)
        val chocolates_mediano = arrayOf("Chocolate\nMediano",resources.getInteger(R.integer.price_atole_chico),chocolate_mediano,tot_chocolate_mediano)
        val chocolates_grande = arrayOf("Chocolate\nGrande",resources.getInteger(R.integer.price_atole_chico),chocolate_grande,tot_chocolate_grande)
//pozole
        val pozolepollos = arrayOf("Pozole\ncon Pollo",resources.getInteger(R.integer.price_pozole),pozolepollo,tot_pozolepollo)
        val pozolepuercos = arrayOf("Pozole\ncon Puerco",resources.getInteger(R.integer.price_pozole),pozolepuerco,tot_pozolepuerco)
//pancita
        val pancitas = arrayOf("Pancita",resources.getInteger(R.integer.price_pancita),pancita,tot_pancita)
//mixiote
        val mixiotepollos = arrayOf("Mixiote\nde Pollo",resources.getInteger(R.integer.price_mixiote),mixiotepollo,tot_mixiotepollo)
        val mixiotepuercos = arrayOf("Mixiote\nde Puerco",resources.getInteger(R.integer.price_mixiote),mixiotepuerco,tot_mixiotepuerco)
//pambazo
        val pambazos = arrayOf("Pambazo",resources.getInteger(R.integer.price_pambazo),pambazo,tot_pambazo)

//tacos
        val tacoss = arrayOf("Tacos\nDorados (4)",resources.getInteger(R.integer.price_tacos),tacos,tot_tacos)

        val matriz = arrayOf(verdes,rajas,mole,pasas,pina,champi,quesozar,chil_sencillos,chil_pollo,chil_bistec,
            chil_huevo,huar_sencillo,huar_pollo,huar_bistec,huar_huevo,pancitas,pozolepollos,pozolepuercos,mixiotepollos,mixiotepuercos,pambazos,tacoss,
            arrozs_chico,arrozs_mediano,arrozs_grande,chocolates_chico,chocolates_mediano,
            chocolates_grande,solos_chico,solos_mediano,solos_grande,cremas_chico,cremas_mediano,cremas_grande,bolillo,chil_crema)

//////////////////////////////////////////////////////////////////
        val tablamesa7 : TableLayout = binding.tablaMesa7
        val dec = DecimalFormat("'$'#,##0.00")
        var cuenta: Int=0


        for (i in (0 until matriz.count())){
            val tr = TableRow(activity)
            tr.layoutParams = TableRow.LayoutParams(
                TableLayout.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT
            )
            tr.gravity=Gravity.CENTER_VERTICAL

            val producto = TextView(activity)
            producto.gravity=Gravity.CENTER_VERTICAL
            producto.text = matriz[i][0].toString()
            producto.layoutParams = TableRow.LayoutParams(
                TableLayout.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT
            )

            val precio = TextView(activity)
            precio.text = dec.format(matriz[i][1]).toString()
            precio.gravity=Gravity.RIGHT
            precio.layoutParams = TableRow.LayoutParams(
                TableLayout.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT
            )
            val cantidad = TextView(activity)
            cantidad.text = matriz[i][2].toString()
            cantidad.gravity=Gravity.CENTER
            cantidad.layoutParams = TableRow.LayoutParams(
                TableLayout.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT
            )
            val total = TextView(activity)
            total.text = dec.format(matriz[i][3]).toString()
            total.gravity=Gravity.RIGHT or Gravity.CENTER_VERTICAL
            total.height=140
            total.layoutParams = TableRow.LayoutParams(
                TableLayout.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT
            )

            cuenta = cuenta + (matriz[i][3] as Int)
            tr.addView(producto)
            tr.addView(precio)
            tr.addView(cantidad)
            tr.addView(total)
            if (cantidad.text as String >"0") {
                tablamesa7.addView(
                    tr,
                    TableLayout.LayoutParams(
                        TableLayout.LayoutParams.FILL_PARENT,
                        TableLayout.LayoutParams.WRAP_CONTENT
                    )
                )
            }
        }

/////////////////////////////////////////////////////
        val tr2 = TableRow(activity)
        tr2.setBackgroundResource(R.drawable.border2)
        tr2.layoutParams = TableRow.LayoutParams(
            TableLayout.LayoutParams.MATCH_PARENT,
            TableRow.LayoutParams.WRAP_CONTENT
        )

        val spaces = TextView(activity)
        spaces.layoutParams = TableRow.LayoutParams(
            TableLayout.LayoutParams.MATCH_PARENT,
            TableRow.LayoutParams.WRAP_CONTENT
        )
        val spaces2 = TextView(activity)
        spaces.layoutParams = TableRow.LayoutParams(
            TableLayout.LayoutParams.MATCH_PARENT,
            TableRow.LayoutParams.WRAP_CONTENT
        )
        val total_text = TextView(activity)
        total_text.text = "TOTAL"
        total_text.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD), Typeface.BOLD)
        total_text.gravity=Gravity.CENTER
        total_text.layoutParams = TableRow.LayoutParams(
            TableLayout.LayoutParams.MATCH_PARENT,
            TableRow.LayoutParams.WRAP_CONTENT
        )
        val total_cuenta = TextView(activity)
        total_cuenta.text = (cuenta).toString()

        if (total_cuenta.text as String > "0") {

            //////////////////////////////////
            val menuBoton: Button=binding.buttonMenu
            val p = menuBoton.layoutParams as ViewGroup.MarginLayoutParams
            val sizeInDP = 50

            val marginInDp = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, sizeInDP.toFloat(), resources
                    .displayMetrics
            ).toInt()
            p.marginEnd=marginInDp

            val limpiarBoton: Button=binding.buttonLimpiar
            limpiarBoton.setVisibility(View.VISIBLE);
////////////////////////
            mesa7ViewModel.text.observe(viewLifecycleOwner) {
                textView.text = ""
            }
            total_cuenta.text = dec.format(cuenta).toString()
            total_cuenta.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD), Typeface.BOLD)
            total_cuenta.gravity=Gravity.RIGHT
            total_cuenta.height=130
            total_cuenta.layoutParams = TableRow.LayoutParams(
                TableLayout.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.WRAP_CONTENT
            )

            tr2.addView(spaces)
            tr2.addView(spaces2)
            tr2.addView(total_text)

            tr2.addView(total_cuenta)

            tablamesa7.addView(
                tr2,
                TableLayout.LayoutParams(
                    TableLayout.LayoutParams.FILL_PARENT,
                    TableLayout.LayoutParams.WRAP_CONTENT
                )
            )
        }else
        {
            tablamesa7.removeAllViews()
        }
        ///////////////////////////////////////

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}