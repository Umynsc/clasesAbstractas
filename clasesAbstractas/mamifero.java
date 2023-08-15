package clasesAbstractas;

public abstract class mamifero extends Animal{
	String pelaje;

	public mamifero() {
		super();
	}
	
	public mamifero(String nombre, int edad, String pelaje) {
		super(nombre,edad);
		this.pelaje = pelaje;
	}

	public String getPelaje() {
		return pelaje;
	}
	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}

	
	public void amamantarCrias() {
	}


	
	
}
