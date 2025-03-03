package ejercicios_propuestos_leccion_estructuras_control_if_else;

import java.util.Scanner;

public class EjercicioSegundoSolucion {
	
	private static String checkNumbers(int number1, int number2) {
		
		String result;
		
		if(number1 == number2) {
			result = "Los números introducidos son iguales";
		}
		else {
			result = number1 > number2 ? "El primer número es mayor que el segundo" : "El segundo número es mayor que el primero";
		}
		
		return result;
	}
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el primer número: ");
		
		int number1 = sc.nextInt();
		
		System.out.println("Introduzca el segundo número: ");
		
		int number2 = sc.nextInt();
		
		System.out.print(checkNumbers(number1, number2));
		
		sc.close();
		
	}

}
