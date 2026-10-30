package t3;

import java.util.Scanner;

public class Ej28 {
	
	public static int mcd(int x, int y) {
		while (y!=0) {
			int resto = x%y;
			x = y;
			y = resto;
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Introduce x: ");
		int x = scan.nextInt();

		System.out.println("Introduce y: ");
		int y = scan.nextInt();

		System.out.println("El máximo común divisor de " + x + " y " + y + " es " + mcd(x,y));
	}

}
