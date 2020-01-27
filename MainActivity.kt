package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.*


class MainActivity : AppCompatActivity() {

    var count = 0 // Inicializo la variable count en 0 para ser utilizada en el contador

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageShift = findViewById<ImageView>(R.id.imageView5)

        /*Identifico el imageView que utilizare para hacer display cuando la funcion sea requerida
         *en count == 10 y count == 10.
        */


        this.button3.setOnClickListener {
            //Se le da funcionalidad a lo que pase cuando exista señal del boton "Vuelta"

            count++
            //Cada vez que se presione el boton el valor inicial de count 0 aumentara 1

            this.textView.setText(count.toString())
            //Mientras se va aumentando el valor numerico se convierte en String para imprimirlo en pantalla

            imageShift.setImageResource(R.drawable.empty)//Imagen vacia


            if (count == 10) {
                //Cuando el valor de count == 10 se mostrara un mensaje de las vueltas restantes y
                // aparecera la imagen de un corredor de color azul

                Toast.makeText(this, "Felicidades, le faltan solo 10 vueltas!", Toast.LENGTH_LONG).show()

                imageShift.setImageResource(R.drawable.ic_directions_run_blue_110dp)

            } else if (count == 20) {
                /*Cuando el valor de count == 20 se mostrara un mensaje de felicitaciones por objetivo
                *alcanzado y aparecera la imagen de una estrella
                */

                Toast.makeText(this, "Felicidades, ha logrado la meta!", Toast.LENGTH_LONG).show()

                imageShift.setImageResource(R.drawable.ic_star_yellow_110dp)

            } else if (count == 21) {
                /*
                 *Cuando el valor de count == 21 se reiniciara el valor inicial a 0
                 * para iniciar un nuevo ciclo de vueltas
                 */



                count = 0
                this.textView.setText(count.toString())
                Toast.makeText(this, "Inicie de nuevo", Toast.LENGTH_SHORT).show()

                imageShift.setImageResource(R.drawable.empty)


            }

            button3.setOnLongClickListener {

                /*
                Cuando se haga una presion prolongada se mostraran el numero de vueltas restantes
                no importa en el valor que se encuentre
                 */

                var n = 20 - count
                var r = " vueltas restantes"

                Toast.makeText(this, n.toString() + r, Toast.LENGTH_SHORT).show()

                return@setOnLongClickListener true


            }

            //Boton de reinicio
            this.button4.setOnClickListener {
                /*Cuando el boton de reinicio sea presionado count tomara e valor
                * inicial 0 y volvera a iniciar el ciclo.
                */

                count = 0
                this.textView.setText(count.toString())
                Toast.makeText(this, "Inicie de nuevo", Toast.LENGTH_SHORT).show()
                imageShift.setImageResource(R.drawable.empty)

            }

        }

    }

}