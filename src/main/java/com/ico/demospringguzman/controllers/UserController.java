package com.ico.demospringguzman.controllers;

import com.ico.demospringguzman.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.Arrays;
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
        model.addAttribute("title", "Listado de usuarios");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel() {
        return Arrays.asList(
                new User("José", "García", "josegarcia@gmail.com"),
                new User("Rox", "Sánchez"),
                new User("Jimena", "Robles", "jimena@gmail.com"),
                new User("Luis", "Morales")
        );
    }
}
