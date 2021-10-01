package br.com.alex.pokedex.mypokemons.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.alex.pokedex.mypokemons.R

class PokemonsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemons)

        supportFragmentManager.beginTransaction()
            .replace(R.id.pokemons_container, PokemonsFragment.newInstance())
            .setReorderingAllowed(true)
            .addToBackStack("home")
            .commit()
    }
}