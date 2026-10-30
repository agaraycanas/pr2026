package t0;

import java.util.Arrays;

public class ArraysString {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40 , 50 , 60 };
		System.out.println(convertirAString(a));
	}

	public static String convertirAString(int[] a) {
		String cadenaADevolver = "( ";
		for (int i = 0; i < a.length; i++) {
			cadenaADevolver = cadenaADevolver + a[i];
			if (i != a.length - 1) {
				cadenaADevolver = cadenaADevolver + ", ";
			}
		}
		cadenaADevolver = cadenaADevolver + " )";
		return cadenaADevolver;
	}
}
