package com.mateo.ejercicio02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ejercicio02Controller {

    @GetMapping("/")
    public String devolverPeso(@RequestParam double IMC){
        String peso = "Indefinido";

        if (IMC <= 0.99) {
            return "Incorrecto";
        } else if (IMC >= 1 && IMC <= 18.59) {
            peso = "Peso insuficiente";
        } else if (IMC >= 18.60 && IMC <= 24.99) {
            peso = "Peso normal";
        } else if (IMC >= 25.0 && IMC <= 29.99) {
            peso = "Sobrepeso";
        } else if (IMC >= 30) {
            peso = "Obesidad";
        }

        return "El estado del peso es: " + peso;
    }
}
