package ejercicios_opcionales_leccion_estructuras_control;

import java.util.Locale;
import java.util.Scanner;

public class CalculoDeAreas {
	
	private static double getTriangleArea(double base, double height) {
		return (base * height) / 2;
	}
	
	private static double getCircleArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}

	public static void main(String[] args) {
		
		System.out.println("CÁLCULO DE ÁREAS");
			
		try (Scanner sc = new Scanner(System.in)) {
			
			sc.useLocale(Locale.US);
			
			System.out.println("Elija una figura geométrica:\n"
					+ "a) Triángulo\n"
					+ "b) Círculo");
			System.out.println("¿Qué figura quiere calcular (Escriba T o C)?");
			
			String answer = sc.nextLine().trim();
			
			if(answer.equalsIgnoreCase("t")) {
				System.out.print("Introduzca la base: ");
				double base = sc.nextDouble();
				System.out.print("Introduzca la altura: ");
				double height = sc.nextDouble();
				System.out.println("Un triángulo de base " + base + " y altura " + height + " tiene un área de " + getTriangleArea(base, height));
			}
			else if (answer.equalsIgnoreCase("c")) {
				System.out.print("Introduzca el radio: ");
				double radius = sc.nextDouble();
				System.out.println("Un círculo de radio " + radius + " tiene un área de " + getCircleArea(radius));
			}
			else {
				System.out.println("El valor introducido es incorrecto");
			}
		}
	}
}
