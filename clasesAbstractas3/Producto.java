package clasesAbstractas3;

public abstract class Producto {
	String nombre;
	int codigo;
	double precio;
	
	
	public Producto() {
		
	}

	public Producto(String nombre, int codigo, double precio) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public abstract double calcularImpuestos(double Aux);
	public abstract double AplicarDescuentos (double Aux);
	
}
