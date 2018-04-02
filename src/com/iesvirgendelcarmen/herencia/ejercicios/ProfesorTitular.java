package com.iesvirgendelcarmen.herencia.ejercicios;

import java.time.LocalDate;

public class ProfesorTitular extends Profesor {

	private LocalDate fechaIncorporacion;

	public ProfesorTitular(String nombrePersona, String dni, 
			LocalDate fechaNacimiento, String especialidad,
			LocalDate fechaIncorporacion) {
		super(nombrePersona, dni, fechaNacimiento, especialidad);
		this.fechaIncorporacion = fechaIncorporacion;
	}

	@Override
	public String toString() {
		return "ProfesorTitular [fechaIncorporacion=" + fechaIncorporacion + ", especialidad " + getEspecialidad()
				+ ", nombre " + getNombrePersona() + "]\n";
	}
	
	
	
}
