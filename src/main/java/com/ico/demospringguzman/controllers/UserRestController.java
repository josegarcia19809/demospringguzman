package com.ico.demospringguzman.controllers;

import com.ico.demospringguzman.models.User;
import com.ico.demospringguzman.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserRestController {
    // @RequestMapping(path = "/details", method = RequestMethod.GET) // Otra forma
    @GetMapping("details-map")
    public Map<String, Object> detailsRestMap() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("title", "Hola Mundo Sprint Boot");
        respuesta.put("name", "José");
        respuesta.put("lastname", "García");

        // Agregando un objeto a la salida
        User user = new User();
        user.setName("Luis");
        user.setLastname("Morales");
        respuesta.put("user", user);

        return respuesta; // localhost:8080/api/details-map
    }

    // Devolver una lista de usuarios
    @GetMapping("/list")
    public List<User> listaUsuarios() {
        List<User> usuarios = new ArrayList<>();
        usuarios.add(new User("Rosa", "Sanchez"));
        usuarios.add(new User("María", "De la O"));
        usuarios.add(new User("Jimena", "Moreno"));
        return usuarios; // localhost:8080/api/list
    }

    @GetMapping("details-dto")
    public UserDto detailsRestDTO() {
        // Agregando un objeto a la salida
        UserDto userDto = new UserDto();
        User user = new User();
        user.setName("Luis");
        user.setLastname("Morales");

        userDto.setTitle("Bienvenido a las clases DTO");
        userDto.setUser(user);

        return userDto; // localhost:8080/api/details-dto
    }

}
