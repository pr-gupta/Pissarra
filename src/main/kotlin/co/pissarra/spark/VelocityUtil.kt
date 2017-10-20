package co.pissarra.spark

import spark.ModelAndView
import spark.template.velocity.VelocityTemplateEngine



class VelocityUtil {
    companion object {
        fun render(model: Map<String, Any>, templatePath: String): String {
            return VelocityTemplateEngine().render(ModelAndView(model, templatePath))
        }
    }
}