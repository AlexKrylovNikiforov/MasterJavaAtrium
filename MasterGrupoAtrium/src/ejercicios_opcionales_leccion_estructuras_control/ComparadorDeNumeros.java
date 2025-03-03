package ejercicios_opcionales_leccion_estructuras_control;

import java.util.Locale;
import java.util.Scanner;

public class ComparadorDeNumeros {

	public static void main(String[] args) {
		
		System.out.println("COMPARADOR DE NUMEROS");
		
		try (Scanner sc = new Scanner(System.in)) {
			
			sc.useLocale(Locale.US);
			
			System.out.print("Introduzca primer número: ");
			
			double firstNumber = sc.nextDouble();
			
			System.out.print("Introduzca segundo número: ");
			
			double secondNumber = sc.nextDouble();
			
			if(firstNumber != secondNumber) {
				System.out.println("Menor: " + Math.min(firstNumber, secondNumber) + "; " 
						+ "Mayor: " + Math.max(firstNumber, secondNumber));
			}
			else {
				System.out.println("Los dos números son iguales");
			}
		}
	}
}
