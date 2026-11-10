import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el día: ");
		int dia = sc.nextInt();
		System.out.println("Introduce el mes: ");
		int mes = sc.nextInt();
		int diasFaltantes = 0;
		System.out.println("Faltan " + diasHastaNochevieja(dia, mes) + " días para Nochevieja.");
	}

	public static int diasHastaNochevieja(int dia, int mes) {
		int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int diasTranscurridos = 0;
		for (int i = 0; i < mes - 1; i++) {
			diasTranscurridos += diasPorMes[i];
		}
		diasTranscurridos += dia;
		return 365 - diasTranscurridos;
	}
}
