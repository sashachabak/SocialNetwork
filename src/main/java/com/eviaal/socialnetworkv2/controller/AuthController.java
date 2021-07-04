package com.eviaal.socialnetworkv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {
    @GetMapping("/sign-up")
    public String loginPage() {
        return "signup";
    }
    @GetMapping("/login")
    public String loginPage2() {
        return "signup";
    }

}
