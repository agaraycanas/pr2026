package t3;

import java.util.Scanner;

public class Ej21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce n: ");
		int n=scan.nextInt();
		int contador = 0;
		
		while (n!=0) {
			contador++;
			//System.out.print(n%10);
			n = n / 10;
		}
		if (n==0) {
			contador++;
		}
		System.out.println("Número de cifras: " +  contador);
	}

}
