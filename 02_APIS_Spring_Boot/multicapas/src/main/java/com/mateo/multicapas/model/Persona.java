package com.mateo.multicapas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Persona {
    private Long id;
    private String nombre;
    private String apellido;
}
