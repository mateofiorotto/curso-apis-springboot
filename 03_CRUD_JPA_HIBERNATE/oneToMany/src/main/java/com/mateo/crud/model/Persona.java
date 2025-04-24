package com.mateo.crud.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity //Annotation para indicar que sera una entidad en la BD
public class Persona {
    @Id // Annotation para indicar que sera una llave primaria
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // generar valor de las id de forma automatica y sera autoincremental
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;

    //en 1 a n, del lado de la N siempre ira la FK, pero en java, se pone en el lado de la 1
    //unidireccional
    @OneToMany
    private List<Mascota> listaMascotas;
}
