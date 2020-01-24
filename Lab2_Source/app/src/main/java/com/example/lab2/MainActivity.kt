package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.*

class MainActivity : AppCompatActivity() {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        this.button3.setOnClickListener{

            //Falta Toast que me muestra cuantas vueltas me faltan al dejar presionado
            //Falta ponerle logo/icono

            count++
            this.textView.setText(count.toString())

            if(count == 10){

                Toast.makeText(this, "Felicidades, le faltan solo 10 vueltas!", Toast.LENGTH_LONG).show()
                //Falta la imagen de felicitaciones

            }else if (count == 20){

                Toast.makeText(this, "Felicidades, ha logrado la meta!", Toast.LENGTH_LONG).show()
                //Falta imagen de felicitaciones

            }else if (count == 21){

                count = 0
                this.textView.setText(count.toString())
                Toast.makeText(this, "Inicie de nuevo", Toast.LENGTH_SHORT).show()

            }

        }


        this.button4.setOnClickListener{//Boton de reinicio

            count = 0
            this.textView.setText(count.toString())
            Toast.makeText(this, "Inicie de nuevo", Toast.LENGTH_SHORT).show()
        }

    }

}
