package com.mateo.ejercicio02.repository;

import com.mateo.ejercicio02.model.Dueno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenoRepository extends JpaRepository<Dueno, Long> {
}
