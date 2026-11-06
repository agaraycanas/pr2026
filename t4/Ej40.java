package t4;

public class Ej40 {
	public static void main(String[] args) {
		int anchura = Integer.parseInt(args[0]);
		
		for (int i=1;i<args.length;i++) {
			for (int k=0;k<anchura;k++) {
				int altura = Integer.parseInt( args[i] );
				for (int j=0;j< altura ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
