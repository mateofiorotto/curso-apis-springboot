package com.mateo.ejercicio09.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Carpa {
    private Long id;
    private String nombre;
    private int capacidad;
    private int precioPorNoche;
}
