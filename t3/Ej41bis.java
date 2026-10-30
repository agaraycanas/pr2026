package t3;

import java.util.Scanner;

public class Ej41bis {
	
	public static void horizontal(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void rampaAscendente(int n) {
		for (int i=1;i<=n;i++) {
			horizontal(i);
		}
	}
	
	public static void rampaDescendente(int n) {
		for (int i=n;i>=1;i--) {
			horizontal(i);
		}
	}
	
	public static void montana(int n) {
		rampaAscendente(n);
		rampaDescendente(n-1);
	}

	public static void cordillera(int m, int a) {
		for (int i=0;i<m;i++) {
			montana(a);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce m: ");
		int m = scan.nextInt();

		System.out.print("Introduce a: ");
		int a = scan.nextInt();
		
		cordillera(m,a);
		
		scan.close();
	}

}
