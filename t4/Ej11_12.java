package t4;

import java.util.Arrays;

public class Ej11_12 {
	public static void main(String[] args) {
		int[] a = { 60, 50, 40, 30, 20, 10 };
		System.out.println(Arrays.toString(a));
		System.out.println();
		burbuja(a);
		System.out.println(Arrays.toString(a));
		int[][] m4 = { {1,2}, {-1,-2,-3}, {100} };
	}

	public static void burbuja(int[] a) {
		int tope = a.length - 2;
		for (int t = 0; tope - t >= 0; t++) {
			for (int i = 0; i <= (tope - t); i++) {
				if (a[i] > a[i + 1]) {
					swap(a, i, i + 1);
				}
			}
			System.out.println(Arrays.toString(a));
			System.out.println("Tope: " + tope + ", t:" + t + " tope-t: " + (tope - t));
			System.out.println();
		}
	}

	public static void swap(int[] a, int p1, int p2) {
		int aux = a[p1];
		a[p1] = a[p2];
		a[p2] = aux;
	}
}
