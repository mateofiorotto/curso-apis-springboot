package com.mateo.ejercicio07.repository;

import com.mateo.ejercicio07.model.Jugador;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EstaturasRepository implements IEstaturasRepository{

    //definimos la lista para poder usarla en los metodos
    private List<Jugador> lista = new ArrayList<>();

    @Override
    public void guardarJugador(Jugador jugador) {
        //añadimos el jugador que viene x param
        lista.add(jugador);
    }

    //"BD" Logica en un arraylist
    @Override
    public List<Jugador> obtenerJugadores(){
        return lista;
    }
}
