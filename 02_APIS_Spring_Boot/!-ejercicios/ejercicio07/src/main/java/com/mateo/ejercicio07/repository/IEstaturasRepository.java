package com.mateo.ejercicio07.repository;

import com.mateo.ejercicio07.model.Jugador;

import java.util.List;

public interface IEstaturasRepository {
    public void guardarJugador(Jugador jugador);
    public List<Jugador> obtenerJugadores();
}
