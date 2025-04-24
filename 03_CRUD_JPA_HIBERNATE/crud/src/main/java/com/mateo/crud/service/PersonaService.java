package com.mateo.crud.service;

import com.mateo.crud.model.Persona;
import com.mateo.crud.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {
    //Inyectar la dependencia
    private final IPersonaRepository personaRepository;

    public PersonaService(IPersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    // Metodos
    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = personaRepository.findAll(); //Encontrar todos las personas de la BD con un metodo JPA

        return listaPersonas;
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepository.save(persona); //Guardar con save de JPA
    }

    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id); //deleteById es el mas usado de JPA
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = personaRepository.findById(id).orElse(null); //encontrar persona, si no la encuentra devuelve null

        return persona;
    }

    @Override
    public void editPersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad) {
        //Buscar objeto PERSONA original
        Persona persona = this.findPersona(idOriginal); // Le paso id Original para que findPersona busque la persona original

        //Modificar los datos a nivel logico
        persona.setId(idNueva);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setEdad(nuevaEdad);

        //Guardar los cambios
        this.savePersona(persona);
    }
}
