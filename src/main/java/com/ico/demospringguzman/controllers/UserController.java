package com.ico.demospringguzman.controllers;

import com.ico.demospringguzman.models.User;
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
        // Agregando un objeto a la salida
        User user=new User();
        user.setName("Luis");
        user.setLastname("Morales");
        user.setEmail("josegarcia@gmail.com");
        model.addAttribute("user", user);
        return "details";
    }
}
