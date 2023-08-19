package clasesAbstractas5;

import java.util.Random;

public class guerrero extends personajeBase{
	Random random = new Random();
	int aux; 
	
	public guerrero() {
	}
	public guerrero(int fuerza, int destreza, int constitucion, int sabiduria, int inteligencia, int carisma) {
		super(fuerza, destreza, constitucion, sabiduria, inteligencia, carisma);
	}
	public int ataque() {
		aux = random.nextInt(20)+(fuerza*2)+10;
		return aux;
	}
	public int movimiento() {
		aux = random.nextInt(destreza/2)+2;
		return aux;
	}
	public int descanso() {
		aux = random.nextInt(constitucion);
		return aux;
	}
	
	public int dañoFisico(int daño) {
		aux = (daño-(constitucion+destreza+5)); 
		return aux;
	}
	public int dañoMagico(int daño) {
		aux = (daño-(sabiduria+destreza)); 
		return aux;
	}
	
	
	
}
