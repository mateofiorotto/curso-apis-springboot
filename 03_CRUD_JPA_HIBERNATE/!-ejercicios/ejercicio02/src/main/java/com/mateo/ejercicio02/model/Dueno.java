package com.mateo.ejercicio02.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Dueno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "El DNI de la persona no puede estar vacio")
    private String dni;
    @NotEmpty(message = "El nombre de la persona no puede estar vacio")
    private String nombre;
    @NotEmpty(message = "El apellido de la persona no puede estar vacio")
    private String apellido;
    @NotNull(message = "El celular de la persona no puede estar vacio")
    private int celular;
    @OneToOne
    @JoinColumn(name = "mascota_id", referencedColumnName = "id")
    @JsonIgnoreProperties("dueno")
    private Mascota mascota;
}
