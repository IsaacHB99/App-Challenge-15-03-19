package com.example.games

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.collections.ArrayList
import android.os.Handler

class GatoActivity : AppCompatActivity() {

    /*
*
* Completa el código
*
* Crea un Tablero y un JugadorAutomatic
* */
    fun onClick(v: View?) {
        btnSelected(v as Button)
    }

    private fun btnSelected(button: Button) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private var  cells= mutableMapOf<Int,String>()
    private var isX=true
    private var winner:String=""
    private val totalCell=9
    private lateinit var txtResult: TextView
    private val x="X"
    private val colorX= Color.BLUE
    private val o="O"
    private val colorO= Color.MAGENTA
    private var btns= arrayOfNulls<Button>(totalCell)
    private var btnColor=colorX
    private val combinations: Array<IntArray> = arrayOf(
        intArrayOf(0,1,2),
        intArrayOf(3,4,5),
        intArrayOf(6,7,8),
        intArrayOf(0,3,6),
        intArrayOf(1,4,7),
        intArrayOf(2,5,8),
        intArrayOf(0,4,8),
        intArrayOf(2,4,6)
    )

    var player = 1;
    var p1 = ArrayList<Int>()
    var p2 = ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        * Completa el códig:
        *
        * asigna a tu JugadorAutomatic la Ficha con la que juega.
        * * */
    }

    fun gameOn(buttonCode:Int, selectedButton:Button){
        if(player == 1){
            selectedButton.text = "X"
            selectedButton.setBackgroundResource(R.color.blue)
            p1.add(buttonCode)
            player = 2


        }else if(player == 2){
            selectedButton.text = "O"
            selectedButton.setBackgroundResource(R.color.green)
            p2.add(buttonCode)
            player = 1
        }
        selectedButton.isEnabled = false
    }



    fun andTheWinnerIs(player :ArrayList<Int>): Boolean{
        var win :Boolean = false
        if(player.contains(1) && player.contains(2)  && player.contains(3) ) win = true
        if (player.contains(4)&&player.contains(5)&&player.contains(6)) win = true
        if (player.contains(7)&&player.contains(8)&&player.contains(9)) win = true
        if (player.contains(1)&&player.contains(4)&&player.contains(7)) win = true
        if (player.contains(2)&&player.contains(5)&&player.contains(8)) win = true
        if (player.contains(3)&&player.contains(6)&&player.contains(9)) win = true
        if (player.contains(1)&&player.contains(5)&&player.contains(9)) win = true
        if (player.contains(3)&&player.contains(5)&&player.contains(7)) win = true

        return win

    }






    fun select(view: View) {
        val selectedButton = view as Button
        var buttonCode = 0
        when(selectedButton.id){
            R.id.button -> buttonCode = 1
            R.id.button2 -> buttonCode = 2
            R.id.button3 -> buttonCode = 3
            R.id.button4 -> buttonCode = 4
            R.id.button5 -> buttonCode = 5
            R.id.button6-> buttonCode = 6
            R.id.button7-> buttonCode = 7
            R.id.button8-> buttonCode = 8
            R.id.button9-> buttonCode =9
        }

        gameOn(buttonCode,selectedButton)

        /*
   Completa el código:

   Llama a la función de "move" utilzando un Handler().postDelayed de 1 segundo

    * */
        Handler handler = new Handler()
        Runnable move = new Runnable() {
            public void run() {
                handler.postDelayed(this, 1000)
            }
        }


       if (andTheWinnerIs(p1) ){
           Toast.makeText(this,
               "AND the winner is PLAYER 1", Toast.LENGTH_LONG).show()
       }else if(andTheWinnerIs(p2)){
           Toast.makeText(this,
               "AND the winner is PLAYER 2", Toast.LENGTH_LONG).show()
       }

    }


    /*
    Completa el código:

    Debes mapear el renglo y la columna para regrar un Pair.... WHAAAAATTTTT, investiga qué es un Pair

    El Pair debe regresar:
        1. el número de la ficha, del 1 al 9
        2. el Button correspondiente con la interfaz

     * */
    fun nextFicha(renglon : Int, columna : Int) {
        var pair = "NOT implemented"

    }

    /*
    Completa el código:

    Completa la funcjón y realiza lo siguiente:
    1. Ejecuta: ___TU JUGADORAUTOMATIC__.tablero.setTablero(p1, p2)
    2. Obten el siguiente movimiento automático
    3. Ejecuta la función de nextFicha y obten el pair
    4. Manda el pair a gameOn como corresponde

     * */

    fun move(){

    }
}
