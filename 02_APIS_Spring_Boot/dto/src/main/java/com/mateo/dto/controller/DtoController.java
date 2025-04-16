package com.mateo.dto.controller;

import com.mateo.dto.Inquilino;
import com.mateo.dto.Propiedad;
import com.mateo.dto.PropiedadDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DtoController {

    @GetMapping("/propiedad/{id}")
    @ResponseBody
    public PropiedadDTO propiedad(@PathVariable int id){
        //mediante id buscamos la propiedad y traemos al inquilino asociado
        Propiedad prop = new Propiedad(15487L, "Casa", "308 Lake", 200.0, 4000.0);
        Inquilino inqui = new Inquilino(1L, "12345678", "Lucas", "Rodriguez", "Programador");

        PropiedadDTO propDTO = new PropiedadDTO();

        //Seteamos los datos que nos interesan de propiedad en la clase intermedia DTO
        propDTO.setId_propiedad(prop.getId_propiedad());
        propDTO.setTipo_propiedad(prop.getTipo_propiedad());
        propDTO.setDireccion(prop.getDireccion());
        propDTO.setValor_alquiler(prop.getValor_alquiler());

        //Seteamos los datos de inquilino
        propDTO.setNombre_inquilino((inqui.getNombre()));
        propDTO.setApellido_inquilino((inqui.getApellido()));

        //devolvemos la unificacion
        if (propDTO.getId_propiedad() == id) {
            return propDTO;
        }

        return null;
    }
}
