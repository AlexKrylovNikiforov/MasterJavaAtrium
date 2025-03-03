package ejercicios_propuestos_leccion_estructuras_control_switch_case;

import java.util.Scanner;

public class EjercicioCuartoSolucion {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
		    System.out.print("Introduzca la letra correspondiente a su estado civil (S, C, V, D): ");
		    
		    //quitamos espacios, convertimos las letras en minusculas
		    String civilState = sc.nextLine().trim().toLowerCase();
		    
		    String result = switch (civilState) {
		        case "c" -> "casado/a";
		        case "s" -> "soltero/a";
		        case "v" -> "viudo/a";
		        case "d" -> "divorciado/a";
		        default -> throw new IllegalArgumentException("Valor incorrecto: " + civilState);
		    };
		    
		    System.out.println("Su estado civil es " + result);
		}
	}

}
