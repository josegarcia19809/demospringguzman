package com.ico.demospringguzman.controllers;

import com.ico.demospringguzman.models.dto.ParamDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/mostrar_mensaje")
    public ParamDTO mostrarMensaje(@RequestParam(required = false,
            defaultValue = "hola") String mensaje) {
        ParamDTO paramDTO = new ParamDTO();
        paramDTO.setMessage(mensaje);
        return paramDTO;
        // http://localhost:8080/api/params/mostrar_mensaje?mensaje=buenas
        // http://localhost:8080/api/params/mostrar_mensaje
    }
}