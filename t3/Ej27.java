package t3;

import java.util.Scanner;

public class Ej27 {
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
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce a: ");
		int a = scan.nextInt();
		
		System.out.println("Introduce b: ");
		int b = scan.nextInt();
		
		for (int n=a; n<=b; n++) {
			if (esPrimo(n)) {
				System.out.println(n);
			}
		}
	}
}
