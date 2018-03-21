package com.iesvirgendelcarmen.herencia.teoria;

public class TrianguloRectangulo extends Triangulo{
	
	private float cateto1;
	private float cateto2;
	
	public TrianguloRectangulo(  float cateto1,	float cateto2) {
		super(TipoDeTriangulo.RECTANGULO, cateto1, cateto2, 
				(float) Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2));
		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
	}
	
	public float getCateto1() {
		return cateto1;
	}
	public float getCateto2() {
		return cateto2;
	}
	
	public float calcularArea() {
		return cateto1 * cateto2 / 2.0f;
	}

	@Override
	public String toString() {
		return  super.toString() + "\nTrianguloRectangulo [cateto1=" + cateto1 + ", cateto2=" + cateto2;
	}
	
	
	
	
}
