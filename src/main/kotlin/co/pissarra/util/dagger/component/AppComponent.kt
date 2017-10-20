package co.pissarra.util.dagger.component

import co.pissarra.util.dagger.module.SetUpModule
import co.pissarra.util.setup.SparkSetup
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(SetUpModule::class))
interface AppComponent {
    fun sparkSetup() : SparkSetup
}