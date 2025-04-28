package com.mateo.ejercicio02.service;

import com.mateo.ejercicio02.model.Dueno;

import java.util.List;

public interface IDuenoService {
    public List<Dueno> getDuenos();
    public Dueno getDuenoById(Long id);
    public void saveDueno(Dueno dueno);
    public void deleteDueno(Long id);
    public void updateDueno(Dueno dueno);
}
