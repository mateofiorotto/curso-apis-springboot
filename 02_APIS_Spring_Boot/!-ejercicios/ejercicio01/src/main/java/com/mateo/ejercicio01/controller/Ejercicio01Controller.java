package com.mateo.ejercicio01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ejercicio01Controller {

    @GetMapping("/{num1}/{num2}")
    public String suma(@PathVariable int num1,
                    @PathVariable int num2){
        int suma = num1 + num2;


        return "La suma es: " + suma;
    }

}
