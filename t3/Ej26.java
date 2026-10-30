package t3;

import java.util.Scanner;

public class Ej26 {
	public static boolean esPrimo(int n) {
		boolean esPrimoPorAhora = true;
		for ( int i = 2; esPrimoPorAhora && i <= n-1; i++) {
			if ( n % i == 0) {
				esPrimoPorAhora = false;
			}
		}
		return esPrimoPorAhora;
	}
	
	public static String mensaje(int n) {
		String particula = esPrimo(n) ? "" : "no ";
		String mensajeADevolver = "El número " + n + " " + particula + "es primo";
		return mensajeADevolver;
	}
	
	public static void main(String[] args) {
		for (int n=2; n<=100; n++) {
			if (esPrimo(n)) {
				System.out.println(n);
			}
		}
	}
}
