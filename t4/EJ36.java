package t4;

public class EJ36 {
	public static void main(String[] args) {
		String x = args[0];
		int y = Integer.parseInt(args[1]);
		
		for (int numVeces=y; numVeces>0 ;numVeces = numVeces/2) {
			for (int i = 0; i < numVeces; i++) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}
}
