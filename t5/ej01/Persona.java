package t5.ej01;

public class Persona {
	String 	nombre;
	int 	edad;
	
	void saludar() {
		//System.out.println("HOLA"); // Ejercicios 1-4
		System.out.println("Hola, soy " +  this.nombre + " y tengo " +  this.edad + " años"); // Ejercicio 5
	}
	
	void despedirse() {
		System.out.println("ADIOS");
	}
}
