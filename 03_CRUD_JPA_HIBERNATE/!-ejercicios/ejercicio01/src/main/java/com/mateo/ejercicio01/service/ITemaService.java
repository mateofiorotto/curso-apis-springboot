package com.mateo.ejercicio01.service;

import com.mateo.ejercicio01.model.Tema;

import java.util.List;

public interface ITemaService {
    public List<Tema> getTemas();
    public void postTema(Tema tema);
    public void deleteTema(Long id_tema);
    public void updateTema(Tema tema);
    public Tema findTema(Long id_tema);
}
