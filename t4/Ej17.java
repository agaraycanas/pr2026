package t4;

public class Ej17 {
	
	public static void main(String[] args) {
		final int tam = (int)Math.sqrt(args.length/2);
		int[][] a = new int[tam][tam];	
		int[][] b = new int[tam][tam];	
		
		rellenar(args,a,0);
		rellenar(args,b,tam*tam);
		
		System.out.println("Matriz A");
		mostrar(a);
		separador();

		System.out.println("Matriz B");
		mostrar(b);
		separador();
		
		System.out.println("Matriz A+B");
		mostrar(sumar(a,b));
		separador();

		System.out.println("Matriz A.B");
		mostrar(multiplicar(a,b));
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
	
	public static int[][] sumar(int[][] m1 , int[][] m2) {
		int filas 		= m1.length; // Hubiera valido m2.length
		int columnas 	= m1[0].length;
		int[][] solucion = new int[filas][columnas];
		for (int i=0;i<filas;i++) {
			for (int j=0;j<columnas;j++) {
				solucion[i][j] = m1[i][j] + m2[i][j]; 
			}
		}
		return solucion;
	}
	
	public static int[][] multiplicar(int[][] m1 , int[][] m2) {
		int filas 		= m2.length; // Hubiera valido m2.length
		int columnas 	= m2[0].length;
		int[][] solucion = new int[filas][columnas];
		for (int i=0;i<filas;i++) {
			for (int j=0;j<columnas;j++) {
				solucion[i][j] = 0;
				for ( int k=0; k<filas; k++) {
					solucion[i][j] += m1[i][k] * m2[k][j]; 
				}
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
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
