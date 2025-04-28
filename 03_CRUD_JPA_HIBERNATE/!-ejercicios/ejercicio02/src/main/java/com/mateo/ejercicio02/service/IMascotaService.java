package com.mateo.ejercicio02.service;

import com.mateo.ejercicio02.dto.MascotaDuenoDTO;
import com.mateo.ejercicio02.model.Mascota;

import java.util.List;

public interface IMascotaService {
    public List<Mascota> getMascotas();
    public Mascota getMascotaById(Long id);
    public void saveMascota(Mascota mascota);
    public void deleteMascota(Long id);
    public void updateMascota(Mascota mascota);
    public List<Mascota> getPerrosCaniches();
    public List<MascotaDuenoDTO> getListaCombinada();
}
