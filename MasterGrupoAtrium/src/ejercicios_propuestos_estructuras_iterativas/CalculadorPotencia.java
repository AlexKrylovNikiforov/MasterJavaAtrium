package ejercicios_propuestos_estructuras_iterativas;

public class CalculadorPotencia {
	
	private static long getPower(int base, int power) {
		long result = (long) base;
		
		for(int i = 1; i<power; i++) {
			result *= base;
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println("2 en potencia 2: " + getPower(2, 2));
		System.out.println("2 en potencia 8: " + getPower(2, 8));

	}

}
