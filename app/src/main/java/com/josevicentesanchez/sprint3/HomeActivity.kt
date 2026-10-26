package com.josevicentesanchez.sprint3

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class HomeActivity : ComponentActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        button = findViewById(R.id.button)

        button.setOnClickListener {
            Toast.makeText(
                this,
                "Todavía no implementado.",
                Toast.LENGTH_LONG
            ).show()
        }
    }

    /*
    * En el momento de diseñar esta pantalla, he tratado de tener en cuenta, por un lado, la correcta utilización
    * de los componentes .xml y las buenas prácticas que hemos estado aprendiendo hasta ahora, como la utilización
    * del archivo strings.xml para añadir el texto a los elementos.
    * Por otro lado, he tratado de realizar un buen diseño de UI + UX, creando un botón funcional y tratando de
    * utilizar correctamente los principios de CRAP.
    * Finalmente, siguiendo los principios de accesibilidad, he decidido no añadir TalkBack a la imagen, ya que
    * esta no aporta ninguna información extra. Además, he situado el botón alejado del resto de elementos de la
    * pantalla y utilizado otros colores que no desentonen para que sea fácilmente identificable.
    * */
}