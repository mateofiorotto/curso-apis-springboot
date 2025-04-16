package com.mateo.ejercicio04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio04Application {
	//    Ejercicio Nº 4 – Restaurante
//    Un restaurante posee un total de 5 platos en su menú. Cada uno de ellos tiene un número de plato, nombre, precio y breve descripción.
//    a. El restaurante desea una aplicación que permita que los clientes sean capaces consultar los datos de los platos del menú a partir de proporcionar el número de plato. Para ello, se necesita el desarrollo de una API que a partir de la recepción del num de plato en una solicitud GET, devuelva el plato correspondiente con todos sus datos.
	public static void main(String[] args) {
		SpringApplication.run(Ejercicio04Application.class, args);
	}

}
