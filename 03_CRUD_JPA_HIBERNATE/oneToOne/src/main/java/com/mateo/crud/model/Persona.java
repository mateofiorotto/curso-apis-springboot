package com.mateo.crud.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity //Annotation para indicar que sera una entidad en la BD
public class Persona {
    @Id // Annotation para indicar que sera una llave primaria
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // generar valor de las id de forma automatica y sera autoincremental
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;

    //Tiene mas sentido que la persona sepa que mascotas tiene
    @OneToOne
    @JoinColumn(name = "mascota_id", referencedColumnName = "id")
    private Mascota mascota;
}
