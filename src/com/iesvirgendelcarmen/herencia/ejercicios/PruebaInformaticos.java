package com.iesvirgendelcarmen.herencia.ejercicios;

public class PruebaInformaticos {

	public static void main(String[] args) {
		
		Programador programador1 = new Programador("Empresa1", "java");
		Programador programador2 = new Programador("Empresa1", "python");
		Analista analista1 = new Analista("Empresa1", "desarrollo web");
		Analista analista2 = new Analista("Empresa1", "desarrollo móvil");
		
		System.out.printf("Programador con %.1f horas trabajadas "
				+ "gana %.2f€%n", 25.0, programador1.pagarSueldo(25));
		System.out.printf("Analista con %.1f horas trabajadas "
				+ "gana %.2f€%n", 25.0, analista1.pagarSueldo(25));
		
		System.out.println("Empresa del programador " + programador1.getNombreEmpresa());
		System.out.println("Empresa del analista " + analista1.getNombreEmpresa());
		
		System.out.println(programador1);
		System.out.println(analista1.toString()); //es igual que arriba

		Informatico informatico =  new Programador("Empresa2", "javascript");
		System.out.printf("Programador con %.1f horas trabajadas "
				+ "gana %.2f€%n", 25.0, informatico.pagarSueldo(25));
		System.out.println("Empresa del programador " + informatico.getNombreEmpresa());
		System.out.println(informatico);
	}

}
