package t3;

import java.util.Scanner;

public class Ej42 {
	
	public static void horizontalAhuecada(int h, int a) {
		for (int i=1;i<=h;i++) {
			System.out.print(" ");
		}
		for (int i=1;i<=a;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void rampaAscendenteAhuecada(int n) {
		for (int i=1;i<=n;i++) {
			//System.out.println(i);
			horizontalAhuecada(n-i, i);
		}
	}
	
	public static void rampaDescendenteAhuecada(int n) {
		for (int i=n;i>=1;i--) {
			//System.out.println(i);
			horizontalAhuecada(n-i, i);
		}
	}
	
	public static void montanaAhuecada(int n) {
		rampaAscendenteAhuecada(n);
		rampaDescendenteAhuecada(n);
	}
	
	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce n: ");
		int n = scan.nextInt();
	*/
		System.out.println("12345678901234567890");
		System.out.println("--------------------");
		montanaAhuecada(7);
		
		//scan.close();
	}

}
