package t3;

public class Ej35a {
	
	public static void sinFor() {
		int i = 10;
		while (i > 0) {
			System.out.println(i);
			i = i - 2;
		}
	}
	
	public static void conFor() {
		for ( int i = 10 ; i > 0 ; i = i - 2 ) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		sinFor();
		System.out.println("==========");
		conFor();
	}
}
