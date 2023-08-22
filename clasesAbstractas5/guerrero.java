package clasesAbstractas5;

import java.util.Random;

public class guerrero extends personajeBase {
	Random random = new Random();
	int aux;

	public guerrero() {
	}

	public guerrero(int fuerza, int destreza, int constitucion, int sabiduria, int inteligencia, int carisma) {
		super(fuerza, destreza, constitucion, sabiduria, inteligencia, carisma);
	}

	public int ataque() {
		return  random.nextInt(20) + (fuerza * 2) + 6;
	}

	public int movimiento() {
		aux = random.nextInt(destreza / 2) + 3;
		return aux;
	}

	public int descanso() {
		aux = random.nextInt(constitucion)+2;
		this.setVida(this.vida + aux);
		return aux;
	}

	public int dañoFisico(int daño) {// bonificacion en defensa fisica
		aux = (daño - (constitucion + destreza + 5));
		this.setVida(this.vida - aux);
		return aux;
	}

	public int dañoMagico(int daño) {
		aux = (daño - (sabiduria + destreza));
		this.setVida(this.vida - aux);
		return aux;
	}

}
