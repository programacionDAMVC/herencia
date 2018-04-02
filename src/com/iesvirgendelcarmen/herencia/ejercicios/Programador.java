package com.iesvirgendelcarmen.herencia.ejercicios;

public class Programador extends Informatico {

	private String lenguajeProgramacion;

	public Programador(String nombreEmpresa, String lenguajeProgramacion) {
		super(nombreEmpresa);
		this.lenguajeProgramacion = lenguajeProgramacion;
		
	}

	
	
	/*public Programador(String nombreEmpresa) {
		super(nombreEmpresa);
	}*/
	
	//El programador va a cobrar un 10% mas que un informático
	@Override
	public double pagarSueldo(double horas) {
		// TODO Auto-generated method stub
		return super.pagarSueldo(horas) * 1.1;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "soy un programador con especialidad en " + lenguajeProgramacion;
	}
	
	
	
	
}
