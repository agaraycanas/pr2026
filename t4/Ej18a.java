package t4;

public class Ej18a {
	public static void main(String[] args) {
		String[] dni= {"1","2","3"};
		String[] nombre = {"Pepe", "Ana", "Juan"};
		String[] apellido = {"Sánchez","García","Palomo"};
		
		listar(dni,nombre,apellido);
	}
	
	public static void listar( String[] dni, String[] nombre, String[] apellido ) {
		for (int i=0;i<dni.length;i++) {
			System.out.println(apellido[i] +  ", " + nombre[i] +" ("+ dni[i] +")");
		}
	}
}
