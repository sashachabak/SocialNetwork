package com.eviaal.socialnetworkv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/news")
public class NewsController {
    @GetMapping
    public String showNewsPage() {
        return "index";
    }
}
