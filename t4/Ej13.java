package t4;

public class Ej13 {
	public static void main(String[] args) {
		int[][] a = {
				{ 1, 2, 0},	
				{ 3, 4, 0},	
				{ 3, 4, 0},	
		};
		int[][] b = {
				{ 5, 6, 0},	
				{ 7, 8, 0},	
				{ 7, 8, 0}	
		};
		
		System.out.println("Matriz A");
		mostrar(a);
		separador();

		System.out.println("Matriz B");
		mostrar(b);
		separador();
		
		System.out.println("Matriz A+B");
		mostrar(sumar(a,b));
		separador();
	}
	
	public static int[][] sumar(int[][] m1 , int[][] m2) {
		int filas = m1.length; // Hubiera valido m2.length
		int columnas = m1[0].length;
		int[][] solucion = new int[filas][columnas];
		for (int i=0;i<filas;i++) {
			for (int j=0;j<columnas;j++) {
				solucion[i][j] = m1[i][j] + m2[i][j]; 
			}
		}
		return solucion;
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
