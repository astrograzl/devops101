package com.gfa.frontman;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Frontman {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }
}
