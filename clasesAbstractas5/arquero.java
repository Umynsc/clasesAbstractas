package clasesAbstractas5;

import java.util.Random;

public class arquero extends personajeBase {
	Random random = new Random();
	int aux;

	public arquero() {
	}

	public arquero(int fuerza, int destreza, int constitucion, int sabiduria, int inteligencia, int carisma) {
		super(fuerza, destreza, constitucion, sabiduria, inteligencia, carisma);
		// TODO Auto-generated constructor stub
	}

	public int ataque() {// el arquero usa destreza para el ataque
		return random.nextInt(20) + (destreza * 2) + 5;
	}

	public int movimiento() {// tiene bonificacion en movimiento
		aux = random.nextInt(destreza / 2) + 6;
		return aux;
	}

	public int descanso() {// tiene bonificacion al descanso
		aux = random.nextInt(constitucion)+5;
		this.setVida(this.vida + aux);
		return aux;
	}

	public int dañoFisico(int daño) {
		aux = (daño - (constitucion + destreza));
		this.setVida(this.vida - aux);
		return aux;
	}

	public int dañoMagico(int daño) {
		aux = (daño - (sabiduria + destreza));
		this.setVida(this.vida - aux);
		return aux;
	}
}
