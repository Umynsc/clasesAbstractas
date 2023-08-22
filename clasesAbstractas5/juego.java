package clasesAbstractas5;

import java.util.Scanner;

public class juego {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int auxInt;
		boolean salida = false;
		personajeBase jugador = null;

		System.out.println("Bienvenido al mundo de Thernhya\nEsto es la creacion del personaje"
				+ "\nElige que clase vas a utilizar" + "\nLuego tendras 30 puntos para distribuir en los atributos");

		while (salida == false) {
			System.out.println("1-Guerrero \n2-Arquero\n3-Mago");
			auxInt = entrada.nextInt();
			switch (auxInt) {
			case 1:
				System.out.println("El guerrero tiene bonificacion en fuerza y constitucion, pero es debil a la magia");
				System.out.println("Eliges al guerrero? \n1)SI  /  2)NO");
				auxInt = entrada.nextInt();
				if (auxInt == 1) {

	// aca se gestionan los puntos antes de crear el pj
					jugador = new guerrero(5, 5, 5, 5, 5, 5);
					salida = true;
				}
				break;
			case 2:
				System.out.println(
						"El arquero tiene bonificaciones al movimiento y la agilidad, y usa su destreza para el ataque");
				System.out.println("Eliges al Arquero? \n1)SI  /  2)NO");
				auxInt = entrada.nextInt();
				if (auxInt == 1) {

	// aca se gestionan los puntos antes de crear el pj
					jugador = new arquero(5, 5, 5, 5, 5, 5);
					salida = true;

				}
				break;
			case 3:
				System.out.println("El mago tiene bonificaciones en defensa con la magia");
				System.out.println("Eliges al mago? \n1)SI  /  2)NO");
				auxInt = entrada.nextInt();
				if (auxInt == 1) {

	// aca se gestionan los puntos antes de crear el pj
					jugador = new mago(5, 5, 5, 5, 5, 5);
					salida = true;

				}
				break;
			}
		}             // fin de creacion de pj
		jugador.setVida(jugador.getConstitucion() * 2);
		System.out.println("vida: " + jugador.getVida() + "\n");

		
	// se crean enemigos
		guerrero enemigoGuerrero = new guerrero(7, 6, 7, 4, 3, 3);
		enemigoGuerrero.setVida(enemigoGuerrero.getConstitucion() * 2);
		arquero enemigoArquero = new arquero(5, 7, 5, 7, 3, 3);
		enemigoArquero.setVida(enemigoArquero.getConstitucion() * 2);
		mago enemigoMago = new mago(3, 3, 4, 7, 7, 6);
		enemigoMago.setVida(enemigoMago.getConstitucion() * 2);
		enemigoMago.setMagia(enemigoMago.getSabiduria());
	
	// se declaran las variables para el manejo de historia
		int eleccion, daños;
		int condicion = 0;

		
	// bucle principal del juego
		while ((jugador.getVida() > 0) && (condicion != 3)) {
			System.out.println("[Sala principal] \n1)izquierda \n2)adelante \n3)Derecha \n0)Atras\n");
			auxInt = entrada.nextInt();
			switch (auxInt) {
			
	//habitacion de guerrero
			case 1: 
				System.out.println("Te mueves a la izquierda");
				if (enemigoGuerrero.getVida() > 0) {
					System.out.println("En la habitacion hay un guerrero con " + enemigoGuerrero.getVida()
							+ " puntos de vida. " + "\nQue quieres hacer? \n1)atacar 2)saludar 3)regresar ");
					eleccion = entrada.nextInt();
				} else {
					System.out.println("en la habitacion esta el guerrero desmayado \n3)regresar");
					eleccion = entrada.nextInt();
				}

				while ((eleccion != 3) && (jugador.getVida() > 0) && (enemigoGuerrero.getVida() > 0)) {
					switch (eleccion) {
					case 1:
						if (jugador instanceof mago) {
							// opciones del mago
							System.out.println("Lanzas una Bola de Fuego. ");
							System.out.println("Hiciste "+enemigoGuerrero.dañoMagico(jugador.Lanzar())+" de daño.");

						} else {// opciones de guerrero o arquero
							daños = jugador.ataque();
							System.out.println("hiciste " + enemigoGuerrero.dañoFisico(daños) + " de daño !!");
						}
						if (enemigoGuerrero.getVida() <= 0) {
							System.out.println("te ataca! \nRecibis " + jugador.dañoFisico(enemigoGuerrero.ataque())
									+ " de daño");
							System.out.println(
									"Tu vida: " + jugador.getVida() + "\nGuerrero: " + enemigoGuerrero.getVida());
							
							System.out.println("1)atacar 2)saludar 3)huir");
							eleccion = entrada.nextInt();
						} else {// si es derrotado incrementa la condicion

							condicion++;
						}

						
						break;
					case 2:
						System.out.println("guerrero te saluda alegremente.\n");

						System.out.println("En la habitacion hay un guerrero con " + enemigoGuerrero.getVida()
								+ " puntos de vida. " + "\nQue quieres hacer? \n1)atacar 2)saludar 3)regresar ");
						eleccion = entrada.nextInt();
						break;
					case 3:
						System.out.println("regresas a la sala\n");

						break;
					}
				}

				break;
			case 2: // eleccion adelante

				System.out.println("Te mueves adelante");
				if (enemigoArquero.getVida() > 0) {
					System.out.println("En la habitacion hay un " + "arquero" + " con " + enemigoArquero.getVida()
							+ " puntos de vida. " + "\nQue quieres hacer? \n1)atacar 2)saludar 3)regresar ");
					eleccion = entrada.nextInt();
				} else {
					System.out.println("en la habitacion esta el " + "arquero" + " desmayado \n3)regresar");
					eleccion = entrada.nextInt();
				}

				while ((eleccion != 3) && (jugador.getVida() > 0) && (enemigoArquero.getVida() > 0)) {
					switch (eleccion) {
					case 1:
						if (jugador instanceof mago) {
							// opciones del mago

						} else {
							// opciones de guerrero o arquero

							daños = jugador.ataque();
							System.out.println("hiciste " + enemigoArquero.dañoFisico(daños) + " de daño !!");
							System.out.println(
									"te ataca! \nRecibis " + jugador.dañoFisico(enemigoArquero.ataque()) + " de daño");
							System.out.println(
									"Tu vida: " + jugador.getVida() + "\nArquero: " + enemigoArquero.getVida());

							// si es derrotado incrementa la condicion
							if (enemigoArquero.getVida() <= 0) {
								condicion++;
							}
						}

						if ((enemigoArquero.getVida() > 0) && (jugador.getVida() > 0)) {
							System.out.println("1)atacar 2)saludar 3)huir");
							eleccion = entrada.nextInt();
						}
						break;
					case 2:
						System.out.println("El arquero te ignora.\n");

						System.out.println("En la habitacion hay un " + "arquero" + " con " + enemigoArquero.getVida()
								+ " puntos de vida. " + "\nQue quieres hacer? \n1)atacar 2)saludar 3)regresar ");
						eleccion = entrada.nextInt();
						break;
					case 3:
						System.out.println("regresas a la sala\n");

						break;
					}
				}

				break;
			case 3: // eleccion derecha
				System.out.println("Te mueves a la derecha");
				if (enemigoMago.getVida() > 0) {
					System.out.println("En la habitacion hay un " + "mago" + " con " + enemigoMago.getVida()
							+ " puntos de vida. " + "\nQue quieres hacer? \n1)atacar 2)saludar 3)regresar ");
					eleccion = entrada.nextInt();
				} else {
					System.out.println("en la habitacion esta el " + "mago" + " desmayado \n3)regresar");
					eleccion = entrada.nextInt();
				}

				while ((eleccion != 3) && (jugador.getVida() > 0) && (enemigoMago.getVida() > 0)) {
					switch (eleccion) {
					case 1:
						if (jugador instanceof mago) {
							// opciones del mago

						} else {
							// opciones de guerrero o arquero
							daños = jugador.ataque();
							System.out.println("hiciste " + enemigoMago.dañoFisico(daños) + " de daño !!");

							if (enemigoMago.getVida() > 0) {
								System.out.println(
										"te ataca! \nRecibis " + jugador.dañoMagico(enemigoMago.Lanzar()) + " de daño");
								System.out
										.println("Tu vida: " + jugador.getVida() + "\nMago: " + enemigoMago.getVida());
							} else {// si es derrotado incrementa la condicion
								condicion++;
							}
						}
						if ((enemigoMago.getVida() > 0) && (jugador.getVida() > 0)) {
							System.out.println("1)atacar 2)saludar 3)huir");
							eleccion = entrada.nextInt();
						}

						break;
					case 2:
						System.out.println("El mago te mira con aire desafiante.\n");

						System.out.println("En la habitacion hay un  " + "mago" + "  con " + enemigoMago.getVida()
								+ " puntos de vida. " + "\nQue quieres hacer? \n1)atacar 2)saludar 3)regresar ");
						eleccion = entrada.nextInt();
						break;
					case 3:
						System.out.println("regresas a la sala\n");

						break;
					}
				}

				break;
			case 0: // eleccion descansar
				System.out.println("Regresas");
				System.out.println("Te sientas a desccansar");
				System.out.println("Recuperas " + jugador.descanso() + " puntos de vida");

				break;
			}
		}

		if (jugador.getVida() < 0) {
			System.out.println("Fin del juego");
		} else {
			System.out.println("Felicidades ganaste un chocolate !!");
		}

		entrada.close();
	}
}