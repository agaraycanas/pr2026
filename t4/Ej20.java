package t4;

public class Ej20 {
	public static void main(String[] args) {
		String[][] persona = { { "1", "Pepe", "Sánchez" }, { "2", "Ana", "García" }, { "3", "Juan", "Palomo" } };

		listar(persona);
		separador();
		listarNombres(persona);
		separador();
		listarColumna(persona, "todo");
	}

	public static void separador() {
		System.out.println("========================");
	}

	public static void listar(String[][] persona) {
		for (int i = 0; i < persona.length; i++) {
			System.out.println(persona[i][2] + ", " + persona[i][1] + " (" + persona[i][0] + ")");
		}
	}

	public static void listarNombres(String[][] persona) {
		for (int i = 0; i < persona.length; i++) {
			System.out.println(persona[i][1]);
		}
	}

	public static void listarColumna(String[][] persona, String columna) {
		for (int i = 0; i < persona.length; i++) {
			System.out.println(
					( columna.equals("dni") || columna.equals("todo") ? persona[i][0] + " " : "" ) + 
					( columna.equals("nombre") || columna.equals("todo") ? persona[i][1] + " " : "" ) + 
					( columna.equals("apellido") || columna.equals("todo") ? persona[i][2] : "" ) 
			);
		}

	}
}
