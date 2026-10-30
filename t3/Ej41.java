package t3;

import java.util.Scanner;

public class Ej41 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Introduce a: ");
		int a = scan.nextInt();
		
		System.out.print("Introduce m: ");
		int m = scan.nextInt();
		
		for (int k=1;k<=m;k++) {
			for (int i = 1; i < a; i++) {
				//System.out.print(i + " ");
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int i = a; i >= 1; i--) {
				//System.out.print(i + " ");
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
