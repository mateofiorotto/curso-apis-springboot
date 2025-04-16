package com.mateo.multicapas.repository;

import org.springframework.stereotype.Repository;

//Annotation que PersonaRepository sera una clase de repositorio
@Repository
public class PersonaRepository implements IPersonaRepository{
    //Metodos que llamarian la BD
    @Override
    public void conexion() {
        System.out.println("Conexion a la BD realizada");
    }

    @Override
    public void desconexion() {
        System.out.println("Desconexion a la BD realizada");
    }
}
