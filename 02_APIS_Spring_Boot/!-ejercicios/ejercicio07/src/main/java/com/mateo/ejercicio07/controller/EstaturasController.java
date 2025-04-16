package com.mateo.ejercicio07.controller;

import com.mateo.ejercicio07.model.Jugador;
import com.mateo.ejercicio07.repository.EstaturasRepository;
import com.mateo.ejercicio07.service.EstaturasService;
import com.mateo.ejercicio07.service.IEstaturasService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class EstaturasController {

    private IEstaturasService estaturasService;

    public EstaturasController(EstaturasService estaturasService) {
        this.estaturasService = estaturasService;
    }

    @PostMapping("/cargar-jugador")
    @ResponseBody
    public ResponseEntity<String> estaturas(@RequestBody Jugador jugador) {

        // Aca enviaremos los datos
        if (jugador.getDni() == null || jugador.getDni().isEmpty() ||
                jugador.getNombre() == null || jugador.getNombre().isEmpty() ||
                jugador.getApellido() == null || jugador.getApellido().isEmpty() ||
                jugador.getEdad() <= 0 ||
                jugador.getPeso() <= 0 ||
                jugador.getEstatura() <= 0) {

                System.out.println("Todos los campos son obligatorios y deben tener valores válidos.");

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Todos los campos son obligatorios");
        } else {
            //mandar lista a service
            if (estaturasService.obtenerJugadores().size() >= 5) {
                System.out.println("No se pueden ingresar más de 5 jugadores.");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("NO se puede poner mas de 5 jugadores en la lista");
            } else {
                estaturasService.guardarJugador(jugador);
                System.out.println("Jugador guardado");

                //devolver rta "Jugador cargado" api
                return ResponseEntity.status(HttpStatus.CREATED).body("El jugador fue cargado");
            }
        }
    }

    @GetMapping("/promedio")
    @ResponseBody
    public String obtenerPromedioEstaturas(){
        double promedio = estaturasService.calcularPromedioEstatura();

        return "El promedio de estatura es: " + promedio;
    }

    @GetMapping("/jugadores")
    @ResponseBody
    public List<Jugador> obtenerJugadores(){
        return estaturasService.obtenerJugadores();
    }
}
