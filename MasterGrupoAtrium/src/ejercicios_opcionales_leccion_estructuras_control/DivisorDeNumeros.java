package ejercicios_opcionales_leccion_estructuras_control;

import java.util.Scanner;

public class DivisorDeNumeros {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("DIVISOR DE NUMEROS");
			
			System.out.print("Introduzca el dividendo: ");
			int dividend = sc.nextInt();
			
			System.out.print("Introduzca el divisor: ");
			int divisor = sc.nextInt();
			
			try {
				int quotient = dividend / divisor;
				int remainder = dividend % divisor;
				
				String message = remainder != 0 ? "La división no es exacta. Cociente: " + quotient + " Resto: " + remainder : "La división es exacta. Cociente: " + quotient;
				
				System.out.println(message);
			}
			catch (ArithmeticException e) {
				System.out.println("No se puede dividir por zero");
			}
		}
	}

}
