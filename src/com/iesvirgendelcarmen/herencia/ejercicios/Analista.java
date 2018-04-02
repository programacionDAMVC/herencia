package com.iesvirgendelcarmen.herencia.ejercicios;

public class Analista extends Informatico{

	private String especialidad;

	public Analista(String nombreEmpresa, String especialidad) {
		super(nombreEmpresa);
		this.especialidad = especialidad;
	}

	@Override
	public double pagarSueldo(double horas) {
		// TODO Auto-generated method stub
		return super.pagarSueldo(horas) * 1.3;
	}
	
	
	
}
