package com.mateofiorotto.helloworld;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//@NoArgsConstructor.. etc. Buscar Lombok docs

//annotations de lombok para simplificar
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Cliente {
    private Long id;
    private String nombre;
    private String apellido;
}
