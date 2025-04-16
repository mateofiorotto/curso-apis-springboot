package com.mateo.ejercicio07.service;

import com.mateo.ejercicio07.model.Jugador;
import com.mateo.ejercicio07.repository.EstaturasRepository;
import com.mateo.ejercicio07.repository.IEstaturasRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//implemento la Interfaz
public class EstaturasService implements IEstaturasService {

    //hago DI
    private IEstaturasRepository estaturasRepository;

    public EstaturasService(EstaturasRepository estaturasRepository) {
        this.estaturasRepository = estaturasRepository;
    }

    @Override
    public void guardarJugador(Jugador jugador) {
        //aca agregaremos el jugador a repository
        estaturasRepository.guardarJugador(jugador);
    }

    @Override
    public double calcularPromedioEstatura() {
        double promedio = 0;
        double suma = 0;
        List<Jugador> lista = estaturasRepository.obtenerJugadores();

        for (Jugador j : lista) {
            suma += j.getEstatura();
        }

        if (lista.isEmpty()) {
            return 0;
        }

        promedio = suma / lista.size();

        return promedio;
    }

    @Override
    public List<Jugador> obtenerJugadores() {
        return estaturasRepository.obtenerJugadores();
    }
}
