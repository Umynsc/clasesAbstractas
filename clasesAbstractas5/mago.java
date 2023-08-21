package clasesAbstractas5;

import java.util.Random;

public class mago extends personajeBase{
	Random random = new Random();
	int aux; 
	
	public mago() {
	}
	public mago(int fuerza, int destreza, int constitucion, int sabiduria, int inteligencia, int carisma) {
		super(fuerza, destreza, constitucion, sabiduria, inteligencia, carisma);
		// TODO Auto-generated constructor stub
	}

	public int ataque() {
		aux = random.nextInt(20)+(fuerza*2);
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
		aux = (daño-(constitucion+destreza)); 
		return aux;
	}
	public int dañoMagico(int daño) {
		return daño-(sabiduria+destreza+5); 
	}
	
	public int bolaDeFuego() {
		return random.nextInt(carisma*2)+inteligencia+5;
	}

}
