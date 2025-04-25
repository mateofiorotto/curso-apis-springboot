package com.mateo.ejercicio01.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mateo.ejercicio01.model.Tema;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class CursoTemaDTO {
    private String nombreCurso;
    @JsonIgnoreProperties("curso")
    private List<Tema> listaTemas;
}
