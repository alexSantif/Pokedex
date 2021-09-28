package br.com.alex.pokedex.home.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.alex.pokedex.home.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        supportFragmentManager.beginTransaction()
            .replace(R.id.home_container, HomeFragment.newInstance())
            .setReorderingAllowed(true)
            .addToBackStack("splash")
            .commit()
    }
}