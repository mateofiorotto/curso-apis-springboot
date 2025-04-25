package com.mateo.ejercicio01.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
public class Tema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tema;
    @NotBlank(message = "No puede tener un nombre vacio")
    private String nombre;
    @NotBlank(message = "No puede tener una descripcion vacia")
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "id_curso")
    @JsonIgnoreProperties("listaDeTemas")
    private Curso curso;
}
