import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número entero no negativo:");
		String digitos = teclado.nextLine();
		System.out.println(sumaDigitos(digitos));

	}

	public static String sumaDigitos(String digitos) {

		int suma = 0;
		String resultado = "";
		for (int i = 0; i < digitos.length(); i++) {
			int numero = Integer.parseInt("" + digitos.charAt(i));
			suma = suma + numero;
			if (i > 0) {
				resultado = resultado + " + ";
			}
			resultado = resultado + numero;
		}
		resultado = resultado + " = " + suma;

		return resultado;
	}
}

