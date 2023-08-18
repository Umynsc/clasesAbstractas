package clasesAbstractas3;
public class Electronico extends Producto {
	int garantia; //en meses
	String marca;
	String caracteristicas; 
	
	public Electronico() {
		super();
	}
	public Electronico(String nombre, int codigo, double precio, int garantia, String marca, String caracteristicas) {
		super(nombre, codigo, precio);
		this.garantia = garantia;
		this.marca = marca;
		this.caracteristicas = caracteristicas;
	}

	public int getGarantia() {
		return garantia;
	}
	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	

	public double calcularImpuestos(double Aux) {
		//retorna solo el impuesto aplicado
		return getPrecio()*(Aux/100);
	}
	public double AplicarDescuentos(double Aux) {
		//retorna el precio final con el descuento aplicado
		return getPrecio()-(getPrecio()*(Aux/100));
	}

	public String toString() {
		return "Producto: "+nombre+" [codigo: "+codigo+ (garantia != 0 ? " garantia: " + garantia + " meses, " : "sin garantia") + (marca != null ? "marca: " + marca + ", " : "")
				+ (caracteristicas != null ? "caracteristicas: " + caracteristicas : "") + "]";
	}	
}