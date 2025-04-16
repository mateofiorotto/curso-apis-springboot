package com.mateo.ejercicio09.controller;

import com.mateo.ejercicio09.model.Carpa;
import com.mateo.ejercicio09.repository.ICarpaRepository;
import com.mateo.ejercicio09.service.ICarpaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarpaController {

    // Inyectar DI - x constructor
    private ICarpaService carpaService;

    public CarpaController(ICarpaService carpaService) {
        this.carpaService = carpaService;
    }

    // Definir los endpoints

    // 1. POST - Agregar Carpas
    @PostMapping("/agregar-carpa")
    // Devolvemos una respuesta y solicitamos en el body un objeto CARPA. POR JSON enviaremos un objeto carpa
    public ResponseEntity<String> agregarCarpa(@RequestBody Carpa carpa){
        try {
            // Le pasamos la carpa que manda el usuario x POST a service
            carpaService.agregarCarpa(carpa);
            return ResponseEntity.status(HttpStatus.CREATED).body("Carpa agregada correctamente");
        } catch (IllegalArgumentException e) {
            // si hay una excepción de validación, respondemos con un mensaje específico
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        } catch (Exception e) {
            // errores server
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al agregar la carpa");
        }
    }

    // 2. GET - Obtener lista de carpas
    @GetMapping("/carpas")
    public ResponseEntity<?> devolverCarpas(){

        try {
            return ResponseEntity.status(HttpStatus.OK).body(carpaService.devolverCarpas());
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al devolver listas de carpas");
        }
    }

    // 3. GET - Obtener promedio de la capacidad de las carpas
    @GetMapping("/promedio")
    public ResponseEntity<?> promedioCapacidad(){

        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(carpaService.promedioCapacidad());
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al mostrar promedio");
        }

    }


}
