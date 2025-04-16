package com.mateo.ejercicio08.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrianguloController {

    @GetMapping("/triangulo")
    public String areaTriangulo(@RequestParam double base,
                                @RequestParam double altura){

        if (base == 0 || altura == 0){
            return "Altura o base no pueden ser 0";
        }

        double area = (base * altura) / 2;

        return "El area es: " + area;
    }
}
