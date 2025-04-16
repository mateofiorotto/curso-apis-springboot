package com.mateo.ejercicio05.controller;

import com.mateo.ejercicio05.Paciente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Ejercicio05Controller {

    //crear lista. Lo defino en otro metodo para utilizarlo mas facil.
    public List<Paciente> listaPacientes(){
        List<Paciente> pacientes = new ArrayList<Paciente>();

        pacientes.add(new Paciente(1L, 44123456L, "Lucas", "Rodriguez", LocalDate.of(1994,10,10)));
        pacientes.add(new Paciente(2L, 11998822L, "Franco", "Pizzini", LocalDate.of(1991,1,9)));
        pacientes.add(new Paciente(3L, 12345678L, "Ricardo", "Tapia", LocalDate.of(2015,4,27)));
        pacientes.add(new Paciente(4L, 13234567L, "Roman", "Di'Angeli", LocalDate.of(2013,2,11)));

        return pacientes;
    }

    //Devolvera todos los pacientes
    @GetMapping("/pacientes")
    @ResponseBody
    public List<Paciente> obtenerPacientes(){

        return listaPacientes();
    }

    //Devolvera a los pacientes cuya edad no sea mayor a 18 años. Utilizar DATE
    @GetMapping("/pacientes-menores")
    @ResponseBody
    public List<Paciente> obtenerPacientesMenores(){

        List<Paciente> pacientesMenores = new ArrayList<Paciente>(listaPacientes());

        //removeIf es una funcion especifica para listas que removera algo en caso de cumplirse una condicion
        pacientesMenores.removeIf(p ->
                // en este caso, si el periodo entre fecanac y la fecha actual, es mayor a 18 lo elimina
                Period.between(p.getFechaNacimiento(), LocalDate.now()).getYears() >= 18
        );

        return pacientesMenores;
    }

    //otra forma es si hubiera hecho la lista en metodos separados:
    @GetMapping ("/pacientes/menores")
    @ResponseBody
    public List<Paciente> traerMenores() {
        List<Paciente> pacientes = new ArrayList<Paciente>();
        pacientes.add(new Paciente(1L, 44123456L, "Lucas", "Rodriguez", LocalDate.of(1994,10,10)));
        pacientes.add(new Paciente(2L, 11998822L, "Franco", "Pizzini", LocalDate.of(1991,1,9)));
        pacientes.add(new Paciente(3L, 12345678L, "Ricardo", "Tapia", LocalDate.of(2015,4,27)));
        pacientes.add(new Paciente(4L, 13234567L, "Roman", "Di'Angeli", LocalDate.of(2013,2,11)));

        //creo lista para guardar a los menores
        List<Paciente> listaMenores = new ArrayList<Paciente>();

        for (Paciente pac : pacientes) {

            //fecha de hoy
            LocalDate hoy = LocalDate.now();
            //calculo período entre fecha de nacimiento del paciente y fecha de hoy
            Period cant_anios = Period.between(pac.getFechaNacimiento(), hoy);

            //si es menor de 18 lo agrego a lista menores
            if (cant_anios.getYears()<18) {
                System.out.println("cant anios " + cant_anios.getYears());
                listaMenores.add(pac);
            }

        }
        return listaMenores;
    }
}
