package com.iesvirgendelcarmen.herencia.ejercicios;

import java.time.LocalDate;

public class Profesor extends Persona {

	private String especialidad;

	public Profesor(String nombrePersona, String dni, LocalDate fechaNacimiento, String especialidad) {
		super(nombrePersona, dni, fechaNacimiento);
		this.especialidad = especialidad;
	}

	
	
	public String getEspecialidad() {
		return especialidad;
	}



	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}



	@Override
	public String toString() {
		return "Profesor [especialidad=" + especialidad + ", nombre " + getNombrePersona() + ", dni "
				+ getDni() + "]";
	}
	
	
	
}
