package t4;

import java.util.Arrays;

public class Ej23 {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30};
		int[] b = { 40, 50 , 60, 70 , 80};
	
		mostrar(a);
		mostrar(b);
		mostrar(mezclar(a,b,"cremalleraA"));
	}
	
	//UML mezclar(a: int[], b: int[], modo: String):int[]
	public static int[] mezclar( int[] a, int[] b, String modo  ) {
		int pos = 0;
		int[] solucion = new int[ a.length + b.length ];
		
		if (modo.equals("delanteA")) {
			for (int i=0; i<a.length ; i++) {
				solucion[pos] = a[i];
				pos++;
			}
			for (int i=0; i<b.length ; i++) {
				solucion[pos] = b[i];
				pos++;
			}
		}

		if (modo.equals("delanteB")) {
			for (int i=0; i<b.length ; i++) {
				solucion[pos] = b[i];
				pos++;
			}
			for (int i=0; i<a.length ; i++) {
				solucion[pos] = a[i];
				pos++;
			}
		}
		
		if (modo.equals("cremalleraA")) {
			
		}
		return solucion;
	}
	
 	public static void mostrar(int[] m) {
		System.out.println(Arrays.toString(m));
	}
	
	
}
