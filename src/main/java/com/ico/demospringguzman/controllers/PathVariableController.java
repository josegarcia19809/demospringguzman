package com.ico.demospringguzman.controllers;

import com.ico.demospringguzman.models.dto.ParamDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
