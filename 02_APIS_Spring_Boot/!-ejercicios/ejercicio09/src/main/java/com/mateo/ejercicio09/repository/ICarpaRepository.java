package com.mateo.ejercicio09.repository;

import com.mateo.ejercicio09.model.Carpa;

import java.util.ArrayList;
import java.util.List;

public interface ICarpaRepository {
    public void agregarCarpa(Carpa carpa);
    public List<Carpa> devolverCarpas();
    public double promedioCapacidad();
}
