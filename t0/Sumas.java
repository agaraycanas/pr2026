package t0;

import java.util.Scanner;

public class Sumas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int v1;
		int v2;
		int suma = 0;

		System.out.print("Introduce x1: ");
		v1 = scan.nextInt();

		System.out.print("Introduce x1: ");
		v2 = scan.nextInt();
		
		System.out.println( v1 + " + " + v2 + " = " + sumar(v1,v2));
	}
	
	public static int sumar(int v1,int v2) {
		return v1+v2;
	}

}
