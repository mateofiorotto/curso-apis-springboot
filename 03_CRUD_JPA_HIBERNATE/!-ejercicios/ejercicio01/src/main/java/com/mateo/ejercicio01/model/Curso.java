package com.mateo.ejercicio01.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_curso;
    @NotBlank(message = "No puede tener un nombre vacio")
    private String nombre;
    @NotBlank(message = "No puede tener una modalidad vacia")
    private String modalidad;
    private Date fecha_finalizacion;
    @OneToMany(mappedBy = "curso") //un curso tiene una serie de temas
    @JsonIgnoreProperties("curso")
    private List<Tema> listaDeTemas;
}
