package com.mateo.multicapas.service;

import com.mateo.multicapas.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

//indicar service. Implementar interfaz
@Service
public class PersonaService implements IPersonaService {

    // Implementar Metodos (con interfaces) de logica de negocio
    @Override
    public void crearPersona(Persona per) {
        //aca iria la logica de creacion
        System.out.println("Persona creada");
    }

    @Override
    public List<Persona> traerPersonas() {
        //aca deberia devolver la lista de personas
        throw new UnsupportedOperationException("Unimplemented method 'traerPersonas'");
    }
}
