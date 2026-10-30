package t4.extra;

public class Ej01 {

	/**
	 * Mostrar todos los datos de los argumentos de entrada precedidos por la
	 * palabra "Argumento <N>" donde N empieza valiendo 1 Y se va incrementando para
	 * cada argumento Ignorar las veces que aparezca el String "tonto"
	 * 
	 * PISTA 1) Mostrar primero todos los argumentos de entrada. Uno por cada linea
	 * 2) Poner por delante de todas esas lineas el String "Argumento <N>:
	 * <argumento>" 3) Eliminar las lineas donde aparezca la palabra "tonto". Tener
	 * cuidado con el conteo de lineas
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int contador = 1;
		for (int i = 0; i < args.length; i++) {
			if (!args[i].equals("tonto")) {
				System.out.println("Argumento " + contador + ": " + args[i]);
				contador ++;
			}
		}
	}

}
