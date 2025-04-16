package com.mateo.ejercicio05;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Paciente {
    private Long id;
    private Long dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
}