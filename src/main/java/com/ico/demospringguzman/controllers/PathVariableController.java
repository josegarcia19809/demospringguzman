package com.ico.demospringguzman.controllers;

import com.ico.demospringguzman.models.User;
import com.ico.demospringguzman.models.dto.ParamDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @Value("${config.username}")
    private String userName;

//    @Value("${config.message}")
//    private String message;

    @Value("${config.lista}")
    private String[] lista;

    @Value("#{'${config.lista}'.split(',')}")
    private List<String> listaSeparadaPorComas;

    @Value("#{'${config.lista}'.toUpperCase()}")
    private String valueString;

    @Value("#{${config.valuesMap}}")
    private Map<String, Object> valuesMap;

    @Value("#{${config.valuesMap}.product}")
    private String product;

    @Value("#{${config.valuesMap}.price}")
    private Long price;

    @Value("${config.lista}")
    private List<String> listOfValues;

    @Value("${config.code}")
    private Integer code;

    @Autowired
    private Environment environment;

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

    @GetMapping("/values")
    public Map<String, Object> getValues(@Value("${config.message}") String message) {
        Map<String, Object> json = new HashMap<>();
        Long code2 = environment.getProperty("config.code", Long.class);
        json.put("username", userName);
        json.put("code", code);
        json.put("message", message);
        json.put("messageEnvironment", environment.getProperty("config.message"));
        json.put("codeEnvironment", environment.getProperty("config.code"));
        json.put("codeEnvironmentLong", environment.getProperty("config.code", Long.class));
        json.put("codeEnvironmentInt", Integer.valueOf(Objects.requireNonNull(environment.
                getProperty("config.code"))));
        json.put("codeEnvironmentLong2", code2);
        json.put("lista", lista);
        json.put("listOfValues", listOfValues);
        json.put("listaSeparadaPorComas", listaSeparadaPorComas);
        json.put("valueString", valueString);
        json.put("valuesMap", valuesMap);
        json.put("product", product);
        json.put("price", price);

        return json;
        // http://localhost:8080/api/var/values -- Usar Postman
    }
}
