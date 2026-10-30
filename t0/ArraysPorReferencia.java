package t0;

import java.util.Arrays;

public class ArraysPorReferencia {
	
	public static void m(int[] x) {
		System.out.println(".........");
		x[0] = x[0] + 25;
		System.out.println("a: " + Arrays.toString(x));
		System.out.println(".........");
	}

	public static void main(String[] args) {
		System.out.println("INI");
		int[] a =  { 10 };
		System.out.println("a: " + Arrays.toString(a));
		m(a);
		System.out.println("a: " + Arrays.toString(a));
		System.out.println("FIN");
	}
}
