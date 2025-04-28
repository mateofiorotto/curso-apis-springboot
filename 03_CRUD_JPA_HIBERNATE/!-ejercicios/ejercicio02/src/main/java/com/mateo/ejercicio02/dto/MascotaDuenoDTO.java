package com.mateo.ejercicio02.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class MascotaDuenoDTO {
    private String nombre_mascota;
    private String especie;
    private String raza;
    private String nombre_dueno;
    private String apellido_dueno;
}
