
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuántos números quieres introducir?");
		int cantidad = teclado.nextInt();
		int[] numeros = new int[cantidad];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el número " + (i + 1) + ":");
			numeros[i] = teclado.nextInt();
		}
		System.out.println("La mediana es: " + mediana(numeros));
	}
	public static double mediana(int numeros[]) {

		Arrays.sort(numeros);
		int posicion = numeros.length / 2;
		if (numeros.length % 2 == 0) {
			return (numeros[posicion - 1] + numeros[posicion]) / 2.0;

		} else {
			return numeros[posicion];

		}
	}


}
