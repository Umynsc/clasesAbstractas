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
		return random.nextInt(20)+(fuerza*2);
	}
	public int movimiento() {
		aux = random.nextInt(destreza/2)+3;
		return aux;
	}
	public int descanso() {
		aux = random.nextInt(constitucion)+2;
		this.setVida(this.vida + aux);
		return aux;
	}
	
	public int dañoFisico(int daño) {
		aux = (daño-(constitucion+destreza)); 
		this.setVida(this.vida-aux);
		return aux;
	}
	public int dañoMagico(int daño) {
		aux = (daño-(sabiduria+destreza+5)); 
		this.setVida(this.vida - aux);
		return aux;
	}
	
	public int Lanzar() {
		BoladeFuego hechizo = new BoladeFuego(this.inteligencia,this.carisma);
		return hechizo.Lanzar();
	}

}
