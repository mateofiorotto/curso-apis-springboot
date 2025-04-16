package com.mateo.ejercicio09.service;

import com.mateo.ejercicio09.model.Carpa;
import com.mateo.ejercicio09.repository.ICarpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarpaService implements ICarpaService {

    //Inyectar la DI - de repo
    private ICarpaRepository carpaRepository;

    public CarpaService(ICarpaRepository carpaRepository) {
        this.carpaRepository = carpaRepository;
    }

    @Override
    public void agregarCarpa(Carpa carpa) {
        //Validaciones
        if(carpa.getId() <= 0 || carpa.getNombre().isEmpty() || carpa.getCapacidad() <= 0 || carpa.getPrecioPorNoche() <= 0){
            throw new IllegalArgumentException("Los datos deben estar completos.");
        }

        carpaRepository.agregarCarpa(carpa);
    }

    @Override
    public List<Carpa> devolverCarpas() {
        return carpaRepository.devolverCarpas();
    }

    @Override
    public double promedioCapacidad() {
        List<Carpa> lista = carpaRepository.devolverCarpas();
        double suma = 0;

        // Verificamos si la lista está vacía
        if (lista.isEmpty()) {
            throw new IllegalStateException("No hay carpas disponibles para calcular el promedio.");
        }

        // Calculamos la suma de las capacidades
        for (Carpa c : lista) {
            suma += c.getCapacidad();
        }

        // Calculamos el promedio
        double promedio = suma / lista.size();
        return promedio;
    }
}
