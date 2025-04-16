package com.mateo.ejercicio02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio02Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio02Application.class, args);
	}

	/*
	* EJERCICIO 02
	* Una nutricionista desea una API que a partir del ingreso del IMC de una persona en el parametro de url, devuelva el estado de su peso. Para ello, tener en cuenta los siguientes rangos:
	* 1 a 18.5 Peso insuficiente
	* 18.6 a 24.9 Peso normal
	* 25.0 a 29.9 Sobrepeso
	* 30 en adelante Obesidad
	*
	* USAR @RequestParam
	* */
}
