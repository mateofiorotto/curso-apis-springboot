package com.mateo.ejercicio01.controller;

import com.mateo.ejercicio01.model.Curso;
import com.mateo.ejercicio01.service.ICursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CursoController {
    private final ICursoService cursoService;

    public CursoController(ICursoService cursoService) {
        this.cursoService = cursoService;
    }

    // Metodo get
    @GetMapping("/cursos/traer")
    public List<Curso> getCursos(){
        return cursoService.getCursos();
    }

    // get x id
    @GetMapping("/cursos/traer/{id_curso}")
    public Curso getCurso(@PathVariable Long id_curso){
       return cursoService.findCurso(id_curso);
    }

    // post
    @PostMapping("/cursos/crear")
    @ResponseBody
    public String postCurso(@RequestBody Curso curso){
        cursoService.postCurso(curso);

        return "Curso creado correctamente";
    }

    // put
    @PutMapping("/cursos/editar")
    public String updateCurso(@RequestBody Curso curso){
        cursoService.updateCurso(curso);

        return "Curso editado correctamente";
    }

    // delete
    @DeleteMapping("/cursos/eliminar/{id_curso}")
    public String deletePersona(@PathVariable Long id_curso){
        cursoService.deleteCurso(id_curso);

        return "Curso eliminado correctamente";
    }
}
