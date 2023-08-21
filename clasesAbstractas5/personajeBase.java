package clasesAbstractas5;

public abstract class personajeBase {
	int vida;
	int magia;
	
	int fuerza;
	int destreza;
	int constitucion;
	int sabiduria;
	int inteligencia;
	int carisma;
	
	public personajeBase() {
	}
	public personajeBase(int fuerza, int destreza, int constitucion, int sabiduria, int inteligencia, int carisma) {
		super();
		this.fuerza = fuerza;
		this.destreza = destreza;
		this.constitucion = constitucion;
		this.sabiduria = sabiduria;
		this.inteligencia = inteligencia;
		this.carisma = carisma;
	}


	public int getVida() {
		return vida;
	}
	public int getMagia() {
		return magia;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public void setMagia(int magia) {
		this.magia = magia;
	}
	
	public int getFuerza() {
		return fuerza;
	}
	public int getDestreza() {
		return destreza;
	}
	public int getConstitucion() {
		return constitucion;
	}
	public int getSabiduria() {
		return sabiduria;
	}
	public int getInteligencia() {
		return inteligencia;
	}
	public int getCarisma() {
		return carisma;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}
	public void setConstitucion(int constitucion) {
		this.constitucion = constitucion;
	}
	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	public void setCarisma(int carisma) {
		this.carisma = carisma;
	}
	
	public abstract int ataque();
	public abstract int movimiento();
	public abstract int descanso();
	public abstract int dañoFisico(int daño);
	public abstract int dañoMagico(int daño);
	
	
}