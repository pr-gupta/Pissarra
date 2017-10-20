package co.pissarra

import co.pissarra.util.dagger.component.DaggerAppComponent

fun main(args: Array<String>) {
    DaggerAppComponent.builder().build().sparkSetup().init()
}