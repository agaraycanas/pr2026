package t3;

import java.util.Scanner;

public class Ej33 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce n: ");
		int n = scan.nextInt();
		
		//int n = 100;
		float acumulado = 0;
		
		for (float i=1; i<=n; i++) {
			float terminoActual = ((i*i) + 1) / i;
			System.out.println("(" + i + ") " +terminoActual);
			acumulado = acumulado + terminoActual;
		}
		System.out.println("Suma: "+ acumulado);
	}
}
