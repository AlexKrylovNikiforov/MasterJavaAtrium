package ejercicios_propuestos_leccion_estructuras_control_switch_case;

import java.util.Scanner;

public class EjercicioTerceroSolucion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número entero: ");
		
		int number = sc.nextInt();
		
		switch (number % 2) {
			case 0: System.out.println("El número es divisible por 2"); break;
			default: System.out.println("El número no es divisible por 2"); break;
		}
		
		switch (number % 3) {
			case 0: System.out.println("El número es divisible por 3"); break;
			default: System.out.println("El número no es divisible por 3"); break;
		}
		
		switch (number % 5) {
			case 0: System.out.println("El número es divisible por 5"); break;
			default: System.out.println("El número no es divisible por 5"); break;
		}
		
		sc.close();
	}

}
