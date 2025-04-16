package com.mateo.ejercicio06.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class NotasController {

    @GetMapping("/notas")
    @ResponseBody
    public double notas(@RequestParam double nota1, @RequestParam double nota2, @RequestParam double nota3) {
        double promedio = (nota1+nota2+nota3)/3.0;
        return promedio;
    }

}
