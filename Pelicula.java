package clasesAbstractas4;

public class Pelicula extends Media {
	String genero;
	int año;
	String actores;
	String productora;
	
	public Pelicula() {
	}
	public Pelicula(String nombre,String genero, int año, String actores, String productora) {
		super(nombre);
		this.genero = genero;
		this.año = año;
		this.actores = actores;
		this.productora = productora;
	}
	public String getGenero() {
		return genero;
	}
	public int getAño() {
		return año;
	}
	public String getActores() {
		return actores;
	}
	public String getProductora() {
		return productora;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public void setActores(String actores) {
		this.actores = actores;
	}
	public void setProductora(String productora) {
		this.productora = productora;
	}
	@Override
	public String toString() {
		return  nombre + (genero != null ? "genero: " + genero + ", " : "") + "año: " + año + ", "
				+ (actores != null ? "actores: " + actores + ", " : "")
				+ (productora != null ? "productora: " + productora + ", " : "");
	}
	
	

}