package com.mateo.crud.service;

import com.mateo.crud.model.Mascota;
import com.mateo.crud.repository.IMascotaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotaService {
    IMascotaRepository mascotaRepository;

    public MascotaService(IMascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    @Override
    public List<Mascota> getMascotas() {
        List<Mascota> listaMascotas = mascotaRepository.findAll();

        return listaMascotas;
    }

    @Override
    public void saveMascota(Mascota mascota) {
        mascotaRepository.save(mascota);
    }

    @Override
    public void deleteMascota(Long id) {
        mascotaRepository.deleteById(id);
    }

    @Override
    public Mascota findMascota(Long id) {
        Mascota mascota = mascotaRepository.findById(id).orElse(null);

        return mascota;
    }

    @Override
    public void editMascota(Long idOriginal, Long idNueva, String nuevoNombre, String nuevaEspecie, String nuevaRaza, String nuevoColor) {
        Mascota mascota = this.findMascota(idOriginal);

        //Modificar los datos a nivel logico
        mascota.setId(idNueva);
        mascota.setNombre(nuevoNombre);
        mascota.setEspecie(nuevaEspecie);
        mascota.setRaza(nuevaRaza);
        mascota.setColor(nuevoColor);

        //Guardar los cambios
        this.saveMascota(mascota);
    }
}
