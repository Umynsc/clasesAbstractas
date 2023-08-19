package clasesAbstractas4;

public class Cancion  extends Media{
	String autor;
	String album;
	int duracion;
	String genero;
	String discografica;
	
	
	public Cancion() {
		}
	public Cancion(String nombre,String autor,String album,int duracion,String genero,String discografica) {
		super(nombre);
		this.autor=autor;
		this.discografica=discografica;
		this.genero=genero;
		this.duracion=duracion;
		this.album=album;
	}
	public String getAutor() {
		return autor;
	}
	public String getAlbum() {
		return album;
	}
	public int getDuracion() {
		return duracion;
	}
	public String getGenero() {
		return genero;
	}
	public String getDiscografica() {
		return discografica;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setDiscografica(String discografica) {
		this.discografica = discografica;
	}
	public String toString() {
		return (nombre != null ? "nombre: " + nombre : "")+(autor != null ? "autor: " + autor + ", " : "") + (album != null ? "album: " + album + ", " : "")
				+ "duracion: " + duracion + ", " + (genero != null ? "genero: " + genero + ", " : "")
				+ (discografica != null ? "discografica: " + discografica + ", " : "");
	}

}
