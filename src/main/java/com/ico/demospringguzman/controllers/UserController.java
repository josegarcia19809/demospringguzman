package com.ico.demospringguzman.controllers;

import com.ico.demospringguzman.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("title", "Hola Mundo Sprint Boot");
        model.addAttribute("name", "José");
        model.addAttribute("lastname", "García");
        // Agregando un objeto a la salida
        User user = new User();
        user.setName("Luis");
        user.setLastname("Morales");
        user.setEmail("josegarcia@gmail.com");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String listaUsuarios(ModelMap model) {
        List<User> usuarios = new ArrayList<>();
        model.addAttribute("title", "Listado de usuarios");
        model.addAttribute("users", usuarios);
        return "list";
    }
}
