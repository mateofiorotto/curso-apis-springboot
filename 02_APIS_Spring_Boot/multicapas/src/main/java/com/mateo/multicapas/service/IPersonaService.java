package com.mateo.multicapas.service;


import com.mateo.multicapas.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

//definir interfaz - En este caso no lleva @Service
public interface IPersonaService {

    //metodos abstractos sin implementar
    public void crearPersona(Persona per);

    public List<Persona> traerPersonas();

}
