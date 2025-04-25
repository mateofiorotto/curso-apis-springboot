package com.mateo.ejercicio01.service;

import com.mateo.ejercicio01.dto.CursoTemaDTO;
import com.mateo.ejercicio01.model.Curso;

import java.util.List;

public interface ICursoService {
    public List<Curso> getCursos();
    public void postCurso(Curso curso);
    public void deleteCurso(Long id_curso);
    public void updateCurso(Curso curso);
    public Curso findCurso(Long id_curso);
    public CursoTemaDTO temasPorCurso(Long id_curso);
    public List<Curso> cursosJava();
}
