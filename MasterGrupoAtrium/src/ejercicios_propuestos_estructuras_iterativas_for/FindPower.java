package ejercicios_propuestos_estructuras_iterativas_for;

public class FindPower {
	
	private static long getPower(int base, int power) {
		long result = (long) base;
		
		//Primero comprobamos si la potencia es negativa, nula o igual a uno, porque estas son las condiciones basicas
		if(power < 0) {
			throw new IllegalArgumentException("La potencia no puede ser negativa");
		}
		
		if(power == 0) {
			return 1;
		}
		
		if(power == 1) {
			return base;
		}
		
		//en resto de casos calculamos la potencia
		for(int i = 1; i < power; i++) {
			result *= base;
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println("2 en potencia 8 es: " + getPower(2, 8));
		System.out.println("3 en potencia 4 es: " + getPower(3, 4));
	

	}

}
