package com.mateo.ejercicio09.service;

import com.mateo.ejercicio09.model.Carpa;

import java.util.List;

public interface ICarpaService {
    public void agregarCarpa(Carpa carpa);
    public List<Carpa> devolverCarpas();
    public double promedioCapacidad();
}
