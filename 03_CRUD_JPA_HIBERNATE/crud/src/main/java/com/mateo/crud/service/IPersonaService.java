package com.mateo.crud.service;

import com.mateo.crud.model.Persona;

import java.util.List;

public interface IPersonaService {

    public List<Persona> getPersonas(); // Traer personas
    public void savePersona(Persona persona); // Crear persona
    public void deletePersona(Long id);// Eliminar persona
    public Persona findPersona(Long id); // Encontrar persona x ID
    public void editPersona(Long idOriginal, Long idNueva,
                            String nuevoNombre,
                            String nuevoApellido,
                            int nuevaEdad);// Modificar persona
// La id en editPersona no deberia cambiar realmente, es mala practica pero para fines didacticos es usada en el curso
}
