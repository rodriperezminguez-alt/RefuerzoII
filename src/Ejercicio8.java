import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuántos números quieres introducir?");
		int cantidad = teclado.nextInt();
		int[] numeros = new int[cantidad];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el número " + (i + 1) + ":");
			numeros[i] = teclado.nextInt();
		}
		System.out.println("El número que falta es: " + cualFalta(numeros));
	}
	public static int cualFalta(int[] numeros) {
		int max = numeros[0];
		int min = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > max) {
				max = numeros[i];
			}
			if (numeros[i] < min) {
				min = numeros[i];
			}
		}
		for (int i = min; i <= max; i++) {
			boolean encontrado = false;
			for (int j = 0; j < numeros.length; j++) {
				if (numeros[j] == i) {
					encontrado = true;
					break;
				}
			}
			if (!encontrado) {
				return i;
			}
		}
		return -1;
	}

}
