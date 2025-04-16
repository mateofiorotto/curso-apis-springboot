package com.mateo.ejercicio07.service;

import com.mateo.ejercicio07.model.Jugador;

import java.util.List;

public interface IEstaturasService {
    public void guardarJugador(Jugador jugador);
    public double calcularPromedioEstatura();
    public List<Jugador> obtenerJugadores();
}
