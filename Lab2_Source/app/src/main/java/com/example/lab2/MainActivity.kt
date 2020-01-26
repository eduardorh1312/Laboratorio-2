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

        val imageShift = findViewById<ImageView>(R.id.imageView5)



        this.button3.setOnClickListener {


            //Falta ponerle logo/icono

            count++
            this.textView.setText(count.toString())

            imageShift.setImageResource(R.drawable.empty)


            if (count == 10) {

                Toast.makeText(this, "Felicidades, le faltan solo 10 vueltas!", Toast.LENGTH_LONG).show()

                imageShift.setImageResource(R.drawable.ic_directions_run_blue_110dp)

            } else if (count == 20) {

                Toast.makeText(this, "Felicidades, ha logrado la meta!", Toast.LENGTH_LONG).show()
                //Falta imagen de felicitaciones

                imageShift.setImageResource(R.drawable.ic_star_yellow_110dp)

            } else if (count == 21) {

                count = 0
                this.textView.setText(count.toString())
                Toast.makeText(this, "Inicie de nuevo", Toast.LENGTH_SHORT).show()

                imageShift.setImageResource(R.drawable.empty)


            }

            button3.setOnLongClickListener {

                var n = 20 - count
                var r = " vueltas restantes"

                Toast.makeText(this, n.toString() + r, Toast.LENGTH_SHORT).show()

                return@setOnLongClickListener true


            }


            this.button4.setOnClickListener {
                //Boton de reinicio

                count = 0
                this.textView.setText(count.toString())
                Toast.makeText(this, "Inicie de nuevo", Toast.LENGTH_SHORT).show()
                imageShift.setImageResource(R.drawable.empty)

            }

        }

    }

}