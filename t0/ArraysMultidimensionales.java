package t0;

import java.util.Arrays;

public class ArraysMultidimensionales {
	public static void main(String[] args) {
		//int[][] a = { {10,20,30}, {40,50,60}, {0,0,0} };
		
		int[][] a;
		a = new int[3][3];
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;

		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;
		
		System.out.println(Arrays.toString(a[0]));
		System.out.println(Arrays.toString(a[1]));
		System.out.println(Arrays.toString(a[2]));
	}
}
