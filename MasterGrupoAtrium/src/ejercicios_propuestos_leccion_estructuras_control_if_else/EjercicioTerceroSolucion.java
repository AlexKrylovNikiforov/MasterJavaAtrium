package ejercicios_propuestos_leccion_estructuras_control_if_else;

import java.util.Scanner;

public class EjercicioTerceroSolucion {
	
	private static String checkNumbers(int[] numbers) {
		
		String result ="El mayor número es el número " + Math.max(numbers[0], Math.max(numbers[1], numbers[2]));
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca tres números seguidos: ");
		
		int[] numbers = new int[3];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		
		sc.close();

		System.out.println(checkNumbers(numbers));
	}

}
