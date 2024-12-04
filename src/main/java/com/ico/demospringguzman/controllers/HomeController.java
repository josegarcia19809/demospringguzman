package com.ico.demospringguzman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"", "/", "/home"})
    public String home(){
        return "redirect:/list";
    }

    @GetMapping({"/home2", "/home3", "/home4"})
    public String home2(){
        return "forward:/list";
    }
}


/*
    En el código proporcionado, la diferencia clave entre los métodos radica en el
    uso de redirect y forward al devolver las respuestas desde los controladores:

1. redirect
Se utiliza para realizar una redirección a otra URL.
Al usar redirect:/list, el navegador del cliente recibirá una nueva
solicitud HTTP para la URL /list.
Esto genera un cambio visible en la barra de direcciones del navegador,
ya que el cliente es informado para realizar una nueva petición.
Ideal para escenarios en los que necesitas dirigir al cliente a una URL externa o
necesitas evitar el reenvío de formularios.

Comportamiento:
El cliente accede a /home.
El servidor responde indicando una redirección.
El cliente realiza una nueva petición HTTP a /list.

2. forward
Se utiliza para realizar un reenvío interno a otro controlador o vista dentro del
mismo servidor.
Al usar forward:/list, la solicitud se reenvía internamente dentro del servidor
sin que el navegador del cliente lo note.
Esto no cambia la URL visible en la barra de direcciones del navegador.
Útil cuando quieres procesar más lógica en el servidor y evitar enviar múltiples solicitudes.

Comportamiento:
El cliente accede a /home2.
El servidor reenvía internamente la solicitud al controlador o recurso asociado a /list.
La URL en el navegador sigue siendo /home2.
 */