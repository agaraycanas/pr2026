package t4;

public class Ej37 {
	public static void main(String[] args) {
		int tam = Integer.parseInt( args[0] );
		int[] a = new int[tam];
		int[] b = new int[tam];
		int[] suma = new int[tam];
		int pos = 1;
		for ( int i=0;i<tam ; i++) {
			a[i] = Integer.parseInt(  args[pos] );
			pos++;
		}
		for ( int i=0;i<tam ; i++) {
			b[i] = Integer.parseInt(  args[pos] );
			pos++;
		}
		for (int i=0;i<tam;i++) {
			suma[i] = a[i] + b[i];
		}

		mostrar(a);
		mostrar(b);
		mostrar(suma);
	}
	
	public static void mostrar(int[] x) {
		for (int i=0;i<x.length;i++) {
			System.out.print( x[i] + "\t");
		}
		System.out.println();
	}
}
