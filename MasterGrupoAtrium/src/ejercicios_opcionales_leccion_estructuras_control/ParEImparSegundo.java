package ejercicios_opcionales_leccion_estructuras_control;

import java.util.Scanner;

public class ParEImparSegundo {

	public static void main(String[] args) {
		System.out.println("PAR E IMPAR (2)");
			
		try (Scanner sc = new Scanner(System.in)) {
				
			System.out.print("Escriba un número par (positivo o negativo): ");
				
			int firstNumber = sc.nextInt();
			
			if(firstNumber%2 != 0) {
				System.out.println("No ha introducido un número par" 
						+ "\n" 
						+ "Ejecute de nuevo el programa para volver a intentarlo.");
			}
			
			else {
			
				System.out.print("Escriba un número impar (positivo o negativo): ");
			
				int secondNumber = sc.nextInt();
							
				if(secondNumber%2 == 0) {
					System.out.println("No ha introducido un número impar" 
							+ "\n" 
							+ "Ejecute de nuevo el programa para volver a intentarlo.");
				}
				else {
					System.out.println("¡Gracias por su colaboración!");
				}
			}
		}
	}
}
