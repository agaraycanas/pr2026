package t4;

public class Ej07 {
	public static void main(String[] args) {
		int n = Integer.parseInt ( args[0] );
		for (int i = 1; i < args.length; i += n) {
			System.out.print(args[i] + " ");
		}
	}
}
