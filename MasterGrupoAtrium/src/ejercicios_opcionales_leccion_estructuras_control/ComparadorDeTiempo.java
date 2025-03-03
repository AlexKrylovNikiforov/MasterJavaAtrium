package ejercicios_opcionales_leccion_estructuras_control;

import java.util.Scanner;

public class ComparadorDeTiempo {

	public static void main(String[] args) {
		
		System.out.println("COMPARADOR DE AÑOS");
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("¿En qué año estamos? ");
			int currentYear = sc.nextInt();
			
			System.out.print("Introduzca un año cualquiera: ");
			int userYear = sc.nextInt();
			
			String message;
			int result;
			
			if(currentYear > userYear) {
				result = userYear > 0 ? currentYear - userYear : currentYear + Math.abs(userYear);
				message = "Desde el año " + userYear + " han pasado " + result + " años";
			}
			else if(currentYear < userYear) {
				result = userYear - currentYear;
				message = "Para llegar al año " + userYear + " faltan " + result + " años";
			}
			else {
				message = "¡Son el mismo año!"; 
			}
			System.out.println(message);
		}

	}

}
