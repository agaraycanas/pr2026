package t4;

public class Ej06 {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int n = 3;
		for (int i = 0; i < a.length; i += n) {
			System.out.print(a[i] + " ");
		}
	}
}
