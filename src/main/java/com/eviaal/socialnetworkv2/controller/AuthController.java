package com.eviaal.socialnetworkv2.controller;

import com.eviaal.socialnetworkv2.entity.User;
import com.eviaal.socialnetworkv2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;
    @Autowired
    public AuthController(UserService userService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/sign-up")
    public String loginPage() {
        return "signup";
    }

    @GetMapping("/login")
    public String loginPage2(@ModelAttribute("user") User user) {
        return "signup";
    }

    @PostMapping("/sign-up")
    public String registration(@ModelAttribute("user") User user) {
        System.out.println(user.toString());
        if(!userService.isExist(user.getEmail())) {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            userService.save(user);
            return "redirect:/news";
        } else return "signup";

    }
}
