package t3;

import java.util.Scanner;

public class Ej25 {
	public static boolean esPrimo(int n) {
		boolean esPrimoPorAhora = true;
		for ( int i = 2; esPrimoPorAhora && i <= n-1; i++) {
			System.out.println("Vuelta " + i);
			if ( n % i == 0) {
				esPrimoPorAhora = false;
			}
		}
		return esPrimoPorAhora;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce n: ");
		int numero = scan.nextInt();
		String particula = esPrimo(numero) ? "" : "no ";
		String mensaje = "El número " + numero + " " + particula + "es primo";
		System.out.println(mensaje);
	}
}
