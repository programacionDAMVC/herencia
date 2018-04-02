package com.iesvirgendelcarmen.herencia.ejercicios;

import java.time.LocalDate;

public class Persona {
	
	private String nombrePersona;
	private String dni;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombrePersona, String dni, LocalDate fechaNacimiento) {
		this.nombrePersona = nombrePersona;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombrePersona=" + nombrePersona + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento
				+ "]";
	}
	
	
	
	
}
