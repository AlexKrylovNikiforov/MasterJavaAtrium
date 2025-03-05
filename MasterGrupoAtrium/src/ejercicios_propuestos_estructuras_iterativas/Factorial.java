package ejercicios_propuestos_estructuras_iterativas;

import java.math.BigInteger;

public class Factorial {
	
	private static BigInteger getFactorial(int n) {
		
		BigInteger result = BigInteger.ONE;
		
		int index = 1;
		
		if(n < 0) {
			throw new IllegalArgumentException("n tiene que ser igual o mayor que zero");
		} 
		
		if(n == 0 || n == 1 ) {
			return result;
		}
		
		while (index <= n) {
			result = result.multiply(BigInteger.valueOf(index));
			index++;
		}
		return result;
	}
	
	private static BigInteger getRecursiveFactorial(int n) {
		
		if(n < 0) {
			throw new IllegalArgumentException("n tiene que ser igual o mayor que zero");
		} 
		
		BigInteger result = BigInteger.ONE;
		
		if(n == 0 || n == 1 ) {
			return result;
		}
		
		else { 
			return BigInteger.valueOf(n).multiply(getRecursiveFactorial(n - 1));	
		}
		
	}

	public static void main(String[] args) {
		// método iterativo
		System.out.println("Factorial de 25 es: " + getFactorial(25));
		
		//método recursivo
		System.out.print("Factorial de 25 es: " + getRecursiveFactorial(25));

	}

}
