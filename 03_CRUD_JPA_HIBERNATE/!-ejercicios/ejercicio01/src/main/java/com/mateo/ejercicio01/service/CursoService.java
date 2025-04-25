package com.mateo.ejercicio01.service;

import com.mateo.ejercicio01.dto.CursoDTO;
import com.mateo.ejercicio01.model.Curso;
import com.mateo.ejercicio01.repository.ICursoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService implements ICursoService {

    //DI
    private final ICursoRepository cursoRepository;

    public CursoService(ICursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    //Metodo GET - Obtener Cursos
    @Override
    public List<Curso> getCursos() {
        List<Curso> listaCursos = cursoRepository.findAll();

        return listaCursos;
    }

    //Metodo POST - Crear Curso
    @Override
    public void postCurso(Curso curso) {
        cursoRepository.save(curso);
    }

    //Metodo DELETE - Borrar Curso
    @Override
    public void deleteCurso(Long id_curso) {
        cursoRepository.deleteById(id_curso);
    }

    //Metodo UPDATE - Actualizar Curso
    @Override
    public void updateCurso(Curso curso) {
        this.postCurso(curso);
    }

    //Metodo FIND - Encontrar curso por ID
    @Override
    public Curso findCurso(Long id_curso) {
        Curso curso = cursoRepository.findById(id_curso).orElse(null);

        return curso;
    }
}
