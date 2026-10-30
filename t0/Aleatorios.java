package t0;

import java.util.Random;

public class Aleatorios {
	public static void main(String[] args) {
		int n = 6;
		for (int i = 0; i < 100; i++) { // Simula 100 tiradas de un dado de 6 caras 
			int aleatorio = (new Random()).nextInt(n) + 1;
			System.out.println(aleatorio + " ");
		}
	}
}
