package com.mateo.ejercicio02.controller;

import com.mateo.ejercicio02.model.Dueno;
import com.mateo.ejercicio02.service.IDuenoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DuenoController {
    private final IDuenoService duenoService;

    public DuenoController(IDuenoService duenoService) {
        this.duenoService = duenoService;
    }

    //get
    @GetMapping("/duenos/get")
    public ResponseEntity<?> getDuenos() {
        try {
            return ResponseEntity.ok(duenoService.getDuenos());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    //get x id
    @GetMapping("/duenos/get/{id}")
    public ResponseEntity<?> getDuenosById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(duenoService.getDuenoById(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    //post
    @PostMapping("/duenos/save")
    public ResponseEntity<?> saveDueno(@RequestBody Dueno dueno) {
        try {
            duenoService.saveDueno(dueno);
            return ResponseEntity.status(HttpStatus.CREATED).body("Dueno creada");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    //delete
    @DeleteMapping("/duenos/delete/{id}")
    public ResponseEntity<?> deleteDueno(@PathVariable Long id) {
        try {
            duenoService.deleteDueno(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Dueno eliminada");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    //put
    @PutMapping("/duenos/update")
    public ResponseEntity<?> updateDueno(@RequestBody Dueno dueno) {
        try {
            duenoService.updateDueno(dueno);
            return ResponseEntity.status(HttpStatus.OK).body("Dueno actualizada");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
