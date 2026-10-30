package t4;

import java.util.Arrays;
import java.util.Random;

public class Ej10 {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage: Ej10 <nTiradas> <nCaras>");
		} else {
			int numeroDeTiradas = Integer.parseInt(args[0]);
			int numeroDeCaras = Integer.parseInt(args[1]);
			int[] frecuencias = new int[ numeroDeCaras + 1];
			System.out.println("Simulando "+numeroDeTiradas+ " tiradas de "+numeroDeCaras+ " caras");

			for (int i = 0; i < numeroDeTiradas; i++) {
				int caraAleatoria = (new Random()).nextInt(numeroDeCaras) + 1;
				frecuencias[caraAleatoria] ++;
			}
			
			System.out.println(Arrays.toString(frecuencias));
		}
	}
}
