package co.pissarra.spark.handler

import co.pissarra.spark.VelocityUtil
import co.pissarra.util.TemplatePath
import spark.Request
import spark.Response

class Login {
    companion object {
        val getLoginPage = { _: Request, _: Response ->
            VelocityUtil.render(HashMap(), TemplatePath.GET_LOGIN_PAGE)
        }
    }
}