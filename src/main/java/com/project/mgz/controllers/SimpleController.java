package com.project.mgz.controllers;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleController {
    @Value("${spring.application.name}")
    private String applicationName;

    @Autowired
    private DSLContext dsl;

    @RequestMapping
    public String helloPage(Model model) {
        model.addAttribute("appName", applicationName);

//        dsl.insertInto(Resources.RESOURCES)

        return "hello";
    }
}
