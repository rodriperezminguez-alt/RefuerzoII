import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el dividendo: ");
		int dividendo = teclado.nextInt();
		System.out.println("Introduce el divisor: ");
		int divisor = teclado.nextInt();
		System.out.println("El resultado de dividir " + dividendo + "! entre " + divisor + "! es: " + dividirFactoriales(dividendo, divisor));
	}
	public static int dividirFactoriales(int dividendo, int divisor) {
		if (dividendo == divisor) {
			return 1;
		}
		if (dividendo < divisor) {
			return 0;
		}
		int resultado = 1;
		for (int i = divisor + 1; i <= dividendo; i++) {
			resultado *= i;
		}
		return resultado;
	}
}
