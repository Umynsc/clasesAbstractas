package clasesAbstractas2;

public class circulo extends FiguraGeometrica {
	double radio;
	 double diam;
	
	public circulo () {
		super();
	}
	
	public circulo(double radio) {
		super();
		this.radio = radio;
		this.diam = radio*radio;
	}
	
	public double calcularArea() {
		return Math.PI*diam;
	}
	
	public double calcularPerimetro() {
		return (2*Math.PI)*radio;
	}
	
}
