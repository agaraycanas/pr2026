package t0;

public class ArrayBidimensionalEjemplo {
	public static void main(String[] args) {
		
		
		int[][] a = { // rellenar1
				{10,20},
				{30,40},
				{50,60}
		};
		
		/*
		int[][] a = { // rellenar2
				{10,20,30},
				{40,50,60}
		};
		*/
		/*
		int[][] a = new int[3][2];
		rellenar1(a);
		*/
		/*
		int[][] a = new int[2][3];
		rellenar2(a);
		*/
		mostrar(a);
	}

	public static void mostrar(int[][] a) {
		int filas = a.length;
		int columnas = a[0].length;
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void rellenar1(int[][] a) {
		a[0][0] = 10;		a[0][1] = 20;
		a[1][0] = 30;		a[1][1] = 40;
		a[2][0] = 50;		a[2][1] = 60;
	}
	
	public static void rellenar2(int[][] a) {
		a[0][0] = 10;		a[0][1] = 20;		a[0][2] = 30;
		a[1][0] = 40;		a[1][1] = 50;		a[1][2] = 60;
	}
}
