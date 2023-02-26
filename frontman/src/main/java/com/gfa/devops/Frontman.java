package com.gfa.devops;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Frontman {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("user", new Customer());
        return "index";
    }

    @PostMapping("/user")
    public String user(Model model, @RequestParam Customer user) {
        return "profile";
    }
}
