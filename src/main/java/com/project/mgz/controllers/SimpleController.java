package com.project.mgz.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleController {
    @Value("${spring.application.name}")
    private String applicationName;

    @RequestMapping
    public String helloPage(Model model) {
        model.addAttribute("appName", applicationName);

        return "hello";
    }
}
