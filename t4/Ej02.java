package t4;

import java.util.Scanner;

public class Ej02 {
	
	public static void mostrarArray(int[] a) {
		for (int i = 0; i<a.length && a[i] != 0; i++) {
			System.out.print(a[i] + ", ");
		}
	}

	public static void rellenarArray(int[] a) {
		Scanner scan = new Scanner(System.in);
		int n;
		int i = 0;
		do {
			System.out.print("Introduce un número entero: ");
			n = scan.nextInt();
			a[i] = n;
			i++;
		} while (i<a.length && n != 0);
	}

	public static int maximoArray(int[] a) {
		int maximoProvisional = a[0];
		for (int i = 1; i<a.length && a[i] != 0; i++) {
			if (a[i] > maximoProvisional) {
				maximoProvisional = a[i];
			}
		}
		return maximoProvisional;
	}

	public static int minimoArray(int[] a) {
		int minimoProvisional = a[0];
		for (int i = 1; i<a.length && a[i] != 0; i++) {
			if (a[i] < minimoProvisional) {
				minimoProvisional = a[i];
			}
		}
		return minimoProvisional;
	}

	public static float mediaArray(int[] a) {
		int sumaParcial = 0;
		int contadorElementosUtiles = 0;
		for (int i=0; i<a.length && a[i]!=0 ; i++) {
			sumaParcial = sumaParcial + a[i];
			contadorElementosUtiles = contadorElementosUtiles + 1;
		}
		return contadorElementosUtiles != 0 ? (float)sumaParcial / contadorElementosUtiles : 0 ;
	}
	

	public static void main(String[] args) {
		final int tamanyo = 5;
		int[] a = new int[tamanyo];
		rellenarArray(a);
		mostrarArray(a);
		System.out.println("\n===============");
		System.out.println("Máximo: " + maximoArray(a));
		System.out.println("Mínimo: " + minimoArray(a));
		System.out.println("Media: " + mediaArray(a));

	}

}
