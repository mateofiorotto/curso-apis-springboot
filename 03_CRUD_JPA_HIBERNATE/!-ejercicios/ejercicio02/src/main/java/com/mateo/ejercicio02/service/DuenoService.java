package com.mateo.ejercicio02.service;

import com.mateo.ejercicio02.model.Dueno;
import com.mateo.ejercicio02.repository.IDuenoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DuenoService implements IDuenoService {
    //Dependencia
    private final IDuenoRepository duenoRepository;

    public DuenoService(IDuenoRepository duenoRepository) {
        this.duenoRepository = duenoRepository;
    }

    //get
    @Override
    public List<Dueno> getDuenos() {
        List<Dueno> listaDuenos = duenoRepository.findAll();

        return listaDuenos;
    }

    //get by id
    @Override
    public Dueno getDuenoById(Long id) {
        Dueno dueno = duenoRepository.findById(id).orElse(null);

        return dueno;
    }

    //post
    @Override
    public void saveDueno(Dueno dueno) {
        duenoRepository.save(dueno);
    }

    //delete
    @Override
    public void deleteDueno(Long id) {
        duenoRepository.deleteById(id);
    }

    //put
    @Override
    public void updateDueno(Dueno dueno) {
        this.saveDueno(dueno);
    }
}
