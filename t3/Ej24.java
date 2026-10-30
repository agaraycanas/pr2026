package t3;

import java.util.Scanner;

public class Ej24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce n: ");
		int n = scan.nextInt();
		int acumulador = 0;
		boolean posicionImpar = true;

		if (n == 0) {
			acumulador++;
		} else {
			while (n != 0) {
				System.out.print("Procesando dígito "+ (n%10) + "\t" );
				if ( posicionImpar ) {
					acumulador  = acumulador + (n%10);
				}
				System.out.println("Acumulado: " + acumulador);
				n = n / 10;
				posicionImpar = !posicionImpar;
			}
		}
		System.out.println("Suma de cifras de posición impar: " + acumulador);
	}
}
