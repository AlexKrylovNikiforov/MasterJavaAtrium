package ejercicios_propuestos_leccion_estructuras_control_switch_case;

import java.util.Scanner;

public class EjercicioQuintoSolucion {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("Introduzca cualquier número romano (I, V, X, L, C, D o M): ");
			
			String romanNumber = sc.nextLine().trim().toLowerCase();
			
			int result = switch (romanNumber) {
				case "i" -> 1; 
				case "v" -> 5;
				case "x" -> 10;
				case "l" -> 50;
				case "c" -> 100;
				case "d" -> 500;
				case "m" -> 1000;
				default -> throw new IllegalArgumentException("El valor introducido no corresponde a ningún número romano");
			};
			
			System.out.println("El número introducido corresponde a " + result);
		}

	}

}
