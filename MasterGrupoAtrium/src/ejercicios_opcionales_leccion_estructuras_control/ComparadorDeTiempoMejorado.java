package ejercicios_opcionales_leccion_estructuras_control;

import java.util.Scanner;

public class ComparadorDeTiempoMejorado {

	public static void main(String[] args) {
		System.out.println("COMPARADOR DE AÑOS");
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("¿En qué año estamos? ");
			int currentYear = sc.nextInt();
			
			System.out.print("Introduzca un año cualquiera: ");
			int userYear = sc.nextInt();
			
			int result = userYear - currentYear;
			
			if(currentYear < userYear && result == 1) {
				String message = "Para llegar al año " + userYear + " falta 1 año.";
				System.out.println(message);
			}
		}

	}

}
