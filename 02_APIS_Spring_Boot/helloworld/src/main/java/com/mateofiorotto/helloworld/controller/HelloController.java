package com.mateofiorotto.helloworld.controller;
import com.mateofiorotto.helloworld.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//mediante un annotation, ponemos rest controller para indicar que es un controller
@RestController
public class HelloController {

    @GetMapping("/")
    public String home(){
        return "Esta es la Home";
    }

    //Armamos el metodo que devolvera hola mundo, en este caso nuestro primer endpoint
    @GetMapping("/hello/{nombre}") //devolvemos en el /hello x get el method sayHello y por
    //parametro en la url el nombre /hello/Mateo
    public String sayHello(@PathVariable String nombre) {
        return "Hello World " + nombre;
    }

    @GetMapping("/hello/{nombre}/{apellido}/{edad}")
    public String sayHelloComplete(@PathVariable String nombre,
                                   @PathVariable String apellido,
                                   @PathVariable int edad) {
        return "Hola " + nombre + " " + apellido + ", tienes " + edad + " años";
    }

    //Request Param
    //Con @requestParam
    @GetMapping("/bye")
    public String sayBye(@RequestParam String nombre,
                                   @RequestParam String apellido) {
        return "Adios " + nombre + " " + apellido;
    }

    //POSTMAPPING + REQUESTBODY. Recibir objeto de un cliente
    @PostMapping("/cliente")
    public void nuevoCliente(@RequestBody Cliente cli){
        System.out.println("Cliente creado");
        System.out.println("Datos: " + cli.getId() + " " + cli.getNombre() + " " + cli.getApellido());
    }

    //ResponseBody. Pasarle el objeto mediante JSON al cliente.
    @GetMapping("/clientes/traer")
    @ResponseBody //Esto hara que la response vuelva en el body
    public List<Cliente> traerClientes(){

        List<Cliente> lista = new ArrayList<Cliente>();

        lista.add(new Cliente(1L, "Lionel", "Messi"));
        lista.add(new Cliente(2L, "Angel", "Di Maria"));
        lista.add(new Cliente(3L, "Lionel", "Messi"));

        return lista;
    }

    //ResponseEntity. Manipular el paquete que respondemos en un HTTP.
    // StatusCode, header, body...
    @GetMapping("/responseentity")
    ResponseEntity<String> traerRespuesta(){

        int num = 10;

        if (num == 0) {
            return new ResponseEntity<>("Numero invalido", HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>("Numero valido " + num, HttpStatus.OK);
    }

}
