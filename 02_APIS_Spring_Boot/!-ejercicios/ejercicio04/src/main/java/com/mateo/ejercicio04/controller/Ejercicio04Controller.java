package com.mateo.ejercicio04.controller;

import com.mateo.ejercicio04.Plato;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Ejercicio04Controller {

    @GetMapping("platos")
    public ResponseEntity<List<Plato>> traerPlatos(){

        List<Plato> platos = new ArrayList<Plato>();
        platos.add(new Plato(1,100,"Milanesas"));
        platos.add(new Plato(2,200,"Asado"));
        platos.add(new Plato(3,300,"Caviar"));


        if (platos.isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(platos, HttpStatus.OK);

    }

    @GetMapping("platos/{id}")
    public ResponseEntity<Plato> traerPlato(@PathVariable int id){

        List<Plato> plato = new ArrayList<Plato>();
        plato.add(new Plato(1,100,"Milanesas"));
        plato.add(new Plato(2,200,"Asado"));
        plato.add(new Plato(3,300,"Caviar"));

        for (Plato p : plato){
            if (p.getId() == id){
                return new ResponseEntity<>(p, HttpStatus.OK);
            }
        }

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}
