package t3;

public class Ej35c {

	public static void sinFor() {
		boolean amor = true;
		int i = 1;
		while (amor || i <= 4) {
			if (amor) {
				System.out.println("Me quiere");
			} else {
				System.out.println("NO Me quiere");
			}
			amor = !amor;
			i++;
		}

	}

	public static void conFor() {
		boolean amor;
		int i;
		for ( amor = true, i=1 ; amor || i <= 4 ; amor = !amor , i++ ) {
			if (amor) {
				System.out.println("Me quiere");
			} else {
				System.out.println("NO Me quiere");
			}
		}
	}

	public static void main(String[] args) {
		sinFor();
		System.out.println("==========");
		conFor();
	}
}
