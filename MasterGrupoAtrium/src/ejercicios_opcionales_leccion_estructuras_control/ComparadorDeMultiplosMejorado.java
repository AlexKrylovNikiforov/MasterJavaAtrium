package ejercicios_opcionales_leccion_estructuras_control;

import java.util.Scanner;

public class ComparadorDeMultiplosMejorado {

	public static void main(String[] args) {
		
		System.out.println("COMPARADOR DE MÚLTIPLOS");
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("Introduzca primer número: ");
			int firstNumber = sc.nextInt();
			
			System.out.print("Introduzca segundo número: ");
			int secondNumber = sc.nextInt();
			
			if(firstNumber < 0 || secondNumber < 0) {
				System.out.println("Lo siento, este programa no admite valores negativos.");
			}
			else if (firstNumber == 0 || secondNumber == 0) {
				System.out.println("Lo siento, este programa no admite valores nulos.");
			}
			else {
				int biggerNumber = Math.max(firstNumber, secondNumber);
				
				int smallerNumber = Math.min(secondNumber, biggerNumber);
				
				if(biggerNumber % smallerNumber == 0) {
					System.out.println(biggerNumber + " es múltiplo de " + smallerNumber);
				}
				else {
					System.out.println(biggerNumber + " no es múltiplo de " + smallerNumber);
				}
			}
		}
	}
}
