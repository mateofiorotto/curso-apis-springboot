package com.mateo.ejercicio02.service;

import com.mateo.ejercicio02.dto.MascotaDuenoDTO;
import com.mateo.ejercicio02.model.Dueno;
import com.mateo.ejercicio02.model.Mascota;
import com.mateo.ejercicio02.repository.IDuenoRepository;
import com.mateo.ejercicio02.repository.IMascotaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MascotaService implements IMascotaService {
    //Dependencia
    private final IMascotaRepository mascotaRepository;
    private final IDuenoRepository duenoRepository;

    public MascotaService(IMascotaRepository mascotaRepository, IDuenoRepository duenoRepository) {
        this.mascotaRepository = mascotaRepository;
        this.duenoRepository = duenoRepository;
    }

    //get
    @Override
    public List<Mascota> getMascotas() {
        List<Mascota> listaMascotas = mascotaRepository.findAll();

        return listaMascotas;
    }

    //get by id
    @Override
    public Mascota getMascotaById(Long id) {
        Mascota mascota = mascotaRepository.findById(id).orElse(null);

        return mascota;
    }

    //post
    @Override
    public void saveMascota(Mascota mascota) {
        //obtenemos el dueño de la mascota
        Dueno dueno = mascota.getDueno();

        //si es distinto a null le seteamos la mascota al campo dueño, guardandolo desde el repositorio
        if (dueno != null){
            dueno.setMascota(mascota);
            duenoRepository.save(dueno);
        }

        mascotaRepository.save(mascota);
    }

    //delete
    @Override
    public void deleteMascota(Long id) {
        mascotaRepository.deleteById(id);
    }

    //put
    @Override
    public void updateMascota(Mascota mascota) {
        this.saveMascota(mascota);
    }

    //Perros caniches
    @Override
    public List<Mascota> getPerrosCaniches(){
        List<Mascota> listaMascotas = mascotaRepository.findAll();
        List<Mascota> listaCaniches = new ArrayList<Mascota>();

        for (Mascota m : listaMascotas){
            if (m.getEspecie().equalsIgnoreCase("perro") && m.getRaza().equalsIgnoreCase("caniche")) {
                listaCaniches.add(m);
            }
        }

        return listaCaniches;
    }

    @Override
    public List<MascotaDuenoDTO> getListaCombinada() {
        List<Mascota> listaMascotas = this.getMascotas();
        List<MascotaDuenoDTO> listaMascoDuenio = new ArrayList<MascotaDuenoDTO>();
        MascotaDuenoDTO masco_duenio = new MascotaDuenoDTO();

        for (Mascota masco : listaMascotas) {

            System.out.println(masco.getNombre());
            masco_duenio.setNombre_dueno(masco.getDueno().getNombre());
            masco_duenio.setNombre_mascota(masco.getNombre());
            masco_duenio.setApellido_dueno(masco.getDueno().getApellido());
            masco_duenio.setEspecie(masco.getEspecie());
            masco_duenio.setRaza(masco.getRaza());

            listaMascoDuenio.add(masco_duenio);
            masco_duenio = new MascotaDuenoDTO();
        }
        return listaMascoDuenio;
    }
}
