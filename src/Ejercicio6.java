import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número entero no negativo:");
		int numero = teclado.nextInt();
		System.out.println(esHyperpar(numero));
	}
	public static boolean esHyperpar(int num) {
		String numero = Integer.toString(num);
		for (int i = 0; i < numero.length(); i++) {
			int digito = Integer.parseInt("" + numero.charAt(i));
			if (digito % 2 != 0) {
				return false;
			}
		}
		return true;
	}
}
