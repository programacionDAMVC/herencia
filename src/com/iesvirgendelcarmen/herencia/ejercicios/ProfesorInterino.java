package com.iesvirgendelcarmen.herencia.ejercicios;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor {

	private LocalDate finDeContrato;

	public ProfesorInterino(String nombrePersona, String dni, LocalDate fechaNacimiento, String especialidad,
			LocalDate finDeContrato) {
		super(nombrePersona, dni, fechaNacimiento, especialidad);
		this.finDeContrato = finDeContrato;
	}

	@Override
	public String toString() {
		return "ProfesorInterino [finDeContrato=" + finDeContrato + ", especialidad " + getEspecialidad()
				+ ", nombre " + getNombrePersona() + "]\n";
	}
	
	
	
}
