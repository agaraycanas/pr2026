package t4;

public class Calculadora {
	public static void main(String[] args) {
		String operacion = args[0];
		int op1 = Integer.parseInt(args[1]);
		int op2 = Integer.parseInt(args[2]);
		float resultado = 0;

		System.out.println("Simulador de calculadora");
		System.out.println(operacion + " (" + op1 + ", " + op2 + ")");

		switch (operacion) {
		case "suma" -> resultado = op1 + op2;
		case "resta" -> resultado = op1 - op2;
		case "mul" -> resultado = op1 * op2;
		case "div" -> resultado = (float)op1 / op2;
		}

		System.out.println(op1 + " " + simbolo(operacion) + " " + op2 + " = " + resultado);
	}

	public static String simbolo(String operacion) {
		String resultado = "";
		switch (operacion) {
		case "suma" -> resultado = "+";
		case "resta" -> resultado = "-";
		case "mul" -> resultado = "X";
		case "div" -> resultado = "/";
		}
		return resultado;
	}
}
