package com.mateo.ejercicio01.service;

import com.mateo.ejercicio01.model.Tema;
import com.mateo.ejercicio01.repository.ITemaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaService implements ITemaService {

    //DI
    private final ITemaRepository temaRepository;

    public TemaService(ITemaRepository temaRepository) {
        this.temaRepository = temaRepository;
    }

    //Metodo GET - Obtener Temas
    @Override
    public List<Tema> getTemas() {
        List<Tema> listaTemas = temaRepository.findAll();

        return listaTemas;
    }

    //Metodo POST - Crear Tema
    @Override
    public void postTema(Tema tema) {
        temaRepository.save(tema);
    }

    //Metodo DELETE - Borrar Tema
    @Override
    public void deleteTema(Long id_tema) {
        temaRepository.deleteById(id_tema);
    }

    //Metodo UPDATE - Actualizar Tema
    @Override
    public void updateTema(Tema tema) {
        this.postTema(tema);
    }

    //Metodo FIND - Encontrar tema por ID
    @Override
    public Tema findTema(Long id_tema) {
        Tema tema = temaRepository.findById(id_tema).orElse(null);

        return tema;
    }
}
