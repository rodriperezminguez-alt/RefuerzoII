import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el canal desde el que quieres ir:");
		int desde = teclado.nextInt();
		System.out.println("Introduce el canal al que quieres ir:");
		int hasta = teclado.nextInt();
		System.out.println("El número de veces que tienes que avanzar o retroceder de canal es: " + canales(desde, hasta));
	}
	public static int canales(int desde, int hasta){
		int avanzar = 0;
		int retroceder = 0;
		if (desde < hasta) {
			avanzar = hasta - desde;
			retroceder = desde + (100 - hasta);
		} else if (desde > hasta) {
			avanzar = (100 - desde) + hasta;
			retroceder = desde - hasta;
		} else {
			return 0;
		}
		if (avanzar < retroceder) {
			return avanzar;
		} else {
			return retroceder;
		}
	}
}
