package com.mateo.ejercicio02.controller;

import com.mateo.ejercicio02.model.Mascota;
import com.mateo.ejercicio02.service.IMascotaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MascotaController {
    private final IMascotaService mascotaService;

    public MascotaController(IMascotaService mascotaService) {
        this.mascotaService = mascotaService;
    }

    //get
    @GetMapping("/mascotas/get")
    public ResponseEntity<?> getMascotas() {
        try {
            return ResponseEntity.ok(mascotaService.getMascotas());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    //get x id
    @GetMapping("/mascotas/get/{id}")
    public ResponseEntity<?> getMascotasById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(mascotaService.getMascotaById(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    //post
    @PostMapping("/mascotas/save")
    public ResponseEntity<?> saveMascota(@RequestBody Mascota mascota) {
        try {
            mascotaService.saveMascota(mascota);
            return ResponseEntity.status(HttpStatus.CREATED).body("Mascota creada");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    //delete
    @DeleteMapping("/mascotas/delete/{id}")
    public ResponseEntity<?> deleteMascota(@PathVariable Long id) {
        try {
            mascotaService.deleteMascota(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Mascota eliminada");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    //put
    @PutMapping("/mascotas/update")
    public ResponseEntity<?> updateMascota(@RequestBody Mascota mascota) {
        try {
            mascotaService.updateMascota(mascota);
            return ResponseEntity.status(HttpStatus.OK).body("Mascota actualizada");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    //get
    @GetMapping("/mascotas/caniches")
    public ResponseEntity<?> getPerrosCaniches() {
        try {
            return ResponseEntity.ok(mascotaService.getPerrosCaniches());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    //get lista dto
    @GetMapping("/mascotas/dto")
    public ResponseEntity<?> getListaCombinada() {
        try {
            return ResponseEntity.ok(mascotaService.getListaCombinada());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
