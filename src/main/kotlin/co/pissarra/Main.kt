package co.pissarra

import co.pissarra.util.dagger.component.DaggerAppComponent
import co.pissarra.util.dagger.module.SetUpModule
import org.apache.logging.log4j.LogManager

fun main(args: Array<String>) {

    if (args.size < 1) {
        LogManager.getLogger().error("Insufficient arguments provided. " +
                "\n\tFollowing are the required arguments.\n" +
                "\t\t1. port-number - Port Number to start spark")
        Thread.sleep(1000)
        return
    }

    DaggerAppComponent.builder().setUpModule(SetUpModule(args[0].toInt())).build().sparkSetup().init()
}