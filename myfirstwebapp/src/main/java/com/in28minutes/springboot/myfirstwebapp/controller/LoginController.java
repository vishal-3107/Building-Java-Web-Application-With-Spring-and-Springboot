package com.in28minutes.springboot.myfirstwebapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("login-page")
    public String loginPage(@RequestParam String name, ModelMap model )
    {
        model.put("name", name);
        logger.debug("Request param is {}", name);
        logger.info("I want to printed at info level");
        logger.warn("i want to printed this at warn level");
        return "LoginPage";
    }
}
