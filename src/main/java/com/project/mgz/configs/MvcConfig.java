package com.project.mgz.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
    private static final String HOME_VIEW = "home";
    private static final String LOGIN_VIEW = "login";
    private static final String HELLO_VIEW = "hello";

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName(HOME_VIEW);
        registry.addViewController("/").setViewName(HOME_VIEW);
        registry.addViewController("/login").setViewName(LOGIN_VIEW);
        registry.addViewController("/hello").setViewName(HELLO_VIEW);
    }
}
