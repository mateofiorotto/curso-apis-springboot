package com.mateo.crud.controller;

import com.mateo.crud.model.Persona;
import com.mateo.crud.service.IPersonaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    //Inyectar DEPENDENCIAS
    IPersonaService personaService;

    public PersonaController(IPersonaService personaService) {
        this.personaService = personaService;
    }

    //Definir endpoints
    @GetMapping("/personas/traer") // GET all
    public List<Persona> getPersonas(){
        //Devolver el metodo getPersonas de service
        return personaService.getPersonas();
    }

    @GetMapping("/personas/traer/{id}") // GET x id
    public Persona getPersonaById(@PathVariable Long id){
        Persona persona = personaService.findPersona(id);

        return persona;
    }

    @PostMapping("/personas/crear") // POST
    public String savePersona(@RequestBody Persona persona){ //por json llega persona
        personaService.savePersona(persona);

        return "Persona creada correctamente";
    }

    @DeleteMapping("/personas/eliminar/{id}")
    public String deletePersona(@PathVariable Long id){
        personaService.deletePersona(id);

        return "Persona eliminada correctamente";
    }

    @PutMapping("/personas/editar/{id_original}")
    public Persona editPersona(@PathVariable Long id_original,
                               @RequestParam(required = false, name = "id") Long nuevaId,
                               @RequestParam(required = false, name = "nombre")  String nuevoNombre,
                               @RequestParam(required = false, name = "apellido")  String nuevoApellido,
                               @RequestParam(required = false, name = "edad") int nuevaEdad){
        personaService.editPersona(id_original, nuevaId, nuevoNombre, nuevoApellido, nuevaEdad);

        Persona persona = personaService.findPersona(id_original);

        return persona;
    }

}
