import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de números que quieres introducir: ");
		int cantidad = sc.nextInt();
		int[] numeros = new int[cantidad];
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Introduce el número " + (i + 1) + ": ");
			numeros[i] = sc.nextInt();
		}
		System.out.println(orden(numeros));
	}

	public static String orden(int[] numeros) {
		int ascendente = 0;
		int descendente = 0;
		int iguales = 0;
		for (int i = 0; i < numeros.length - 1; i++) {
			if (numeros[i] < numeros[i + 1]) {
				ascendente++;
			} else if (numeros[i] > numeros[i + 1]) {
				descendente++;
			} else {
				iguales++;
			}
		}
		if (ascendente == numeros.length - 1) {
			return "Ascendente";
		} else if (descendente == numeros.length - 1) {
			return "Descendente";
		} else if (iguales == numeros.length - 1) {
			return "Iguales";
		} else {
			return "Desordenado";
		}
	}
}




