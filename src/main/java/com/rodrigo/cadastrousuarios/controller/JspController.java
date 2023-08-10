package com.rodrigo.cadastrousuarios.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspController {

    @GetMapping("/welcome")
    public String showWelcomePage() {
        return "welcome";
    }
}
