package br.com.mcaa.apprepositorygithub

import android.app.Application
import br.com.mcaa.apprepositorygithub.data.di.DataModule
import br.com.mcaa.apprepositorygithub.domain.di.DomainModule
import br.com.mcaa.apprepositorygithub.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()

    }
}