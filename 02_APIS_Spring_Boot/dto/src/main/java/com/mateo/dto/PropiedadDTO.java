package com.mateo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class PropiedadDTO {
    //unificamos los atributos que queremos de Propiedad
    private Long id_propiedad;
    private String tipo_propiedad;
    private String direccion;
    private Double valor_alquiler;
    //unificamos los atributos que queremos de Inquilino
    private String nombre_inquilino;
    private String apellido_inquilino;
}
