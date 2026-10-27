package com.josevicentesanchez.sprint3

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.josevicentesanchez.sprint3.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.fighterCard.name = "Mr Jagger"
        binding.fighterCard.surname = "Jagger Princesa"
        binding.fighterCard.setProfileImage(R.drawable.mrjagger)
        binding.fighterCard.setBodyImage(R.drawable.mrjagger2)
        binding.fighterCard.setOnAccionClickListener {

            Toast.makeText(
                this,
                "Has votado!",
                Toast.LENGTH_LONG
            )
        }
    }
}


