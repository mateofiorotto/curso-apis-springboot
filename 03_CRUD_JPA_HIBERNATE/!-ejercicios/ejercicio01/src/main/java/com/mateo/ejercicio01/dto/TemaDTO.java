package com.mateo.ejercicio01.dto;

import com.mateo.ejercicio01.model.Curso;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public record TemaDTO(
        @NotBlank(message = "El nombre no puede estar vacío") String nombre,
        @NotBlank(message = "La descripción no puede estar vacía") String descripcion,
        Curso curso
) {
}
