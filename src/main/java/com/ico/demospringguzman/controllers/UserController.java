package com.ico.demospringguzman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title", "Hola Mundo Sprint Boot");
        model.addAttribute("name", "José");
        model.addAttribute("lastname", "García");
        return "details";
    }
}
