package clasesAbstractas5;

import java.util.Random;

public class prueba_aleatorio {

	public prueba_aleatorio() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int aux = rd.nextInt(5);
		
		while (aux != 0) {
			System.out.println(aux);
		}
	}
}
