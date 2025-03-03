package ejercicios_propuestos_leccion_estructuras_control_if_else;

import java.util.Scanner;

public class EjercicioCuartoSolucion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca el importe a ingresar: ");
		
		float quantity = sc.nextFloat();
		
		System.out.println("Introduzca número de meses: ");
		
		int timeMonthes = sc.nextInt();
		
		float rent;
		
		if(timeMonthes <= 24) {
			rent = 0.05F;
		}
		else if(timeMonthes<=60) {
			rent = 0.08F;
		}
		else {
			rent = 0.1F;
		}
		
		System.out.println("El importe de la renta será EUR " + ((quantity * rent * timeMonthes) / 1200));
		
		sc.close();

	}

}
