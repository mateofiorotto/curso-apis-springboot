package com.mateo.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity //Annotation para indicar que sera una entidad en la BD
public class Persona {
    @Id // Annotation para indicar que sera una llave primaria
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // generar valor de las id de forma automatica y sera autoincremental
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
}
