
package clasesAbstractas3;

public class Alimento extends Producto{
	int mesVence;
	int añoVence;
	String clasificacion;
	boolean refrigeracion;

	public Alimento() {
		super();
	}

	public Alimento(String nombre, int codigo, double precio, 
			int mesVence, int añoVence, String clasificacion, 
			boolean refrigeracion) {
		super(nombre, codigo, precio);
		this.mesVence = mesVence;
		this.añoVence = añoVence;
		this.clasificacion = clasificacion;
		this.refrigeracion = refrigeracion;
	}

	public int getMesVence() {
		return mesVence;
	}
	public int getAñoVence() {
		return añoVence;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public boolean isRefrigeracion() {
		return refrigeracion;
	}
	public void setMesVence(short mesVence) {
		this.mesVence = mesVence;
	}
	public void setAñoVence(short añoVence) {
		this.añoVence = añoVence;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	public void setRefrigeracion(boolean refrigeracion) {
		this.refrigeracion = refrigeracion;
	}

	
	public double calcularImpuestos(double Aux) {
		//retorna solo el impuesto aplicado
		return getPrecio()*(Aux/100);
	}
	public double AplicarDescuentos(double Aux) {
		//retorna el precio final con el descuento aplicado
		return getPrecio()-(getPrecio()*(Aux/100));
	}

	
	@Override
	public String toString() {
		return nombre + " [codigo: " + codigo +", vencimiento " + mesVence + "/" + añoVence + ", "
				+ (clasificacion != null ? "clasificacion: " + clasificacion + ", " : "") + " Necesita refrigeracion: "
				+(refrigeracion != false ? "si" : "no") + ", precio: $" + precio + "]";
	}

	
}