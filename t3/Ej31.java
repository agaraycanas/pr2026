package t3;

import java.util.Scanner;

public class Ej31 {
	
	public static long combinacionesConRepeticion(int n, int k) {
		return combinaciones(n+k-1, k);
	}
	
	public static long combinaciones(int n, int k) {
		// Renombrar k y n-k por kMayor y kMenor
		int kMayor = k;
		int kMenor = n-k;
		
		// Intercambiar kMayor y kMenor si fuera necesario
		if (kMayor < kMenor) {
			int aux = kMayor;
			kMayor = kMenor;
			kMenor = aux;
		}
		
		long numerador = 1;
		for (int i=(kMayor+1);i<=n;i++) {
			numerador = numerador * i;
		}
		
		return numerador  / factorial(kMenor);
	}
	
	public static long variacionesConRepeticion(int n, int k) {
		long resultado = 1;
		for (int i=1;i<=k;i++) {
			resultado = resultado * n;
		}
		return resultado;
	}
	
	public static long variaciones(int n, int k) {
		long resultado = 1;
		for (int i=(n-k+1) ; i<=n; i++) {
			resultado = resultado * i;
		}
		return resultado;
	}
	
	public static long factorial(int n) {
		long resultado = 1;
		for (int i=1 ; i<=n; i++) {
			resultado = resultado * i;
		}
		return resultado;
	}
	
	public static long combinatorioIneficiente(int n, int k) {
		long resultado = factorial(n) / ( factorial(k) * factorial(n-k)) ;
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce n: ");
		int n = scan.nextInt();

		System.out.println("Introduce k: ");
		int k = scan.nextInt();
		
		System.out.println("¿Importa el orden (s/n)?: ");
		String orden = scan.next();
		
		System.out.println("¿Se pueden repetir los elementos (s/n)?: ");
		String repetir = scan.next();
		
		long resultado;
		
		if (orden.equals("s") ) { // V ó VR
			if (repetir.equals("s")) { //VR
				resultado = variacionesConRepeticion(n, k);
			}
			else { // V
				resultado = variaciones(n, k);
			}
		}
		else { // C ó CR
			if (repetir.equals("s")) { //CR
				resultado = combinacionesConRepeticion(n, k);
			}
			else { // C
				resultado = combinaciones(n, k);
			}
		}
		System.out.println("Resultado = " + resultado);
	}
}
