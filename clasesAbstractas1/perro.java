package clasesAbstractas1;
public class perro extends mamifero implements Carnivoro,terrestre{
	
	public perro() {
		super();
	}
		
	public void hablar() {
		System.out.println("guau guau");
	}
	
	public void caminar() {
		System.out.println("camina con sus patas");
	}
	
	public String dieta() {
		return "Carne de animales";
	}
	
	public void informar() {
		System.out.println("nombre: "+super.nombre+" edad: "+super.edad);
	}
	
}
