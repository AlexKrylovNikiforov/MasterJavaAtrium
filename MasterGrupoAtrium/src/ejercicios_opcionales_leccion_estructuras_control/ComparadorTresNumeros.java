package ejercicios_opcionales_leccion_estructuras_control;

import java.util.Scanner;

public class ComparadorTresNumeros {

	public static void main(String[] args) {
		
		System.out.println("COMPARADOR DE TRES NÚMEROS");
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("Introduzca primer número: ");
			int a = sc.nextInt();
			
			System.out.print("Introduzca segundo número: ");
			int b = sc.nextInt();
			
			System.out.print("Introduzca tercer número: ");
			int c = sc.nextInt();
			
			String message;
			
			if (a == b && b == c) {
				message = "Ha escrito tres veces el mismo número.";
				System.out.println(message);
			}
			else if (a == b || a == c || b == c) {
				message = "Ha escrito uno de los números dos veces.";
				System.out.println(message); 
			}
			else {
				message = "Los tres números son distintos.";
				System.out.println(message);
			}
		}
	}
}
