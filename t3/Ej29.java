package t3;

import java.util.Scanner;

public class Ej29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce n (>3): ");
		int n = scan.nextInt();
		int a = 0;
		int b = 1;
		
		System.out.print("0 1 ");
		
		for (int i=3; i<=n;i++) {
			System.out.print( (a+b) + " ");
			int bAux = b;
			b = a+b;
			a = bAux;
		}
	}

}
