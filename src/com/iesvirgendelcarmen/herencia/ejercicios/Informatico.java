package com.iesvirgendelcarmen.herencia.ejercicios;

public class Informatico {
		
	private String nombreEmpresa;
	private double sueldoBasePorHora = 20;  
	
	public Informatico(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
		
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public double getSueldoBasePorHora() {
		return sueldoBasePorHora;
	}

	public void setSueldoBasePorHora(double sueldoBasePorHora) {
		this.sueldoBasePorHora = sueldoBasePorHora;
	}
	
	public double pagarSueldo( double horas ) {
		return sueldoBasePorHora * horas;		
	}

	@Override
	public String toString() {
		return "Informatico trabajando en empresa " + nombreEmpresa +
				", sueldoBasePorHora=" + sueldoBasePorHora;
	}
	
	
}
