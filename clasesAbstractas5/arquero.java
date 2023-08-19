package clasesAbstractas5;

import java.util.Random;

public class arquero extends personajeBase{
	Random random = new Random();
	int aux; 
	
	public arquero() {
	}
	public arquero(int fuerza, int destreza, int constitucion, int sabiduria, int inteligencia, int carisma) {
		super(fuerza, destreza, constitucion, sabiduria, inteligencia, carisma);
		// TODO Auto-generated constructor stub
	}

	public int ataque() {//el arquero usa destreza para el ataque
		aux = random.nextInt(20)+(destreza*2);
		return aux;
	}
	public int movimiento() {//tiene bonificacion en movimiento
		aux = random.nextInt(destreza/2)+5;
		return aux;
	}
	public int descanso() {//tiene bonificacion en descanso
		aux = random.nextInt(constitucion)+2;
		return aux;
	}
	
	public int dañoFisico(int daño) {//
		aux = (daño-(constitucion+destreza+2)); 
		return aux;
	}
	public int dañoMagico(int daño) {
		aux = (daño-(sabiduria+destreza+2)); 
		return aux;
	}
	
}
