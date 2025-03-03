package ejercicios_propuestos_leccion_estructuras_control_switch_case;

import java.util.Scanner;

public class EjercicioSegundoSolucion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Intriduzca la nota que ha sacado (de 0 a 10 utilizando punto como separador): ");
		
		float calificationNote = sc.nextFloat();
		
		int grade;
		
		if(calificationNote < 5.0 && calificationNote > 0.0) {
			grade = 1;
		}
		else if (calificationNote < 7.0) {
			grade = 2;
		}
		else if (calificationNote < 9.0) {
			grade = 3;
		}
		else if (calificationNote < 10.0) {
			grade = 4;
		}
		else if (calificationNote == 10.0) {
			grade = 5;
		}
		else {
			grade = 0;
		}
		
		String result = "";
		
		switch(grade) {
			case 1: {
				result = "SUSPENSO";
				break;
			}
			case 2: {
				result = "APROBADO";
				break;
			}
			case 3: {
				result = "NOTABLE";
				break;
			}
			case 4: {
				result = "SOBRESALIENTE";
				break;
			}
			case 5: {
				result = "OPCIÓN A M.H.";
				break;
			}
			case 0: {
				result = "La nota introducida es incorrecta";
				break;
			}
		}
		
		System.out.println("Su resultado de prueba con nota " + calificationNote + " es " + result);
		
		sc.close();
	}

}
