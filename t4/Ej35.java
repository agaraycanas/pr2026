package t4;

public class Ej35 {
	public static void main(String[] args) {
		int x = Integer.parseInt( args[0] );
		int y = Integer.parseInt( args[1] );
		
		int[] a = new int[x];
		
		for (int i=0;i<a.length;i++) {
			a[i] = y;
		}
		mostrar(a);
	}
	
	public static void mostrar(int[] m) {
		for (int i=0;i<m.length;i++) {
			System.out.print( m[i] + " ");
		}
		System.out.println();
	}
}
