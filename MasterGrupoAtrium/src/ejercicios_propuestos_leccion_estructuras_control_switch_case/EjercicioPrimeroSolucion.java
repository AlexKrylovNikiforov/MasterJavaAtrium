package ejercicios_propuestos_leccion_estructuras_control_switch_case;

import java.util.Scanner;

public class EjercicioPrimeroSolucion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número de 1 a 7: ");
		
		int dayNumber = sc.nextInt();
		
		String result;
		
		switch (dayNumber) {
			case 1: {
				result = "Estamos en lunes";
				break;
			}
			case 2: {
				result = "Estamos en martes";
				break;
			}
			case 3: {
				result = "Estamos en miercoles";
				break;
			}
			case 4: {
				result = "Estamos en jueves";
				break;
			}
			case 5: {
				result = "Estamos en viernes";
				break;
			}
			case 6: {
				result = "Estamos en sábado";
				break;
			}
			case 7: {
				result = "Estamos en domingo";
				break;
			}  
			default: result = "El número introducido no corresponde a ningún día de semana";
			break;
		}
			
		System.out.println(result);
		sc.close();
	}	
}
