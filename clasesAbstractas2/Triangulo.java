package clasesAbstractas2;

class Triangulo extends FiguraGeometrica {
	double base;
	double altura;
	double lado1;
	double lado2;
	double lado3;
	
	public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public double calcularArea() {
		return (base * altura) / 2;
	}
	
	@Override
	public double calcularPerimetro() {
		return lado1 + lado2 + lado3;
	}
}
