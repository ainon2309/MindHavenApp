package com.mindhaven.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "login"; // Refers to login.jsp
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup"; // Refers to signup.jsp
    }
}
