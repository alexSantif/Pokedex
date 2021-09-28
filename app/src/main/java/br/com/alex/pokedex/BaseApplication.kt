package br.com.alex.pokedex

import android.app.Application
import br.com.alex.router.di.RouterModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@BaseApplication)
            modules(RouterModule.instance)
        }
    }
}