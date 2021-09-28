package br.com.alex.pokedex.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.alex.pokedex.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportFragmentManager.beginTransaction()
            .replace(R.id.splash_container, SplashFragment.newInstance())
            .setReorderingAllowed(true)
            .addToBackStack("splash")
            .commit()
    }
}