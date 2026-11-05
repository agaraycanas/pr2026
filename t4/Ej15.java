package t4;

public class Ej15 {

	public static void main(String[] args) {
		final int tam = 3;
		int[][] a = new int[tam][tam];
		rellenar(args,a,0);
		mostrar(a);
		separador();
	}
	
	public static void rellenar(String[] args,int[][] a,int pos) {
		int k=pos;
		int tam=a.length;
		for (int i=0;i<tam;i++) {
			for (int j=0;j<tam;j++) {
				a[i][j] = Integer.parseInt( args[k] );
				k++;
			}
		}
	}
	
	public static void separador() {
		System.out.println("==================");
	}
	
	public static void mostrar(int[][] m) {
		int filas = m.length;
		int columnas = m[0].length;
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

}
