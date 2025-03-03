package ejercicios_opcionales_leccion_estructuras_control;

import java.util.Scanner;

public class ComprobadorDeBisiestos {

	public static void main(String[] args) {
		
		System.out.println("COMPROBADOR DE AÑOS BISIESTOS");
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("Introduzca el año: ");
			
			int year = sc.nextInt();
			
	        if (year % 400 == 0) {
	            System.out.println("El año " + year + " es un año bisiesto porque es múltiplo de 400.");
	        } else if (year % 100 == 0) {
	            System.out.println("El año " + year + " no es un año bisiesto porque es múltiplo de 100 sin ser múltiplo de 400.");
	        } else if (year % 4 == 0) {
	            System.out.println("El año " + year + " es un año bisiesto porque es múltiplo de 4 sin ser múltiplo de 100.");
	        } else {
	            System.out.println("El año " + year + " no es un año bisiesto.");
	        }
		}	
	}
}
