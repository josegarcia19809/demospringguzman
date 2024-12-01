package com.ico.demospringguzman.controllers;

import com.ico.demospringguzman.models.User;
import com.ico.demospringguzman.models.dto.ParamDTO;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @GetMapping("/producto/{nombre}")
    public ParamDTO getProducto(@PathVariable String nombre) {
        ParamDTO paramDTO = new ParamDTO();
        paramDTO.setMessage(nombre);
        paramDTO.setCode(0);
        return paramDTO;
        // http://localhost:8080/api/var/producto/pc
    }

    @GetMapping("/producto_mix/{nombre}/{id}")
    public Map<String, Object> getProducto(@PathVariable String nombre,
                                       @PathVariable int id) {
        Map<String, Object> map = new HashMap<>();
        map.put("producto", nombre);
        map.put("id", id);
        return map;
        // http://localhost:8080/api/var/producto_mix/pc/2500
    }

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        user.setName(user.getName().toUpperCase());
        user.setLastname(user.getLastname().toUpperCase());
        return user;
        // http://localhost:8080/api/var/create -- Usar Postman
    }
}
