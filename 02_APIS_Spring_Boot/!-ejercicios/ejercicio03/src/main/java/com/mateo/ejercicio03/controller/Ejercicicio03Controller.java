package com.mateo.ejercicio03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ejercicicio03Controller {

    @GetMapping("/ejercicio03/requestparam")
    public String devolverLitros(@RequestParam double galones){
        double litros = galones * 3.78541;

        return "RequestParam - Los litros necesarios para cubrir " + galones + " galones, son: " + litros;
    }

    @GetMapping("/ejercicio03/pathvariable/{galones}")
    public String devolverLitros2(@PathVariable double galones){
        double litros = galones * 3.78541;

        return "PathVariable - Los litros necesarios para cubrir " + galones + " galones, son: " + litros;
    }
}
