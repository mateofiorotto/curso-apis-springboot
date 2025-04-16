package com.mateo.ejercicio07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio07Application {
//	Ejercicio Nº 7 – Estaturas en Basquet
//
//	Un director técnico de un equipo de basquet desea poder contar con una API que, al enviar los datos de 5 de sus jugadores en el body de una solicitud http POST, los mismos sean dados de alta en una bases de datos lógica representada por una lista de tipo ArrayList y que, al mismo tiempo, luego del alta correspondiente, se pueda obtener inmediatamente como respuesta el promedio de estatura de todos sus jugadores ingresados.
//
//	Los datos que se ingresan para cada jugador son los siguientes: id, dni, nombre, apellido, edad, peso y estatura.
//
//	Tener en cuenta para la realización de este ejercicio la manipulación/creación de archivos JSON, el uso de Postman como herramienta para generar la solicitud POST, la annotation @RequestBody y el manejo de ArrayLists.
	public static void main(String[] args) {
		SpringApplication.run(Ejercicio07Application.class, args);
	}

}
