package clasesAbstractas4;
public class Libro extends Media{
	String editorial;
	String genero;
	int paginas;
	
	public Libro() {}
	public Libro(String nombre,String editorial,String genero,int paginas) {
		super(nombre);
		this.editorial=editorial;
		this.genero=genero;
		this.paginas=paginas;
	}
	public String getEditorial() {
		return editorial;
	}
	public String getGenero() {
		return genero;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	@Override
	public String toString() {
		return ("Libro "+nombre != null ? "nombre: " + nombre : "") + 
				(editorial != null ? "editorial: " + editorial + ", " : "") + 
				(genero != null ? "genero: " + genero + ", " : "") + "paginas: " + paginas + ", ";
	}
	
	
}
