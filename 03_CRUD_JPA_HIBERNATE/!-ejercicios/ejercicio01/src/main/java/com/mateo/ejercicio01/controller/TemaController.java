package com.mateo.ejercicio01.controller;

import com.mateo.ejercicio01.model.Tema;
import com.mateo.ejercicio01.service.ITemaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TemaController {
    private final ITemaService temaService;

    public TemaController(ITemaService temaService) {
        this.temaService = temaService;
    }

    // Metodo get
    @GetMapping("/temas/traer")
    public List<Tema> getTemas(){
        return temaService.getTemas();
    }

    // get x id
    @GetMapping("/temas/traer/{id_tema}")
    public Tema getTema(@PathVariable Long id_tema){
       return temaService.findTema(id_tema);
    }

    // post
    @PostMapping("/temas/crear")
    @ResponseBody
    public String postTema(@RequestBody Tema tema){
        temaService.postTema(tema);

        return "Tema creado correctamente";
    }

    // put
    @PutMapping("/temas/editar")
    public String updateTema(@RequestBody Tema tema){
        temaService.updateTema(tema);

        return "Tema editado correctamente";
    }

    // delete
    @DeleteMapping("/temas/eliminar/{id_tema}")
    public String deletePersona(@PathVariable Long id_tema){
        temaService.deleteTema(id_tema);

        return "Tema eliminado correctamente";
    }
}
