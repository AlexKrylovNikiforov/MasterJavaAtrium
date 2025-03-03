package ejercicios_propuestos_leccion_estructuras_control_if_else;

import java.util.Scanner;

public class EjercicioQuintoSolucion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor introdusca un número: ");
		
		int number = sc.nextInt();
		
		String answer = "";
		
		if (number % 2 == 0 && number %3 == 0) {
			answer = "Este número es par y múltiplo de 3";
		} 
		else if (number % 2 == 0 && number % 3 != 0) {
			answer = "No es múltiplo de 3 pero es par";
		}
		else if (number % 2 != 0 && number %3 == 0) {
			answer = "Este número es impar y múltiplo de 3";
		}
		else {
			answer = "Este número no es par ni es múltiplo de 3";
		}
		
		System.out.println(answer);
		
		sc.close();

	}

}
