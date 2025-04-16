package com.mateo.ejercicio03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio03Application {

	/*
	* EJERCICIO 03
	* Un turista de EEUU recorre paises latinoamericanos en auto. Cuando va a cargar combustible se encontro con que la mayorp arte de los paises no utiliza la medida de galones, sino, litros. Para solicitar correctamente la cantidad de litros que necesita requiere el desarrollo de una api que al enviarle los galones, otoruge como respuesta el equivalente en litros.
	* Tener en cuenta que 1 galon = 3,78541 ltrs
	* */
	public static void main(String[] args) {
		SpringApplication.run(Ejercicio03Application.class, args);
	}

}
