package br.com.alex.pokedex.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import br.com.alex.pokedex.R
import br.com.alex.router.FeatureRouter
import br.com.alex.router.actions.OpenHomeAction
import com.airbnb.lottie.LottieAnimationView
import org.koin.android.ext.android.inject

class SplashFragment : Fragment() {

    private val featureRouter: FeatureRouter by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button_test_mine).setOnClickListener {
            featureRouter.start(requireContext(), OpenHomeAction)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = SplashFragment()
    }
}