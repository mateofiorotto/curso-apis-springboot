package com.mateo.ejercicio02.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "El nombre de la mascota no puede estar vacio")
    private String nombre;
    @NotEmpty(message = "La especie de la mascota no puede estar vacia")
    private String especie;
    @NotEmpty(message = "La raza de la mascota no puede estar vacia")
    private String raza;
    @NotEmpty(message = "El color de la mascota no puede estar vacio")
    private String color;
    @OneToOne(mappedBy = "mascota")
    @JsonIgnoreProperties("mascota")
    private Dueno dueno;
}
