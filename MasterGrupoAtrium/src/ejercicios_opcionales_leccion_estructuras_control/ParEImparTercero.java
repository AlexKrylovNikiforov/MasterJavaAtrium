package ejercicios_opcionales_leccion_estructuras_control;

import java.util.Scanner;

public class ParEImparTercero {

	public static void main(String[] args) {
		
		System.out.println("PAR E IMPAR (3)");
		
		try (Scanner sc = new Scanner(System.in)) {
				
			System.out.print("Escriba un número par (positivo o negativo): ");
				
			int firstNumber = sc.nextInt();
			
			System.out.print("Escriba un número impar (positivo o negativo): ");
			
			int secondNumber = sc.nextInt();
			
			if(firstNumber%2 != 0) {
				System.out.println("No ha introducido un número par");
			}
			if(secondNumber%2 == 0) {
				System.out.println("No ha introducido un número impar");
			}
			
			if(firstNumber%2 == 0 && secondNumber%2 != 0) {
				System.out.println("¡Gracias por su colaboración!");
			}
			
			else {
				System.out.println("Ejecute de nuevo el programa para volver a intentarlo.");
			}
		}
	}
}
