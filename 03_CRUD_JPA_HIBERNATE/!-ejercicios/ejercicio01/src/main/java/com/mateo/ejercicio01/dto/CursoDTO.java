package com.mateo.ejercicio01.dto;

import com.mateo.ejercicio01.dto.TemaDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

public record CursoDTO(
        @NotBlank(message = "No puede tener un nombre vacío") String nombre,
        @NotBlank(message = "No puede tener una modalidad vacía") String modalidad,
        Date fecha_finalizacion,
        List<TemaDTO> listaDeTemas
) {
}
