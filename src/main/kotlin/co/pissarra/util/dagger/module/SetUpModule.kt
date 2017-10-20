package co.pissarra.util.dagger.module

import co.pissarra.util.setup.SparkSetup
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SetUpModule {
    @Provides
    @Singleton
    fun provideSparkSetup() : SparkSetup {
        return SparkSetup()
    }

}