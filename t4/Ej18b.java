package t4;

public class Ej18b {
	public static void main(String[] args) {
		String[][] persona = {
				{ "1", "Pepe", "Sánchez" },	
				{ "2", "Ana", "García" },	
				{ "3", "Juan", "Palomo" }	
		};
		
		listar(persona);
	}
	
	public static void listar( String[][] persona) {
		for (int i=0;i<persona.length;i++) {
			System.out.println(persona[i][2] +  ", " + persona[i][1] +" ("+ persona[i][0] +")");
		}
	}
}
