package br.com.alex.pokedex.home.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import br.com.alex.pokedex.home.R
import br.com.alex.router.FeatureRouter
import br.com.alex.router.actions.OpenHomeAction
import br.com.alex.router.actions.OpenPokedexAction
import br.com.alex.router.actions.OpenPokemonsAction
import org.koin.android.ext.android.inject

class HomeFragment : Fragment() {

    private val featureRouter: FeatureRouter by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button_pokedex).setOnClickListener {
            featureRouter.start(requireActivity(), OpenPokedexAction)
        }

        view.findViewById<Button>(R.id.button_my_pokemons).setOnClickListener {
            featureRouter.start(requireActivity(), OpenPokemonsAction)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}