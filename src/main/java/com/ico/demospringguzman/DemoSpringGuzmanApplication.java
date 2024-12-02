package com.ico.demospringguzman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
// @PropertySource("classpath:values.properties")
@PropertySources({
        @PropertySource("classpath:values.properties") // Se separan por comas
})
public class DemoSpringGuzmanApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringGuzmanApplication.class, args);
        System.out.println("Aplicación corriendo en puerto 8080");
    }

}
