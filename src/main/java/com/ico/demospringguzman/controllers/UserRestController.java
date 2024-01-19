package com.ico.demospringguzman.controllers;

import com.ico.demospringguzman.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
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
        User user=new User();
        user.setName("Luis");
        user.setLastname("Morales");
        respuesta.put("user", user);

        return respuesta;
    }

}
