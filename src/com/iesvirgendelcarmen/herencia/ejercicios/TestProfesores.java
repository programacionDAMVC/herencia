package com.iesvirgendelcarmen.herencia.ejercicios;

import java.time.LocalDate;
import java.util.List;

public class TestProfesores {
	public static void main(String[] args) {
		System.out.println("Creando objeto lista profesores");
		ListaProfesores claustro = new ListaProfesores();
		Profesor profesor1 = new ProfesorTitular("juan", "1", LocalDate.of(1990, 10, 10),
				"latin", LocalDate.of(2018, 11, 11));
		Profesor profesor2 = new ProfesorTitular("pedro", "2", LocalDate.of(1980, 1, 10),
				"latin", LocalDate.of(2000, 1, 1));
		Profesor profesor3 = new ProfesorTitular("irene", "3", LocalDate.of(1970, 10, 1),
				"latin", LocalDate.of(1999, 11, 11));
		Profesor profesor4 = new ProfesorInterino("isabel", "4", LocalDate.of(2000, 10, 10),
				"latin", LocalDate.of(2018, 11, 11));
		Profesor profesor5 = new ProfesorInterino("lucas", "1", LocalDate.of(1975, 12, 10),
				"latin", LocalDate.of(2017, 11, 11));
		
		System.out.println("Añadiendo profesores al claustro");
		claustro.adicionarProfesor(profesor1);
		claustro.adicionarProfesor(profesor2);
		claustro.adicionarProfesor(profesor3);
		claustro.adicionarProfesor(profesor4);
		claustro.adicionarProfesor(profesor5);
		
		System.out.println(claustro + "\n\n"); //no tiene toString sobreescrito, muestra Object
		System.out.println(claustro.getLista() + "\n\n");

		List<Profesor> lista = claustro.getLista();
		
		for (Profesor profesor : lista) {
			System.out.println(profesor.toString());
			if (profesor instanceof ProfesorTitular)
				System.out.println(((ProfesorTitular) profesor).getFechaIncorporacion());
			else
				System.out.println(((ProfesorInterino) profesor).getFinDeContrato());
		}
		
		
		
		
	}
	
}
