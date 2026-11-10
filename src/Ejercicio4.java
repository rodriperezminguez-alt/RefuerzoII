import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Cuántos números quieres introducir?");
		int cantidad = teclado.nextInt();

		int[] numeros = new int[cantidad];

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Introduce el número " + (i + 1) + ":");
			numeros[i] = teclado.nextInt();
		}
		System.out.println("La moda es: " + moda(numeros));
	}
			public static int moda(int[] numeros) {
				int moda = numeros[0];
				int maxRepeticiones = 0;
				for (int i = 0; i < numeros.length; i++) {
					int contador = 0;
					for (int j = 0; j < numeros.length; j++) {
						if (numeros[i] == numeros[j]) {
							contador++;
						}
					}
					if (contador > maxRepeticiones) {
						maxRepeticiones = contador;
						moda = numeros[i];
					}
				}

				return moda;
			}

	}

