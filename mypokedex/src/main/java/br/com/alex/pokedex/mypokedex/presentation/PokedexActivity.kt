package br.com.alex.pokedex.mypokedex.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.alex.pokedex.mypokedex.R

class PokedexActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokedex)

        supportFragmentManager.beginTransaction()
            .replace(R.id.pokedex_container, PokedexFragment.newInstance())
            .setReorderingAllowed(true)
            .addToBackStack("home")
            .commit()
    }
}