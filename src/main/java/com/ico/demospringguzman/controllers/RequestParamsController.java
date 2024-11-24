package com.ico.demospringguzman.controllers;

import com.ico.demospringguzman.models.dto.ParamDTO;
import jakarta.servlet.http.HttpServletRequest;
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

    @GetMapping("/mostrar_mensaje_codigo")
    public ParamDTO mostrarMensajeYCodigo(@RequestParam String mensaje,
                                          @RequestParam Integer codigo) {
        ParamDTO paramDTO = new ParamDTO();
        paramDTO.setMessage(mensaje);
        paramDTO.setCode(codigo);
        return paramDTO;
        // http://localhost:8080/api/params/mostrar_mensaje_codigo?mensaje=hola&codigo=1234
    }

    @GetMapping("/request")
    public ParamDTO request(HttpServletRequest request) {
        Integer code = 10;
        try {
            code = Integer.parseInt(request.getParameter("codigo"));
        } catch (NumberFormatException e) {
        }
        ParamDTO paramDTO = new ParamDTO();
        paramDTO.setMessage(request.getParameter("mensaje"));
        paramDTO.setCode(code);
        return paramDTO;
        // http://localhost:8080/api/params/request?mensaje=hola&codigo=1234
    }
}
