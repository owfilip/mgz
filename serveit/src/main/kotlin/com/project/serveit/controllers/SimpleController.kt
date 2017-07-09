package com.project.serveit.controllers

import org.springframework.beans.factory.annotation.Value
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

//@Controller
class SimpleController {
    @Value("\${spring.application.name}")
    private val applicationName: String? = null

    @RequestMapping
    fun helloPage(model: Model): String {
        model.addAttribute("appName", applicationName)

        //        dsl.insertInto(Resources.RESOURCES)

        return "hello"
    }
}