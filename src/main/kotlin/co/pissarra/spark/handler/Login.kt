package co.pissarra.spark.handler

import spark.ModelAndView
import spark.Request
import spark.Response
import spark.template.velocity.VelocityTemplateEngine

class Login {
    companion object {
        val getLoginPage = { req: Request, res: Response ->
            VelocityTemplateEngine().render(ModelAndView(HashMap<String, Any>(), "/public/templates/login.vm"))
        }
    }
}