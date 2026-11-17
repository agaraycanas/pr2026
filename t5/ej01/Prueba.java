package t5.ej01;

public class Prueba {
	public static void main(String[] args) {
		System.out.println("========== Ejercicio 2 ===========");
		Persona pepe;
		pepe = new Persona();
		pepe.saludar();
		pepe.despedirse();
		
		System.out.println("========== Ejercicio 3 ===========");
		System.out.println( pepe.nombre );
		System.out.println( pepe.edad );
		
		System.out.println("========== Ejercicio 4 ===========");
		pepe.nombre = "Pepe";
		pepe.edad= 20;
		System.out.println( pepe.nombre );
		System.out.println( pepe.edad );
		
		System.out.println("========== Ejercicio 5 ===========");
		pepe.saludar();
		pepe.despedirse();

		System.out.println("========== Ejercicio 6 ===========");
		Persona ana;
		ana = new Persona();
		ana.nombre = "Ana";
		ana.edad= 18;
		pepe.saludar();
		ana.saludar();
		pepe.despedirse();
		ana.despedirse();

		System.out.println("========== Ejercicio 7 ===========");
		Persona aux = pepe;
		aux.saludar();

		System.out.println("========== Ejercicio 8 ===========");
		ana = aux;
		ana.saludar();

	}
}
