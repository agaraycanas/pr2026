package t4;

public class Ej19 {
	public static void main(String[] args) {
		String[][] persona = {
				{ "1", "Pepe", "Sánchez" },	
				{ "2", "Ana", "García" },	
				{ "3", "Juan", "Palomo" }	
		};
		
		listar(persona);
		separador();
		listarNombres(persona);
	}
	
	public static void separador() {
		System.out.println("========================");
	}
	
	public static void listar( String[][] persona) {
		for (int i=0;i<persona.length;i++) {
			System.out.println(persona[i][2] +  ", " + persona[i][1] +" ("+ persona[i][0] +")");
		}
	}
	
	public static void listarNombres( String[][] persona) {
		for (int i=0;i<persona.length;i++) {
			System.out.println(persona[i][1]);
		}
	}
}
