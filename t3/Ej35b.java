package t3;

public class Ej35b {

	public static void sinFor() {
		int i = 10;
		int j = 20;
		while (j > i) {
			int k = i + 1;
			i = i * 2;
			System.out.println(i + "," + j + "," + k);
			j = j - 1;
		}
	}

	public static void conFor() {
		for (int i =10, j = 20; j>i ; j = j-1) {
			int k = i + 1;
			i = i * 2;
			System.out.println(i + "," + j + "," + k);
		}
	}

	public static void main(String[] args) {
		sinFor();
		System.out.println("==========");
		conFor();
	}
}
