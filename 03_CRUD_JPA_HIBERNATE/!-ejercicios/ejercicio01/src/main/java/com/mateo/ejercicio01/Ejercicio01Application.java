package com.mateo.ejercicio01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio01Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio01Application.class, args);
	}

}

/**
 * EJERCICIO 01 - SECCION 03
 * Ejercicio Nº 1 – Estudiante de Programación

 * Un estudiante de programación desea llevar control de los temas que aprendió en diferentes cursos para luego poderlos incluir en su curriculum vitae. Para ello, creó una base de datos llamada cursos. A partir de la creación de la base de datos, empezó con el desarrollo de una aplicación y realizó el modelado de dos clases: Curso y Tema, en donde un curso puede contener varios temas (relación 1 a muchos).

 * La clase curso tiene los siguientes atributos: id_curso, nombre, modalidad, fecha_finalización, listaDeTemas
 * La clase tema tiene los siguientes atributos: id_tema, nombre, descripcion
 * A partir de esto, el estudiante desea desarrollar una API que le permita realizar las siguientes acciones:

 * Crear un nuevo curso --> OK POST en CURSOS
 * Crear temas y asociar a un curso --> OK POST en TEMAS (pasando id del curso)
 * Obtener todos los cursos --> OK GET en CURSOS
 * Obtener todos los temas de un determinado curso --> OK GET en CURSOS con DTO.
 * Obtener todos los cursos que contengan como nombre la palabra “Java” (puede contener otras palabras, por ejemplo, Introducción a Java, Java avanzado, Java para principiantes, etc). --> OK GET en CURSOS. Fijarse la lista en service.
 * Modificar los datos de un curso --> OK PUT en cursos
 * Modificar los datos de un determinado tema --> OK PUT en temas
 * Para realizar cada uno de los endpoints considerar los métodos HTTP correspondientes según la acción que sea necesaria llevar a cabo. Al mismo tiempo, contemplar el uso de DTOs para las respuestas y todas las buenas prácticas que creas que puedan ser aplicadas. Utilizar JPA + Hibernate para el CRUD de datos en una base de datos MySQL.
 */