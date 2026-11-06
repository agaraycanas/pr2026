package t4;

public class Ej39 {

	public static void main(String[] args) {
		for (int i=0;i<args.length;i++) {
			int altura = Integer.parseInt(args[i]);
			System.out.println("|");
			for (int j=0;j<altura;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("|");
	}

}
