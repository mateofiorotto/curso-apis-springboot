package com.mateo.ejercicio01.service;

import com.mateo.ejercicio01.dto.CursoTemaDTO;
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

    //4. Obtener Temas por Curso
    @Override
    public CursoTemaDTO temasPorCurso(Long id_curso) {

        // instancia de CursoTemaDTO
        CursoTemaDTO cursoTemaDTO = new CursoTemaDTO();

        //buscamos el curso por el metodo previamente creado FIND
        Curso curso = this.findCurso(id_curso);
        cursoTemaDTO.setNombreCurso(curso.getNombre());
        cursoTemaDTO.setListaTemas(curso.getListaDeTemas());

        return cursoTemaDTO;
    }

    //5. cursos con palabra java
    @Override
    public List<Curso> cursosJava(){

        List<Curso> listaCursos = this.getCursos();
        List<Curso> listaCursosJava = new ArrayList<Curso>();

        for(Curso c : listaCursos ){
            if(c.getNombre().contains("Java")){
                listaCursosJava.add(c);
            }
        }

        return listaCursosJava;
    }
}
