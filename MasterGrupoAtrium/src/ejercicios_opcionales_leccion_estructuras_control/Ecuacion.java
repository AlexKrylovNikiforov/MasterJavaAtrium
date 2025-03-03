package ejercicios_opcionales_leccion_estructuras_control;

import java.util.Locale;
import java.util.Scanner;

public class Ecuacion {

	public static void main(String[] args) {
		
		System.out.println("ECUACIÓN A X + B = 0");
		
		try (Scanner sc = new Scanner(System.in)) {
			
			sc.useLocale(Locale.US);
			
			System.out.print("Escriba el valor del coeficiente a: ");
			double a = sc.nextDouble();
			
			System.out.print("Escriba el valor del coeficiente b: ");
			double b = sc.nextDouble();
			
			if(a != 0) {
				double x = -b / a;
				System.out.println("La ecuación tiene una solución: " + x);
			}
			else {
				if (b == 0) {
					System.out.println("Todos los números son solución.");
			}
				else {
					System.out.println("La ecuación no tiene solución.");
				}

			}
		}
	}
}
