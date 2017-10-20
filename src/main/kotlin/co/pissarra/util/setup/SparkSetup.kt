package co.pissarra.util.setup

import spark.kotlin.port

class SparkSetup {

    fun init() {
        port(8080)
    }
}