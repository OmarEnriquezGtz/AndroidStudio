package com.example.eltamalito

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.eltamalito.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import java.text.DecimalFormat


class MainActivity : AppCompatActivity()  {
     val t_verde = arrayOf<Int>(0,0,0,0,0,0,0);
    var t_rajas = arrayOf<Int>(0,0,0,0,0,0,0)
    var t_mole = arrayOf<Int>(0,0,0,0,0,0,0)
    var t_pasas = arrayOf<Int>(0,0,0,0,0,0,0)
    var t_pina = arrayOf<Int>(0,0,0,0,0,0,0)
    var t_champi = arrayOf<Int>(0,0,0,0,0,0,0)
    var t_quesozar = arrayOf<Int>(0,0,0,0,0,0,0)
    var t_bolillo = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_verde = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_rajas = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_mole = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_pasas = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_pina = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_champi = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_quesozar = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_bolillo = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_tamales = arrayOf<Int>(0,0,0,0,0,0,0)
    var chila_sencillos = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_chila_sencillos = arrayOf<Int>(0,0,0,0,0,0,0)
    var chila_pollo = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_chila_pollo = arrayOf<Int>(0,0,0,0,0,0,0)
    var chila_bistec = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_chila_bistec = arrayOf<Int>(0,0,0,0,0,0,0)
    var chila_huevo = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_chila_huevo = arrayOf<Int>(0,0,0,0,0,0,0)
    var crema = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_crema = arrayOf<Int>(0,0,0,0,0,0,0)
    var bolillo2 = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_bolillo2 = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_chilaquiles = arrayOf<Int>(0,0,0,0,0,0,0)
    var huara_sencillos = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_huara_sencillos = arrayOf<Int>(0,0,0,0,0,0,0)
    var huara_pollo = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_huara_pollo = arrayOf<Int>(0,0,0,0,0,0,0)
    var huara_bistec = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_huara_bistec = arrayOf<Int>(0,0,0,0,0,0,0)
    var huara_huevo = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_huara_huevo = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_huaraches = arrayOf<Int>(0,0,0,0,0,0,0)
    var solo_chico = arrayOf<Int>(0,0,0,0,0,0,0)
    var solo_mediano = arrayOf<Int>(0,0,0,0,0,0,0)
    var solo_grande = arrayOf<Int>(0,0,0,0,0,0,0)
    var crema_chico = arrayOf<Int>(0,0,0,0,0,0,0)
    var crema_mediano = arrayOf<Int>(0,0,0,0,0,0,0)
    var crema_grande  = arrayOf<Int>(0,0,0,0,0,0,0)
    var arroz_chico = arrayOf<Int>(0,0,0,0,0,0,0)
    var arroz_mediano = arrayOf<Int>(0,0,0,0,0,0,0)
    var arroz_grande = arrayOf<Int>(0,0,0,0,0,0,0)
    var chocolate_chico = arrayOf<Int>(0,0,0,0,0,0,0)
    var chocolate_mediano = arrayOf<Int>(0,0,0,0,0,0,0)
    var chocolate_grande = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_solo_chico = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_solo_mediano = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_solo_grande = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_crema_chico = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_crema_mediano = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_crema_grande  = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_arroz_chico = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_arroz_mediano = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_arroz_grande = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_chocolate_chico = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_chocolate_mediano = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_chocolate_grande = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_cafeyatole = arrayOf<Int>(0,0,0,0,0,0,0)
    var pozole_pollo = arrayOf<Int>(0,0,0,0,0,0,0)
    var pozole_puerco = arrayOf<Int>(0,0,0,0,0,0,0)
    var pancita = arrayOf<Int>(0,0,0,0,0,0,0)
    var mixiote_pollo = arrayOf<Int>(0,0,0,0,0,0,0)
    var mixiote_puerco = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_pozole_pollo = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_pozole_puerco = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_pozole = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_pancita = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_mixiote_pollo = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_mixiote_puerco = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_mixiote = arrayOf<Int>(0,0,0,0,0,0,0)
    var pambazo = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_pambazo = arrayOf<Int>(0,0,0,0,0,0,0)
    var tacos = arrayOf<Int>(0,0,0,0,0,0,0)
    var tot_tacos = arrayOf<Int>(0,0,0,0,0,0,0)



    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)



        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)


        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView


        val navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_inicio,
                R.id.nav_mesa1,
                R.id.nav_mesa2,
                R.id.nav_mesa3,
                R.id.nav_mesa4,
                R.id.nav_mesa5,
                R.id.nav_mesa6,
                R.id.nav_mesa7
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        navView.itemIconTintList=null


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }



           //Incrementos y decrementos en tamales
    fun increaseVerde(view: View?) {
        val i: Int = view?.getTag() as Int
        t_verde[i-1] = t_verde[i-1] + 1
        displayVerde(t_verde[i-1],i)

    }

    fun decreaseVerde(view: View?) {
        val i: Int = view?.getTag() as Int
        if (t_verde[i-1] > 0) {
            t_verde[i-1] = t_verde[i-1] - 1
            displayVerde(t_verde[i-1],i)
        }
    }

    fun displayVerde(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintverde = findViewById<View>(R.id.integer_verde) as TextView
        val displayintverdetot = findViewById<View>(R.id.integer_verdetot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_verde)
        tot_verde[i-1] = number * precio
        displayintverde.text = "" + number
        displayintverdetot.text = dec.format(tot_verde[i-1])

        val total_tamales = findViewById<View>(R.id.integer_totaltamales) as TextView
        tot_tamales[i-1] =
            tot_verde[i-1] + tot_rajas[i-1] + tot_mole[i-1] + tot_pasas[i-1] + tot_pina[i-1] + tot_champi[i-1] + tot_quesozar[i-1] + tot_bolillo[i-1]
        total_tamales.text = dec.format(tot_tamales[i-1])


    }

    /////////////////////
    fun increaseRajas(view: View?) {
        val i: Int = view?.getTag() as Int
        t_rajas[i-1] = t_rajas[i-1] + 1
        displayRajas(t_rajas[i-1],i)
    }

    fun decreaseRajas(view: View?) {
        val i: Int = view?.getTag() as Int
        if (t_rajas[i-1] > 0) {
            t_rajas[i-1] = t_rajas[i-1] - 1
            displayRajas(t_rajas[i-1],i)
        }
    }

    fun displayRajas(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintrajas = findViewById<View>(R.id.integer_rajas) as TextView
        val displayintrajastot = findViewById<View>(R.id.integer_rajastot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_rajas)
        displayintrajas.text = "" + number
        tot_rajas[i-1] = number * precio
        displayintrajastot.text = dec.format(tot_rajas[i-1])
        val total_tamales = findViewById<View>(R.id.integer_totaltamales) as TextView
        tot_tamales[i-1] =
            tot_verde[i-1] + tot_rajas[i-1] + tot_mole[i-1] + tot_pasas[i-1] + tot_pina[i-1] + tot_champi[i-1] + tot_quesozar[i-1] + tot_bolillo[i-1]
        total_tamales.text = dec.format(tot_tamales[i-1])
    }

    /////////////////////
    fun increaseMole(view: View?) {
        val i: Int = view?.getTag() as Int
        t_mole[i-1] = t_mole[i-1] + 1
        displayMole(t_mole[i-1],i)
    }

    fun decreaseMole(view: View?) {
        val i: Int = view?.getTag() as Int
        if (t_mole[i-1] > 0) {
            t_mole[i-1] = t_mole[i-1] - 1
            displayMole(t_mole[i-1],i)
        }
    }

    fun displayMole(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintmole = findViewById<View>(R.id.integer_mole) as TextView
        val displayintmoletot = findViewById<View>(R.id.integer_moletot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_mole)
        tot_mole[i-1] = number * precio
        displayintmole.text = "" + number
        displayintmoletot.text = dec.format(tot_mole[i-1])

        val total_tamales = findViewById<View>(R.id.integer_totaltamales) as TextView
        tot_tamales[i-1] =
            tot_verde[i-1] + tot_rajas[i-1] + tot_mole[i-1] + tot_pasas[i-1] + tot_pina[i-1] + tot_champi[i-1] + tot_quesozar[i-1] + tot_bolillo[i-1]
        total_tamales.text = dec.format(tot_tamales[i-1])
    }

    /////////////////////
    fun increasePasas(view: View?) {
        val i: Int = view?.getTag() as Int
        t_pasas[i-1] = t_pasas[i-1] + 1
        displayPasas(t_pasas[i-1],i)
    }

    fun decreasePasas(view: View?) {
        val i: Int = view?.getTag() as Int
        if (t_pasas[i-1] > 0) {
            t_pasas[i-1] = t_pasas[i-1] - 1
            displayPasas(t_pasas[i-1],i)
        }
    }

    fun displayPasas(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintpasas = findViewById<View>(R.id.integer_pasas) as TextView
        val displayintpasastot = findViewById<View>(R.id.integer_pasastot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_pasas)
        displayintpasas.text = "" + number
        tot_pasas[i-1] = number * precio
        displayintpasastot.text = dec.format(tot_pasas[i-1])
        val total_tamales = findViewById<View>(R.id.integer_totaltamales) as TextView
        tot_tamales[i-1] =
            tot_verde[i-1] + tot_rajas[i-1] + tot_mole[i-1] + tot_pasas[i-1] + tot_pina[i-1] + tot_champi[i-1] + tot_quesozar[i-1] + tot_bolillo[i-1]
        total_tamales.text = dec.format(tot_tamales[i-1])
    }

    /////////////////////
    fun increasePina(view: View?) {
        val i: Int = view?.getTag() as Int
        t_pina[i-1] = t_pina[i-1] + 1
        displayPina(t_pina[i-1],i)
    }

    fun decreasePina(view: View?) {
        val i: Int = view?.getTag() as Int
        if (t_pina[i-1] > 0) {
            t_pina[i-1] = t_pina[i-1] - 1
            displayPina(t_pina[i-1],i)
        }
    }

    fun displayPina(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintpina = findViewById<View>(R.id.integer_pina) as TextView
        val displayintpinatot = findViewById<View>(R.id.integer_pinatot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_pina)
        tot_pina[i-1] = number * precio
        displayintpina.text = "" + number
        displayintpinatot.text = dec.format(tot_pina[i-1])

        val total_tamales = findViewById<View>(R.id.integer_totaltamales) as TextView
        tot_tamales[i-1] =
            tot_verde[i-1] + tot_rajas[i-1] + tot_mole[i-1] + tot_pasas[i-1] + tot_pina[i-1]+ tot_champi[i-1] + tot_quesozar[i-1] + tot_bolillo[i-1]
        total_tamales.text = dec.format(tot_tamales[i-1])
    }

    /////////////////////
    fun increaseChampi(view: View?) {
        val i: Int = view?.getTag() as Int
        t_champi[i-1] = t_champi[i-1] + 1
        displayChampi(t_champi[i-1],i)
    }

    fun decreaseChampi(view: View?) {
        val i: Int = view?.getTag() as Int
        if (t_champi[i-1] > 0) {
            t_champi[i-1] = t_champi[i-1] - 1
            displayChampi(t_champi[i-1],i)
        }
    }

    fun displayChampi(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintchampi = findViewById<View>(R.id.integer_champi) as TextView
        val displayintchampitot = findViewById<View>(R.id.integer_champitot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_champi)
        tot_champi[i-1] = number * precio
        displayintchampi.text = "" + number
        displayintchampitot.text = dec.format(tot_champi[i-1])

        val total_tamales = findViewById<View>(R.id.integer_totaltamales) as TextView
        tot_tamales[i-1] =
            tot_verde[i-1] + tot_rajas[i-1] + tot_mole[i-1] + tot_pasas[i-1] + tot_pina[i-1] + tot_champi[i-1] + tot_quesozar[i-1] + tot_bolillo[i-1]
        total_tamales.text = dec.format(tot_tamales[i-1])
    }

    /////////////////////
    fun increaseQuesoZar(view: View?) {
        val i: Int = view?.getTag() as Int
        t_quesozar[i-1] = t_quesozar[i-1] + 1
        displayQuesoZar(t_quesozar[i-1],i)
    }

    fun decreaseQuesoZar(view: View?) {
        val i: Int = view?.getTag() as Int
        if (t_quesozar[i-1] > 0) {
            t_quesozar[i-1] = t_quesozar[i-1] - 1
            displayQuesoZar(t_quesozar[i-1],i)
        }
    }

    fun displayQuesoZar(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintquesozar = findViewById<View>(R.id.integer_quesozar) as TextView
        val displayintquesozartot = findViewById<View>(R.id.integer_quesozartot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_quesozar)
        tot_quesozar[i-1] = number * precio
        displayintquesozar.text = "" + number
        displayintquesozartot.text = dec.format(tot_quesozar[i-1])

        val total_tamales = findViewById<View>(R.id.integer_totaltamales) as TextView
        tot_tamales[i-1] =
            tot_verde[i-1]+ tot_rajas[i-1] + tot_mole[i-1] + tot_pasas[i-1]+ tot_pina[i-1] + tot_champi[i-1] + tot_quesozar[i-1] + tot_bolillo[i-1]
        total_tamales.text = dec.format(tot_tamales[i-1])
    }

    /////////////////////
    fun increaseBolillo(view: View?) {
        val i: Int = view?.getTag() as Int
        t_bolillo[i-1] = t_bolillo[i-1] + 1
        displayBolillo(t_bolillo[i-1],i)
    }

    fun decreaseBolillo(view: View?) {
        val i: Int = view?.getTag() as Int
        if (t_bolillo[i-1] > 0) {
            t_bolillo[i-1] = t_bolillo[i-1] - 1
            displayBolillo(t_bolillo[i-1],i)
        }
    }

    fun displayBolillo(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintbolillo = findViewById<View>(R.id.integer_bolillo) as TextView
        val displayintbolillotot = findViewById<View>(R.id.integer_bolillotot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_bolillo)
        tot_bolillo[i-1] = number * precio
        displayintbolillo.text = "" + number
        displayintbolillotot.text = dec.format(tot_bolillo[i-1])

        val total_tamales = findViewById<View>(R.id.integer_totaltamales) as TextView
        tot_tamales[i-1] =
            tot_verde[i-1]+ tot_rajas[i-1] + tot_mole[i-1] + tot_pasas[i-1]+ tot_pina[i-1] + tot_champi[i-1] + tot_quesozar[i-1] + tot_bolillo[i-1]

        total_tamales.text = dec.format(tot_tamales[i-1])
    }
/////////////////////
    //Incrementos y decrementos en tamales
    fun increaseChila_sencillos(view: View?) {
    val i: Int = view?.getTag() as Int
        chila_sencillos[i-1] = chila_sencillos[i-1] + 1
        displayChila_sencillos(chila_sencillos[i-1],i)

    }

    fun decreaseChila_sencillos(view: View?) {
        val i: Int = view?.getTag() as Int
        if (chila_sencillos[i-1] > 0) {
            chila_sencillos[i-1] = chila_sencillos[i-1] - 1
            displayChila_sencillos(chila_sencillos[i-1],i)
        }
    }

    fun displayChila_sencillos(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintchila_sencillos = findViewById<View>(R.id.integer_chila_sencillos) as TextView
        val displayintchila_sencillostot = findViewById<View>(R.id.integer_chila_sencillostot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_chila_sencillos)
        tot_chila_sencillos[i-1] = number * precio
        displayintchila_sencillos.text = "" + number
        displayintchila_sencillostot.text = dec.format(tot_chila_sencillos[i-1])

        val total_chilaquiles = findViewById<View>(R.id.integer_totalchilaquiles) as TextView
        tot_chilaquiles[i-1] =
            tot_chila_sencillos[i-1]+tot_chila_pollo[i-1]+tot_chila_bistec[i-1]+tot_chila_huevo[i-1]+tot_crema[i-1]+tot_bolillo2[i-1]
        total_chilaquiles.text = dec.format(tot_chilaquiles[i-1])

    }

    /////////////////////
    fun increaseChila_pollo(view: View?) {
        val i: Int = view?.getTag() as Int
        chila_pollo[i-1] = chila_pollo[i-1] + 1
        displayChila_pollo(chila_pollo[i-1],i)

    }

    fun decreaseChila_pollo(view: View?) {
        val i: Int = view?.getTag() as Int
        if (chila_pollo[i-1] > 0) {
            chila_pollo[i-1] = chila_pollo[i-1] - 1
            displayChila_pollo(chila_pollo[i-1],i)
        }
    }

    fun displayChila_pollo(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintchila_pollo = findViewById<View>(R.id.integer_chila_pollo) as TextView
        val displayintchila_pollotot = findViewById<View>(R.id.integer_chila_pollotot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_chila_pollo)
        tot_chila_pollo[i-1] = number * precio
        displayintchila_pollo.text = "" + number
        displayintchila_pollotot.text = dec.format(tot_chila_pollo[i-1])

        val total_chilaquiles = findViewById<View>(R.id.integer_totalchilaquiles) as TextView
        tot_chilaquiles[i-1] =
            tot_chila_sencillos[i-1]+tot_chila_pollo[i-1]+tot_chila_bistec[i-1]+tot_chila_huevo[i-1]+tot_crema[i-1]+tot_bolillo2[i-1]
        total_chilaquiles.text = dec.format(tot_chilaquiles[i-1])

    }

    /////////////////////
    fun increaseChila_bistec(view: View?) {
        val i: Int = view?.getTag() as Int
        chila_bistec[i-1] = chila_bistec[i-1] + 1
        displayChila_bistec(chila_bistec[i-1],i)

    }

    fun decreaseChila_bistec(view: View?) {
        val i: Int = view?.getTag() as Int
        if (chila_bistec[i-1] > 0) {
            chila_bistec[i-1] = chila_bistec[i-1] - 1
            displayChila_bistec(chila_bistec[i-1],i)
        }
    }

    fun displayChila_bistec(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintchila_bistec = findViewById<View>(R.id.integer_chila_bistec) as TextView
        val displayintchila_bistectot = findViewById<View>(R.id.integer_chila_bistectot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_chila_bistec)
        tot_chila_bistec[i-1] = number * precio
        displayintchila_bistec.text = "" + number
        displayintchila_bistectot.text = dec.format(tot_chila_bistec[i-1])

        val total_chilaquiles = findViewById<View>(R.id.integer_totalchilaquiles) as TextView
        tot_chilaquiles[i-1] =
            tot_chila_sencillos[i-1]+tot_chila_pollo[i-1]+tot_chila_bistec[i-1]+tot_chila_huevo[i-1]+tot_crema[i-1]+tot_bolillo2[i-1]
        total_chilaquiles.text = dec.format(tot_chilaquiles[i-1])

    }

    /////////////////////
    fun increaseChila_huevo(view: View?) {
        val i: Int = view?.getTag() as Int
        chila_huevo[i-1] = chila_huevo[i-1] + 1
        displayChila_huevo(chila_huevo[i-1],i)

    }

    fun decreaseChila_huevo(view: View?) {
        val i: Int = view?.getTag() as Int
        if (chila_huevo[i-1] > 0) {
            chila_huevo[i-1] = chila_huevo[i-1] - 1
            displayChila_huevo(chila_huevo[i-1],i)
        }
    }

    fun displayChila_huevo(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintchila_huevo = findViewById<View>(R.id.integer_chila_huevo) as TextView
        val displayintchila_huevotot = findViewById<View>(R.id.integer_chila_huevotot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_chila_huevo)
        tot_chila_huevo[i-1] = number * precio
        displayintchila_huevo.text = "" + number
        displayintchila_huevotot.text = dec.format(tot_chila_huevo[i-1])

        val total_chilaquiles = findViewById<View>(R.id.integer_totalchilaquiles) as TextView
        tot_chilaquiles[i-1] =
            tot_chila_sencillos[i-1]+tot_chila_pollo[i-1]+tot_chila_bistec[i-1]+tot_chila_huevo[i-1]+tot_crema[i-1]+tot_bolillo2[i-1]
        total_chilaquiles.text = dec.format(tot_chilaquiles[i-1])

    }

    /////////////////////
    /////////////////////
    fun increaseCrema(view: View?) {
        val i: Int = view?.getTag() as Int
        crema[i-1] = crema[i-1] + 1
        displayCrema(crema[i-1],i)

    }

    fun decreaseCrema(view: View?) {
        val i: Int = view?.getTag() as Int
        if (crema[i-1] > 0) {
            crema[i-1] = crema[i-1] - 1
            displayCrema(crema[i-1],i)
        }
    }

    fun displayCrema(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayint_crema = findViewById<View>(R.id.integer_crema) as TextView
        val displayint_crematot = findViewById<View>(R.id.integer_crematot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_crema)
        tot_crema[i-1] = number * precio
        displayint_crema.text = "" + number
        displayint_crematot.text = dec.format(tot_crema[i-1])

    val total_chilaquiles = findViewById<View>(R.id.integer_totalchilaquiles) as TextView
    tot_chilaquiles[i-1] =
    tot_chila_sencillos[i-1]+tot_chila_pollo[i-1]+tot_chila_bistec[i-1]+tot_chila_huevo[i-1]+tot_crema[i-1]+tot_bolillo2[i-1]
    total_chilaquiles.text = dec.format(tot_chilaquiles[i-1])

    }

/////////////////////

    /////////////////////
    fun increaseBolillo2(view: View?) {
        val i: Int = view?.getTag() as Int
        bolillo2[i-1] = bolillo2[i-1] + 1
        displayBolillo2(bolillo2[i-1],i)

    }

    fun decreaseBolillo2(view: View?) {
        val i: Int = view?.getTag() as Int
        if (bolillo2[i-1] > 0) {
            bolillo2[i-1] = bolillo2[i-1] - 1
            displayBolillo2(bolillo2[i-1],i)
        }
    }

    fun displayBolillo2(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayint_Bolillo2 = findViewById<View>(R.id.integer_bolillo2) as TextView
        val displayint_Bolillo2tot = findViewById<View>(R.id.integer_bolillo2tot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_bolillo)
        tot_bolillo2[i-1] = number * precio
        displayint_Bolillo2.text = "" + number
        displayint_Bolillo2tot.text = dec.format(tot_bolillo2[i-1])

    val total_chilaquiles = findViewById<View>(R.id.integer_totalchilaquiles) as TextView
    tot_chilaquiles[i-1] =
    tot_chila_sencillos[i-1]+tot_chila_pollo[i-1]+tot_chila_bistec[i-1]+tot_chila_huevo[i-1]+tot_crema[i-1]+tot_bolillo2[i-1]
    total_chilaquiles.text = dec.format(tot_chilaquiles[i-1])

    }
    //Incrementos y decrementos en tamales
    fun increaseHuara_sencillos(view: View?) {
        val i: Int = view?.getTag() as Int
        huara_sencillos[i-1] = huara_sencillos[i-1] + 1
        displayHuara_sencillos(huara_sencillos[i-1],i)

    }

    fun decreaseHuara_sencillos(view: View?) {
        val i: Int = view?.getTag() as Int
        if (huara_sencillos[i-1] > 0) {
            huara_sencillos[i-1] = huara_sencillos[i-1] - 1
            displayHuara_sencillos(huara_sencillos[i-1],i)
        }
    }

    fun displayHuara_sencillos(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayinthuara_sencillos = findViewById<View>(R.id.integer_huara_sencillos) as TextView
        val displayinthuara_sencillostot = findViewById<View>(R.id.integer_huara_sencillostot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_huara_sencillos)
        tot_huara_sencillos[i-1] = number * precio
        displayinthuara_sencillos.text = "" + number
        displayinthuara_sencillostot.text = dec.format(tot_huara_sencillos[i-1])

        val total_huaraches = findViewById<View>(R.id.integer_totalhuaraches) as TextView
        tot_huaraches[i-1] =
            tot_huara_sencillos[i-1]+tot_huara_pollo[i-1]+tot_huara_bistec[i-1]+tot_huara_huevo[i-1]
        total_huaraches.text = dec.format(tot_huaraches[i-1])

    }

    /////////////////////
    fun increaseHuara_pollo(view: View?) {
        val i: Int = view?.getTag() as Int
        huara_pollo[i-1] = huara_pollo[i-1] + 1
        displayHuara_pollo(huara_pollo[i-1],i)

    }

    fun decreaseHuara_pollo(view: View?) {
        val i: Int = view?.getTag() as Int
        if (huara_pollo[i-1] > 0) {
            huara_pollo[i-1] = huara_pollo[i-1] - 1
            displayHuara_pollo(huara_pollo[i-1],i)
        }
    }

    fun displayHuara_pollo(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayinthuara_pollo = findViewById<View>(R.id.integer_huara_pollo) as TextView
        val displayinthuara_pollotot = findViewById<View>(R.id.integer_huara_pollotot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_huara_pollo)
        tot_huara_pollo[i-1] = number * precio
        displayinthuara_pollo.text = "" + number
        displayinthuara_pollotot.text = dec.format(tot_huara_pollo[i-1])

        val total_huaraches = findViewById<View>(R.id.integer_totalhuaraches) as TextView
        tot_huaraches[i-1] =
            tot_huara_sencillos[i-1]+tot_huara_pollo[i-1]+tot_huara_bistec[i-1]+tot_huara_huevo[i-1]
        total_huaraches.text = dec.format(tot_huaraches[i-1])

    }

    /////////////////////
    fun increaseHuara_bistec(view: View?) {
        val i: Int = view?.getTag() as Int
        huara_bistec[i-1] = huara_bistec[i-1] + 1
        displayHuara_bistec(huara_bistec[i-1],i)

    }

    fun decreaseHuara_bistec(view: View?) {
        val i: Int = view?.getTag() as Int
        if (huara_bistec[i-1] > 0) {
            huara_bistec[i-1] = huara_bistec[i-1] - 1
            displayHuara_bistec(huara_bistec[i-1],i)
        }
    }

    fun displayHuara_bistec(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayinthuara_bistec = findViewById<View>(R.id.integer_huara_bistec) as TextView
        val displayinthuara_bistectot = findViewById<View>(R.id.integer_huara_bistectot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_huara_bistec)
        tot_huara_bistec[i-1] = number * precio
        displayinthuara_bistec.text = "" + number
        displayinthuara_bistectot.text = dec.format(tot_huara_bistec[i-1])

        val total_huaraches = findViewById<View>(R.id.integer_totalhuaraches) as TextView
        tot_huaraches[i-1] =
            tot_huara_sencillos[i-1]+tot_huara_pollo[i-1]+tot_huara_bistec[i-1]+tot_huara_huevo[i-1]
        total_huaraches.text = dec.format(tot_huaraches[i-1])

    }

    /////////////////////
    fun increaseHuara_huevo(view: View?) {
        val i: Int = view?.getTag() as Int
        huara_huevo[i-1] = huara_huevo[i-1] + 1
        displayHuara_huevo(huara_huevo[i-1],i)

    }

    fun decreaseHuara_huevo(view: View?) {
        val i: Int = view?.getTag() as Int
        if (huara_huevo[i-1] > 0) {
            huara_huevo[i-1] = huara_huevo[i-1] - 1
            displayHuara_huevo(huara_huevo[i-1],i)
        }
    }

    fun displayHuara_huevo(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayinthuara_huevo = findViewById<View>(R.id.integer_huara_huevo) as TextView
        val displayinthuara_huevotot = findViewById<View>(R.id.integer_huara_huevotot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_huara_huevo)
        tot_huara_huevo[i-1] = number * precio
        displayinthuara_huevo.text = "" + number
        displayinthuara_huevotot.text = dec.format(tot_huara_huevo[i-1])

        val total_huaraches = findViewById<View>(R.id.integer_totalhuaraches) as TextView
        tot_huaraches[i-1] =
            tot_huara_sencillos[i-1]+tot_huara_pollo[i-1]+tot_huara_bistec[i-1]+tot_huara_huevo[i-1]
        total_huaraches.text = dec.format(tot_huaraches[i-1])

    }
    /////////////////////
    fun increaseSolo_chico(view: View?) {
        val i: Int = view?.getTag() as Int
        solo_chico[i-1] = solo_chico[i-1] + 1
        displaySolo_chico(solo_chico[i-1],i)

    }

    fun decreaseSolo_chico(view: View?) {
        val i: Int = view?.getTag() as Int
        if (solo_chico[i-1] > 0) {
            solo_chico[i-1] = solo_chico[i-1] - 1
            displaySolo_chico(solo_chico[i-1],i)
        }
    }

    fun displaySolo_chico(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintsolo_chico = findViewById<View>(R.id.integer_solo_chico) as TextView
        val displayintsolo_chicotot = findViewById<View>(R.id.integer_solo_chicotot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_cafe_chico)
        tot_solo_chico[i-1] = number * precio
        displayintsolo_chico.text = "" + number
        displayintsolo_chicotot.text = dec.format(tot_solo_chico[i-1])

        val total_cafeyatole = findViewById<View>(R.id.integer_totalcafe) as TextView
        tot_cafeyatole[i-1] = tot_solo_chico[i-1] +tot_solo_mediano[i-1] +tot_solo_grande[i-1]+
                tot_crema_chico[i-1]+tot_crema_mediano[i-1]+tot_crema_grande[i-1]+
                tot_arroz_chico[i-1]+tot_arroz_mediano[i-1]+tot_arroz_grande[i-1]+
                tot_chocolate_chico[i-1]+tot_chocolate_mediano[i-1]+tot_chocolate_grande[i-1]

        total_cafeyatole.text = dec.format(tot_cafeyatole[i-1])

    }
    /////////////////////
    fun increaseSolo_mediano(view: View?) {
        val i: Int = view?.getTag() as Int
        solo_mediano[i-1] = solo_mediano[i-1] + 1
        displaySolo_mediano(solo_mediano[i-1],i)

    }

    fun decreaseSolo_mediano(view: View?) {
        val i: Int = view?.getTag() as Int
        if (solo_mediano[i-1] > 0) {
            solo_mediano[i-1] = solo_mediano[i-1] - 1
            displaySolo_mediano(solo_mediano[i-1],i)
        }
    }

    fun displaySolo_mediano(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintsolo_mediano = findViewById<View>(R.id.integer_solo_mediano) as TextView
        val displayintsolo_medianotot = findViewById<View>(R.id.integer_solo_medianotot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_cafe_mediano)
        tot_solo_mediano[i-1] = number * precio
        displayintsolo_mediano.text = "" + number
        displayintsolo_medianotot.text = dec.format(tot_solo_mediano[i-1])

        val total_cafeyatole = findViewById<View>(R.id.integer_totalcafe) as TextView
        tot_cafeyatole[i-1] = tot_solo_chico[i-1] +tot_solo_mediano[i-1] +tot_solo_grande[i-1]+
                tot_crema_chico[i-1]+tot_crema_mediano[i-1]+tot_crema_grande[i-1]+
                tot_arroz_chico[i-1]+tot_arroz_mediano[i-1]+tot_arroz_grande[i-1]+
                tot_chocolate_chico[i-1]+tot_chocolate_mediano[i-1]+tot_chocolate_grande[i-1]

        total_cafeyatole.text = dec.format(tot_cafeyatole[i-1])

    }
    /////////////////////
    fun increaseSolo_grande(view: View?) {
        val i: Int = view?.getTag() as Int
        solo_grande[i-1] = solo_grande[i-1] + 1
        displaySolo_grande(solo_grande[i-1],i)

    }

    fun decreaseSolo_grande(view: View?) {
        val i: Int = view?.getTag() as Int
        if (solo_grande[i-1] > 0) {
            solo_grande[i-1] = solo_grande[i-1] - 1
            displaySolo_grande(solo_grande[i-1],i)
        }
    }

    fun displaySolo_grande(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintsolo_grande = findViewById<View>(R.id.integer_solo_grande) as TextView
        val displayintsolo_grandetot = findViewById<View>(R.id.integer_solo_grandetot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_cafe_grande)
        tot_solo_grande[i-1] = number * precio
        displayintsolo_grande.text = "" + number
        displayintsolo_grandetot.text = dec.format(tot_solo_grande[i-1])


        val total_cafeyatole = findViewById<View>(R.id.integer_totalcafe) as TextView
    tot_cafeyatole[i-1] = tot_solo_chico[i-1] +tot_solo_mediano[i-1] +tot_solo_grande[i-1]+
    tot_crema_chico[i-1]+tot_crema_mediano[i-1]+tot_crema_grande[i-1]+
    tot_arroz_chico[i-1]+tot_arroz_mediano[i-1]+tot_arroz_grande[i-1]+
    tot_chocolate_chico[i-1]+tot_chocolate_mediano[i-1]+tot_chocolate_grande[i-1]

    total_cafeyatole.text = dec.format(tot_cafeyatole[i-1])

}
    /////////////////////

    fun increaseCrema_chico(view: View?) {
        val i: Int = view?.getTag() as Int
        crema_chico[i-1] = crema_chico[i-1] + 1
        displayCrema_chico(crema_chico[i-1],i)

    }

    fun decreaseCrema_chico(view: View?) {
        val i: Int = view?.getTag() as Int
        if (crema_chico[i-1] > 0) {
            crema_chico[i-1] = crema_chico[i-1] - 1
            displayCrema_chico(crema_chico[i-1],i)
        }
    }

    fun displayCrema_chico(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintcrema_chico = findViewById<View>(R.id.integer_crema_chico) as TextView
        val displayintcrema_chicotot = findViewById<View>(R.id.integer_crema_chicotot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_cafecrema_chico)
        tot_crema_chico[i-1] = number * precio
        displayintcrema_chico.text = "" + number
        displayintcrema_chicotot.text = dec.format(tot_crema_chico[i-1])

        val total_cafeyatole = findViewById<View>(R.id.integer_totalcafe) as TextView
    tot_cafeyatole[i-1] = tot_solo_chico[i-1] +tot_solo_mediano[i-1] +tot_solo_grande[i-1]+
    tot_crema_chico[i-1]+tot_crema_mediano[i-1]+tot_crema_grande[i-1]+
    tot_arroz_chico[i-1]+tot_arroz_mediano[i-1]+tot_arroz_grande[i-1]+
    tot_chocolate_chico[i-1]+tot_chocolate_mediano[i-1]+tot_chocolate_grande[i-1]

    total_cafeyatole.text = dec.format(tot_cafeyatole[i-1])

    }
    /////////////////////

    fun increaseCrema_mediano(view: View?) {
        val i: Int = view?.getTag() as Int
        crema_mediano[i-1] = crema_mediano[i-1] + 1
        displayCrema_mediano(crema_mediano[i-1],i)

    }

    fun decreaseCrema_mediano(view: View?) {
        val i: Int = view?.getTag() as Int
        if (crema_mediano[i-1] > 0) {
            crema_mediano[i-1] = crema_mediano[i-1] - 1
            displayCrema_mediano(crema_mediano[i-1],i)
        }
    }

    fun displayCrema_mediano(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintcrema_mediano = findViewById<View>(R.id.integer_crema_mediano) as TextView
        val displayintcrema_medianotot = findViewById<View>(R.id.integer_crema_medianotot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_cafecrema_mediano)
        tot_crema_mediano[i-1] = number * precio
        displayintcrema_mediano.text = "" + number
        displayintcrema_medianotot.text = dec.format(tot_crema_mediano[i-1])


        val total_cafeyatole = findViewById<View>(R.id.integer_totalcafe) as TextView
    tot_cafeyatole[i-1] = tot_solo_chico[i-1] +tot_solo_mediano[i-1] +tot_solo_grande[i-1]+
    tot_crema_chico[i-1]+tot_crema_mediano[i-1]+tot_crema_grande[i-1]+
    tot_arroz_chico[i-1]+tot_arroz_mediano[i-1]+tot_arroz_grande[i-1]+
    tot_chocolate_chico[i-1]+tot_chocolate_mediano[i-1]+tot_chocolate_grande[i-1]

    total_cafeyatole.text = dec.format(tot_cafeyatole[i-1])

    }
    /////////////////////

    fun increaseCrema_grande(view: View?) {
        val i: Int = view?.getTag() as Int
        crema_grande[i-1] = crema_grande[i-1] + 1
        displayCrema_grande(crema_grande[i-1],i)

    }

    fun decreaseCrema_grande(view: View?) {
        val i: Int = view?.getTag() as Int
        if (crema_grande[i-1] > 0) {
            crema_grande[i-1] = crema_grande[i-1] - 1
            displayCrema_grande(crema_grande[i-1],i)
        }
    }

    fun displayCrema_grande(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintcrema_grande = findViewById<View>(R.id.integer_crema_grande) as TextView
        val displayintcrema_grandetot = findViewById<View>(R.id.integer_crema_grandetot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_cafecrema_grande)
        tot_crema_grande[i-1] = number * precio
        displayintcrema_grande.text = "" + number
        displayintcrema_grandetot.text = dec.format(tot_crema_grande[i-1])

        val total_cafeyatole = findViewById<View>(R.id.integer_totalcafe) as TextView
    tot_cafeyatole[i-1] = tot_solo_chico[i-1] +tot_solo_mediano[i-1] +tot_solo_grande[i-1]+
    tot_crema_chico[i-1]+tot_crema_mediano[i-1]+tot_crema_grande[i-1]+
    tot_arroz_chico[i-1]+tot_arroz_mediano[i-1]+tot_arroz_grande[i-1]+
    tot_chocolate_chico[i-1]+tot_chocolate_mediano[i-1]+tot_chocolate_grande[i-1]

    total_cafeyatole.text = dec.format(tot_cafeyatole[i-1])

    }
    /////////////////////

    fun increaseArroz_chico(view: View?) {
        val i: Int = view?.getTag() as Int
        arroz_chico[i-1] = arroz_chico[i-1] + 1
        displayArroz_chico(arroz_chico[i-1],i)

    }

    fun decreaseArroz_chico(view: View?) {
        val i: Int = view?.getTag() as Int
        if (arroz_chico[i-1] > 0) {
            arroz_chico[i-1] = arroz_chico[i-1] - 1
            displayArroz_chico(arroz_chico[i-1],i)
        }
    }

    fun displayArroz_chico(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintarroz_chico = findViewById<View>(R.id.integer_arroz_chico) as TextView
        val displayintarroz_chicotot = findViewById<View>(R.id.integer_arroz_chicotot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_atole_chico)
        tot_arroz_chico[i-1] = number * precio
        displayintarroz_chico.text = "" + number
        displayintarroz_chicotot.text = dec.format(tot_arroz_chico[i-1])

        val total_cafeyatole = findViewById<View>(R.id.integer_totalcafe) as TextView
    tot_cafeyatole[i-1] = tot_solo_chico[i-1] +tot_solo_mediano[i-1] +tot_solo_grande[i-1]+
    tot_crema_chico[i-1]+tot_crema_mediano[i-1]+tot_crema_grande[i-1]+
    tot_arroz_chico[i-1]+tot_arroz_mediano[i-1]+tot_arroz_grande[i-1]+
    tot_chocolate_chico[i-1]+tot_chocolate_mediano[i-1]+tot_chocolate_grande[i-1]

    total_cafeyatole.text = dec.format(tot_cafeyatole[i-1])

    }
    /////////////////////
    fun increaseArroz_mediano(view: View?) {
        val i: Int = view?.getTag() as Int
        arroz_mediano[i-1] = arroz_mediano[i-1] + 1
        displayArroz_mediano(arroz_mediano[i-1],i)

    }

    fun decreaseArroz_mediano(view: View?) {
        val i: Int = view?.getTag() as Int
        if (arroz_mediano[i-1] > 0) {
            arroz_mediano[i-1] = arroz_mediano[i-1] - 1
            displayArroz_mediano(arroz_mediano[i-1],i)
        }
    }

    fun displayArroz_mediano(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintarroz_mediano = findViewById<View>(R.id.integer_arroz_mediano) as TextView
        val displayintarroz_medianotot = findViewById<View>(R.id.integer_arroz_medianotot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_atole_mediano)
        tot_arroz_mediano[i-1] = number * precio
        displayintarroz_mediano.text = "" + number
        displayintarroz_medianotot.text = dec.format(tot_arroz_mediano[i-1])


        val total_cafeyatole = findViewById<View>(R.id.integer_totalcafe) as TextView
    tot_cafeyatole[i-1] = tot_solo_chico[i-1] +tot_solo_mediano[i-1] +tot_solo_grande[i-1]+
    tot_crema_chico[i-1]+tot_crema_mediano[i-1]+tot_crema_grande[i-1]+
    tot_arroz_chico[i-1]+tot_arroz_mediano[i-1]+tot_arroz_grande[i-1]+
    tot_chocolate_chico[i-1]+tot_chocolate_mediano[i-1]+tot_chocolate_grande[i-1]

    total_cafeyatole.text = dec.format(tot_cafeyatole[i-1])

    }
    /////////////////////
    fun increaseArroz_grande(view: View?) {
        val i: Int = view?.getTag() as Int
        arroz_grande[i-1] = arroz_grande[i-1] + 1
        displayArroz_grande(arroz_grande[i-1],i)

    }

    fun decreaseArroz_grande(view: View?) {
        val i: Int = view?.getTag() as Int
        if (arroz_grande[i-1] > 0) {
            arroz_grande[i-1] = arroz_grande[i-1] - 1
            displayArroz_grande(arroz_grande[i-1],i)
        }
    }

    fun displayArroz_grande(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintarroz_grande = findViewById<View>(R.id.integer_arroz_grande) as TextView
        val displayintarroz_grandetot = findViewById<View>(R.id.integer_arroz_grandetot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_atole_grande)
        tot_arroz_grande[i-1] = number * precio
        displayintarroz_grande.text = "" + number
        displayintarroz_grandetot.text = dec.format(tot_arroz_grande[i-1])

        val total_cafeyatole = findViewById<View>(R.id.integer_totalcafe) as TextView
    tot_cafeyatole[i-1] = tot_solo_chico[i-1] +tot_solo_mediano[i-1] +tot_solo_grande[i-1]+
    tot_crema_chico[i-1]+tot_crema_mediano[i-1]+tot_crema_grande[i-1]+
    tot_arroz_chico[i-1]+tot_arroz_mediano[i-1]+tot_arroz_grande[i-1]+
    tot_chocolate_chico[i-1]+tot_chocolate_mediano[i-1]+tot_chocolate_grande[i-1]

    total_cafeyatole.text = dec.format(tot_cafeyatole[i-1])

    }
    /////////////////////
    fun increaseChocolate_chico(view: View?) {
        val i: Int = view?.getTag() as Int
        chocolate_chico[i-1] = chocolate_chico[i-1] + 1
        displayChocolate_chico(chocolate_chico[i-1],i)

    }

    fun decreaseChocolate_chico(view: View?) {
        val i: Int = view?.getTag() as Int
        if (chocolate_chico[i-1] > 0) {
            chocolate_chico[i-1] = chocolate_chico[i-1] - 1
            displayChocolate_chico(chocolate_chico[i-1],i)
        }
    }

    fun displayChocolate_chico(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintchocolate_chico = findViewById<View>(R.id.integer_chocolate_chico) as TextView
        val displayintchocolate_chicotot = findViewById<View>(R.id.integer_chocolate_chicotot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_atole_chico)
        tot_chocolate_chico[i-1] = number * precio
        displayintchocolate_chico.text = "" + number
        displayintchocolate_chicotot.text = dec.format(tot_chocolate_chico[i-1])

        val total_cafeyatole = findViewById<View>(R.id.integer_totalcafe) as TextView
    tot_cafeyatole[i-1] = tot_solo_chico[i-1] +tot_solo_mediano[i-1] +tot_solo_grande[i-1]+
    tot_crema_chico[i-1]+tot_crema_mediano[i-1]+tot_crema_grande[i-1]+
    tot_arroz_chico[i-1]+tot_arroz_mediano[i-1]+tot_arroz_grande[i-1]+
    tot_chocolate_chico[i-1]+tot_chocolate_mediano[i-1]+tot_chocolate_grande[i-1]

    total_cafeyatole.text = dec.format(tot_cafeyatole[i-1])

    }
    /////////////////////
    fun increaseChocolate_mediano(view: View?) {
        val i: Int = view?.getTag() as Int
        chocolate_mediano[i-1] = chocolate_mediano[i-1] + 1
        displayChocolate_mediano(chocolate_mediano[i-1],i)

    }

    fun decreaseChocolate_mediano(view: View?) {
        val i: Int = view?.getTag() as Int
        if (chocolate_mediano[i-1] > 0) {
            chocolate_mediano[i-1] = chocolate_mediano[i-1] - 1
            displayChocolate_mediano(chocolate_mediano[i-1],i)
        }
    }

    fun displayChocolate_mediano(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintchocolate_mediano = findViewById<View>(R.id.integer_chocolate_mediano) as TextView
        val displayintchocolate_medianotot = findViewById<View>(R.id.integer_chocolate_medianotot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_atole_mediano)
        tot_chocolate_mediano[i-1] = number * precio
        displayintchocolate_mediano.text = "" + number
        displayintchocolate_medianotot.text = dec.format(tot_chocolate_mediano[i-1])

        val total_cafeyatole = findViewById<View>(R.id.integer_totalcafe) as TextView
    tot_cafeyatole[i-1] = tot_solo_chico[i-1] +tot_solo_mediano[i-1] +tot_solo_grande[i-1]+
    tot_crema_chico[i-1]+tot_crema_mediano[i-1]+tot_crema_grande[i-1]+
    tot_arroz_chico[i-1]+tot_arroz_mediano[i-1]+tot_arroz_grande[i-1]+
    tot_chocolate_chico[i-1]+tot_chocolate_mediano[i-1]+tot_chocolate_grande[i-1]

    total_cafeyatole.text = dec.format(tot_cafeyatole[i-1])

    }
    /////////////////////
    fun increaseChocolate_grande(view: View?) {
        val i: Int = view?.getTag() as Int
        chocolate_grande[i-1] = chocolate_grande[i-1] + 1
        displayChocolate_grande(chocolate_grande[i-1],i)

    }

    fun decreaseChocolate_grande(view: View?) {
        val i: Int = view?.getTag() as Int
        if (chocolate_grande[i-1] > 0) {
            chocolate_grande[i-1] = chocolate_grande[i-1] - 1
            displayChocolate_grande(chocolate_grande[i-1],i)
        }
    }

    fun displayChocolate_grande(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintchocolate_grande = findViewById<View>(R.id.integer_chocolate_grande) as TextView
        val displayintchocolate_grandetot = findViewById<View>(R.id.integer_chocolate_grandetot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_atole_grande)
        tot_chocolate_grande[i-1] = number * precio
        displayintchocolate_grande.text = "" + number
        displayintchocolate_grandetot.text = dec.format(tot_chocolate_grande[i-1])

        val total_cafeyatole = findViewById<View>(R.id.integer_totalcafe) as TextView
    tot_cafeyatole[i-1] = tot_solo_chico[i-1] +tot_solo_mediano[i-1] +tot_solo_grande[i-1]+
    tot_crema_chico[i-1]+tot_crema_mediano[i-1]+tot_crema_grande[i-1]+
    tot_arroz_chico[i-1]+tot_arroz_mediano[i-1]+tot_arroz_grande[i-1]+
    tot_chocolate_chico[i-1]+tot_chocolate_mediano[i-1]+tot_chocolate_grande[i-1]

    total_cafeyatole.text = dec.format(tot_cafeyatole[i-1])

    }
//////////////

    fun increasePozolepollo(view: View?) {
        val i: Int = view?.getTag() as Int
        pozole_pollo[i-1] = pozole_pollo[i-1] + 1
        displayPozolepollo(pozole_pollo[i-1],i)

    }

    fun decreasePozolepollo(view: View?) {
        val i: Int = view?.getTag() as Int
        if (pozole_pollo[i-1] > 0) {
            pozole_pollo[i-1] = pozole_pollo[i-1] - 1
            displayPozolepollo(pozole_pollo[i-1],i)
        }
    }

    fun displayPozolepollo(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintpozolepollo = findViewById<View>(R.id.integer_pozolepollo) as TextView
        val displayintpozolepollotot = findViewById<View>(R.id.integer_pozolepollotot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_pozole)
        tot_pozole_pollo[i-1] = number * precio
        displayintpozolepollo.text = "" + number
        displayintpozolepollotot.text = dec.format(tot_pozole_pollo[i-1])

        val total_pozole = findViewById<View>(R.id.integer_totalpozole) as TextView
        tot_pozole[i-1] = tot_pozole_pollo[i-1] +tot_pozole_puerco[i-1]

        total_pozole.text = dec.format(tot_pozole[i-1])


    }


    fun increasePozolepuerco(view: View?) {
        val i: Int = view?.getTag() as Int
        pozole_puerco[i-1] = pozole_puerco[i-1] + 1
        displayPozolepuerco(pozole_puerco[i-1],i)

    }

    fun decreasePozolepuerco(view: View?) {
        val i: Int = view?.getTag() as Int
        if (pozole_puerco[i-1] > 0) {
            pozole_puerco[i-1] = pozole_puerco[i-1] - 1
            displayPozolepuerco(pozole_puerco[i-1],i)
        }
    }

    fun displayPozolepuerco(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintpozolepuerco = findViewById<View>(R.id.integer_pozolepuerco) as TextView
        val displayintpozolepuercotot = findViewById<View>(R.id.integer_pozolepuercotot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_pozole)
        tot_pozole_puerco[i-1] = number * precio
        displayintpozolepuerco.text = "" + number
        displayintpozolepuercotot.text = dec.format(tot_pozole_puerco[i-1])

        val total_pozole = findViewById<View>(R.id.integer_totalpozole) as TextView
        tot_pozole[i-1] = tot_pozole_pollo[i-1] +tot_pozole_puerco[i-1]

        total_pozole.text = dec.format(tot_pozole[i-1])


    }



//////////////
fun increaseMixiotepollo(view: View?) {
    val i: Int = view?.getTag() as Int
    mixiote_pollo[i-1] = mixiote_pollo[i-1] + 1
    displayMixiotepollo(mixiote_pollo[i-1],i)

}

    fun decreaseMixiotepollo(view: View?) {
        val i: Int = view?.getTag() as Int
        if (mixiote_pollo[i-1] > 0) {
            mixiote_pollo[i-1] = mixiote_pollo[i-1] - 1
            displayMixiotepollo(mixiote_pollo[i-1],i)
        }
    }

    fun displayMixiotepollo(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintmixiotepollo = findViewById<View>(R.id.integer_mixiotepollo) as TextView
        val displayintmixiotepollotot = findViewById<View>(R.id.integer_mixiotepollotot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_mixiote)
        tot_mixiote_pollo[i-1] = number * precio
        displayintmixiotepollo.text = "" + number
        displayintmixiotepollotot.text = dec.format(tot_mixiote_pollo[i-1])

        val total_mixiote = findViewById<View>(R.id.integer_totalmixiote) as TextView
        tot_mixiote[i-1] = tot_mixiote_pollo[i-1] +tot_mixiote_puerco[i-1]

        total_mixiote.text = dec.format(tot_mixiote[i-1])


    }


    fun increaseMixiotepuerco(view: View?) {
        val i: Int = view?.getTag() as Int
        mixiote_puerco[i-1] = mixiote_puerco[i-1] + 1
        displayMixiotepuerco(mixiote_puerco[i-1],i)

    }

    fun decreaseMixiotepuerco(view: View?) {
        val i: Int = view?.getTag() as Int
        if (mixiote_puerco[i-1] > 0) {
            mixiote_puerco[i-1] = mixiote_puerco[i-1] - 1
            displayMixiotepuerco(mixiote_puerco[i-1],i)
        }
    }

    fun displayMixiotepuerco(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintmixiotepuerco = findViewById<View>(R.id.integer_mixiotepuerco) as TextView
        val displayintmixiotepuercotot = findViewById<View>(R.id.integer_mixiotepuercotot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_mixiote)
        tot_mixiote_puerco[i-1] = number * precio
        displayintmixiotepuerco.text = "" + number
        displayintmixiotepuercotot.text = dec.format(tot_mixiote_puerco[i-1])

        val total_mixiote = findViewById<View>(R.id.integer_totalmixiote) as TextView
        tot_mixiote[i-1] = tot_mixiote_pollo[i-1] +tot_mixiote_puerco[i-1]

        total_mixiote.text = dec.format(tot_mixiote[i-1])


    }



//////////////



    fun increasePancita(view: View?) {
        val i: Int = view?.getTag() as Int
        pancita[i-1] = pancita[i-1] + 1
        displayPancita(pancita[i-1],i)

    }

    fun decreasePancita(view: View?) {
        val i: Int = view?.getTag() as Int
        if (pancita[i-1] > 0) {
            pancita[i-1] = pancita[i-1] - 1
            displayPancita(pancita[i-1],i)
        }
    }

    fun displayPancita(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintpancita = findViewById<View>(R.id.integer_pancita) as TextView
        val displayintpancitatot = findViewById<View>(R.id.integer_pancitatot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_pancita)
        tot_pancita[i-1] = number * precio
        displayintpancita.text = "" + number
        displayintpancitatot.text = dec.format(tot_pancita[i-1])

        val total_pancita = findViewById<View>(R.id.integer_totalpancita) as TextView
        total_pancita.text = dec.format(tot_pancita[i-1])

    }


//////////////////////


    fun increasePambazo(view: View?) {
        val i: Int = view?.getTag() as Int
        pambazo[i-1] = pambazo[i-1] + 1
        displayPambazo(pambazo[i-1],i)

    }

    fun decreasePambazo(view: View?) {
        val i: Int = view?.getTag() as Int
        if (pambazo[i-1] > 0) {
            pambazo[i-1] = pambazo[i-1] - 1
            displayPambazo(pambazo[i-1],i)
        }
    }

    fun displayPambazo(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayintpambazo = findViewById<View>(R.id.integer_pambazo) as TextView
        val displayintpambazotot = findViewById<View>(R.id.integer_pambazotot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_pambazo)
        tot_pambazo[i-1] = number * precio
        displayintpambazo.text = "" + number
        displayintpambazotot.text = dec.format(tot_pambazo[i-1])

        val total_pambazo = findViewById<View>(R.id.integer_totalpambazo) as TextView
        total_pambazo.text = dec.format(tot_pambazo[i-1])

    }

//////////////////////


    fun increaseTacos(view: View?) {
        val i: Int = view?.getTag() as Int
        tacos[i-1] = tacos[i-1] + 1
        displayTacos(tacos[i-1],i)

    }

    fun decreaseTacos(view: View?) {
        val i: Int = view?.getTag() as Int
        if (tacos[i-1] > 0) {
            tacos[i-1] = tacos[i-1] - 1
            displayTacos(tacos[i-1],i)
        }
    }

    fun displayTacos(number: Int,i: Int) {
        val dec = DecimalFormat("'$'#,##0.00")
        val displayinttacos = findViewById<View>(R.id.integer_tacos) as TextView
        val displayinttacostot = findViewById<View>(R.id.integer_tacostot) as TextView
        val precio: Int = resources.getInteger(R.integer.price_tacos)
        tot_tacos[i-1] = number * precio
        displayinttacos.text = "" + number
        displayinttacostot.text = dec.format(tot_tacos[i-1])

        val total_tacos = findViewById<View>(R.id.integer_totaltacos) as TextView
        total_tacos.text = dec.format(tot_tacos[i-1])

    }










}




