package t3;

import java.util.Scanner;

public class Ej40 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce n: ");
		int n = scan.nextInt();
		for (int i = 1; i < n; i++) {
			//System.out.print(i + " ");
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n; i >= 1; i--) {
			//System.out.print(i + " ");
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
