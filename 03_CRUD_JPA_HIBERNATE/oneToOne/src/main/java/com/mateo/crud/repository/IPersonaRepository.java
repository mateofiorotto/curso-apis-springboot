package com.mateo.crud.repository;

import com.mateo.crud.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Ipersonarepository extendera de jparepository que tiene los metodos implementados de JPA
//ESTE CASO ES DE JPA, PERO NORMALMENTE SE CREA LA CLASE PERSONAREPOSITORY TAMBIEN

//extendemos de jpa y le pasamos la clase que mapearemos en este repositorio y el tipo de dato de la ID
@Repository // AHORA SI VA REPOSITORY
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
}
