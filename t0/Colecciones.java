package t0;

import java.util.Arrays;

public class Colecciones {
	public static void main(String[] args) {
		int a[] = new int[2];
		int n = 10;
		
		for (int i=0;i < a.length ; i++) {
			a[i] = n;
			n = n + 10;
		}
		
		System.out.println(Arrays.toString(a));
		

	}
}
