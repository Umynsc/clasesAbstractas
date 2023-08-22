package clasesAbstractas5;

import java.util.Random;

public class BoladeFuego implements Hechizos {
	Random random = new Random();
	int I;
	int C;

	public BoladeFuego(int I, int C) {
		this.I = I;
		this.C = C;
	}

	public int Lanzar() {
		int aux = random.nextInt(20) + ((I + C) / 2) + 5;
		return aux;
	}

}
