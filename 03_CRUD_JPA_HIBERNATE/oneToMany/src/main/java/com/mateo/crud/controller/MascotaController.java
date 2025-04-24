package com.mateo.crud.controller;

import com.mateo.crud.model.Mascota;
import com.mateo.crud.service.IMascotaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MascotaController {

    //Inyectar DEPENDENCIAS
    IMascotaService mascotaService;

    public MascotaController(IMascotaService mascotaService) {
        this.mascotaService = mascotaService;
    }

    //Definir endpoints
    @GetMapping("/mascotas/traer") // GET all
    public List<Mascota> getMascotas(){
        //Devolver el metodo getMascotas de service
        return mascotaService.getMascotas();
    }

    @GetMapping("/mascotas/traer/{id}") // GET x id
    public Mascota getMascotaById(@PathVariable Long id){
        Mascota mascota = mascotaService.findMascota(id);

        return mascota;
    }

    @PostMapping("/mascotas/crear") // POST
    public String saveMascota(@RequestBody Mascota mascota){ //por json llega mascota
        mascotaService.saveMascota(mascota);

        return "Mascota creada correctamente";
    }

    @DeleteMapping("/mascotas/eliminar/{id}")
    public String deleteMascota(@PathVariable Long id){
        mascotaService.deleteMascota(id);

        return "Mascota eliminada correctamente";
    }

    @PutMapping("/mascotas/editar/{id_original}")
    public Mascota editMascota(@PathVariable Long id_original,
                               @RequestParam(required = false, name = "id") Long nuevaId,
                               @RequestParam(required = false, name = "nombre")  String nuevoNombre,
                               @RequestParam(required = false, name = "especie")  String nuevaEspecie,
                               @RequestParam(required = false, name = "raza")  String nuevaRaza,
                               @RequestParam(required = false, name = "raza")  String nuevoColor){
        mascotaService.editMascota(id_original, nuevaId, nuevoNombre, nuevaEspecie, nuevaRaza, nuevoColor);

        Mascota mascota = mascotaService.findMascota(nuevaId);

        return mascota;
    }

}
