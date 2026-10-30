package t3;

import java.util.Scanner;

public class Ej20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce n: ");
		int n=scan.nextInt();
		System.out.println( n +  " <==> " + reves(n) );
		
	}
	
	public static int reves(int n) {
		int alReves = 0;
		while (n!=0) {
			//System.out.print(n%10);
			alReves = alReves*10 + n%10; 
			n = n / 10;
		}
		return alReves;
	}
}
