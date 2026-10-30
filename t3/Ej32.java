package t3;

import java.util.Scanner;

public class Ej32 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce n: ");
		int n = scan.nextInt();
		int xAnterior = 1;
		System.out.print(xAnterior + " ");
		
		for (int i=2; i<=n; i++) {
			int xActual = xAnterior * 3;
			System.out.print(xActual + " ");
			xAnterior = xActual;
		}
	}
}
