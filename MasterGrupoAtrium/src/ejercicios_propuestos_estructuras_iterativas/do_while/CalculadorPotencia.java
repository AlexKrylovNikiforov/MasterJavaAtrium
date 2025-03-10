package ejercicios_propuestos_estructuras_iterativas.do_while;

public class CalculadorPotencia {
	
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
		int i = 1;
		do {
			result *= base;
			i++;
		} while (i < power);
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2 en potencia 8 es: " + getPower(2, 8));
		System.out.println("3 en potencia 4 es: " + getPower(3, 4));
		System.out.println(getPower(5, 1));
	}

}
