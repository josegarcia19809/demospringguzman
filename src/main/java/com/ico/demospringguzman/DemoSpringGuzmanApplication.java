package com.ico.demospringguzman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoSpringGuzmanApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringGuzmanApplication.class, args);
        System.out.println("Aplicación corriendo en puerto 8080");
    }

}
