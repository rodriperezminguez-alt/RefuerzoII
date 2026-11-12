import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el número de compartimentos: ");
		int compartimentos = teclado.nextInt();
		System.out.println("Introduce la capacidad en litros del compartimento más grande: ");
		int maxLitros = teclado.nextInt();
		System.out.println("Introduce la diferencia en litros entre dos compartimentos adyacentes: ");
		int diferencia = teclado.nextInt();
		System.out.println("El número de litros necesarios para llenar el acuario es: " +litros(compartimentos, maxLitros, diferencia));
	}
	public static int litros(int compartimentos, int maxLitros, int diferencia) {
		int litrosTotales = 0;
		for (int i = 0; i < compartimentos; i++) {
			litrosTotales += maxLitros - (i * diferencia);
		}
		return litrosTotales;
	}
}
