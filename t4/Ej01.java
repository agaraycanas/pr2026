package t4;

import java.util.Arrays;
import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int[] a = new int[30];
		int i = 0;
		do {
			System.out.print("Introduce un número entero: ");
			n = scan.nextInt();
			a[i] = n;
			i++;
		} while (n != 0);
		
		System.out.println("i: " + i);
		int limite = i-1;
		
		System.out.println("Contenido total");
		System.out.println(Arrays.toString(a));
		System.out.println("=================");

		System.out.println("Contenido útil (I)");
		for (i = 0; a[i] != 0; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println("\n=================\n");

		
		System.out.println("Contenido útil (II)");
		for (i = 0; i < limite; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println("\n=================\n");
	}

}
