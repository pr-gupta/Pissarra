package co.pissarra.util.setup

import co.pissarra.spark.handler.Login
import org.apache.logging.log4j.LogManager
import spark.Spark.*
import spark.kotlin.port
import javax.inject.Inject


class SparkSetup @Inject constructor(private val port: Int) {

    private val logger = LogManager.getLogger(SparkSetup::javaClass)!!

    fun init() {
        port(port)
        staticFileLocation("/public")
        setupPath()
    }

    private fun setupPath() {
        path("/", {
            before("/*", { req, res ->
                logger.info("Received request with request as $req")
            })

            get("/login", Login.getLoginPage)
        })
    }
}