package com.mateo.ejercicio09.repository;

import com.mateo.ejercicio09.model.Carpa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarpaRepository implements ICarpaRepository {

    // Definimos nuestra BD "logica"
    private List<Carpa> lista = new ArrayList<Carpa>();

    @Override
    public void agregarCarpa(Carpa carpa) {
        lista.add(carpa);
    }

    @Override
    public List<Carpa> devolverCarpas() {
        return lista;
    }

    @Override
    public double promedioCapacidad() {
        double promedio = 0;

        return promedio;
    }
}
