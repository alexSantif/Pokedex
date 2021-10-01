package br.com.alex.pokedex.mypokemons.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.alex.pokedex.mypokemons.R
import br.com.alex.router.FeatureRouter
import org.koin.android.ext.android.inject

class PokemonsFragment : Fragment() {

    private val featureRouter: FeatureRouter by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pokemons, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        @JvmStatic
        fun newInstance() = PokemonsFragment()
    }
}