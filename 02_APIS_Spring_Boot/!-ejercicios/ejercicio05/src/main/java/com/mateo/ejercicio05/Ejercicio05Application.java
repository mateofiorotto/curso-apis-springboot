package com.mateo.ejercicio05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio05Application {
//	Ejercicio Nº 5 – Odontólogo
//
//	Un odontólogo cuenta con una lista de pacientes. De cada uno de ellos cuenta con los datos: id, dni, nombre, apellido y fecha de nacimiento.
//
//	a. El odontólogo necesita de una API que sea capaz de brindarle el listado completo de  sus pacientes. Para esto, desarrollar un end-point que permita devolver la lista completa de pacientes mediante el método GET.
//
//			b. Además, el odontólogo necesita saber sus pacientes que son menores de edad para contemplar que los mismos asistan a sus citas acompañados por un mayor. Para ello, necesita que la API posea un end-point que al realizar la solicitud GET, devuelva únicamente a los pacientes que sean menores de edad. Para realizar el cálculo de edad tener en cuenta la fecha de nacimiento de cada paciente y la fecha «actual» (día en que se esté haciendo la consulta).
//
//	Tips para fechas
//1- Utilizar el tipo de dato LocalDate.
//			2- Para obtener la fecha de hoy se utiliza el método LocalDate.now()
//			3- Para calcular períodos entre dos fechas se utiliza la clase Period y el método between. Por ejemplo: Period.between (fecha_hoy, otra_fecha)
//			4- Si utilizamos el método getYears en el objeto Period que tengamos, obtendremos la cantidad de años de diferencia.
	public static void main(String[] args) {
		SpringApplication.run(Ejercicio05Application.class, args);
	}

}
