package clasesAbstractas3;

public class Ropa extends Producto{
	String talle;
	
	
	public Ropa() {
		super();
	}
	public Ropa(String nombre, int codigo, double precio, String talle) {
		super(nombre, codigo, precio);
		this.talle = talle;
	}
	public String getTalle() {
		return talle;
	}
	public void setTalle(String talle) {
		this.talle = talle;
	}
	
	public double calcularImpuestos(double Aux) {
		return getPrecio()*(Aux/100);
	}
	
	public double AplicarDescuentos(double Aux) {
		return getPrecio()-(getPrecio()*(Aux/100));
	}
	@Override
	public String toString() {
		return  (nombre != null ? nombre + ": " : "") +
				(codigo != 0 ? "codigo: " + codigo + ", " : "") +
				(precio != 0 ? "precio: $" + precio + ", " : "") +
				(talle != null ? "talle: " + talle + ", " : "");
	}
	
	
	
}
