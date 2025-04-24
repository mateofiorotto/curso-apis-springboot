package com.mateo.crud.service;

import com.mateo.crud.model.Mascota;

import java.util.List;

public interface IMascotaService {
    public List<Mascota> getMascotas();
    public void saveMascota(Mascota mascota);
    public void deleteMascota(Long id);
    public Mascota findMascota(Long id);
    public void editMascota(Long idOriginal, Long idNueva,
                            String nuevoNombre,
                            String nuevaEspecie,
                            String nuevaRaza,
                            String nuevoColor);
}
