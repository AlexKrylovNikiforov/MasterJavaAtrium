package ejercicios_propuestos_leccion_estructuras_control_if_else;

import java.util.Scanner;

public class EjercicioPrimeroSolucion {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Intorduce un numero: ");
			
			int number = sc.nextInt();
			
			if(number == 0) {
				System.out.println("El número introducido debe ser distinto a zero");
				continue;
			}
			
			String result = (number % 2 == 0) ? "Este número es par" : "Este número es impar";
			
			System.out.print(result);
			
			break;
			
		}
		
		sc.close();
		
	}

}
