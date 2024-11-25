package com.ico.demospringguzman.controllers;

import com.ico.demospringguzman.models.dto.ParamDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
