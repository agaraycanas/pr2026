package t4;

import java.util.Arrays;
import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] v1 = new int[2];
		int[] v2 = new int[2];

		System.out.print("Introduce x1: ");
		v1[0] = scan.nextInt();

		System.out.print("Introduce y1: ");
		v1[1] = scan.nextInt();

		System.out.print("Introduce x2: ");
		v2[0] = scan.nextInt();

		System.out.print("Introduce y2: ");
		v2[1] = scan.nextInt();

		System.out.println(Arrays.toString(v1) + " + " + Arrays.toString(v2) + " = " + Arrays.toString(sumar(v1,v2)));
		System.out.println(Arrays.toString(v1) + " . " + Arrays.toString(v2) + " = " + productoEscalar(v1,v2) );
		
		System.out.println("========================");
		
		System.out.println(convertirAString(v1) + " + " + convertirAString(v2) + " = " + convertirAString(sumar(v1,v2)));
		System.out.println(convertirAString(v1) + " . " + convertirAString(v2) + " = " + productoEscalar(v1,v2) );

	}

	public static int[] sumar(int[] v1, int[] v2) {
		int[] sumaFinal = new int[2];
		sumaFinal[0] = v1[0] + v2[0];
		sumaFinal[1] = v1[1] + v2[1];
		return sumaFinal;
	}
	
	public static int productoEscalar(int[] v1, int[] v2) {
		return v1[0]*v2[0] + v1[1]*v2[1];
	}
	
	public static String convertirAString(int[] a) {
		String cadenaADevolver = "(";
		for (int i = 0; i < a.length; i++) {
			cadenaADevolver = cadenaADevolver + a[i];
			if (i != a.length - 1) {
				cadenaADevolver = cadenaADevolver + ", ";
			}
		}
		cadenaADevolver = cadenaADevolver + ")";
		return cadenaADevolver;
	}
}
