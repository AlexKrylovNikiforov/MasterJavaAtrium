package ejercicios_propuestos_estructuras_iterativas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuscadorFibonacci {
	
	private static List<Integer> findFibonacciNumbers(int limit) {
		List<Integer> result = new ArrayList<>();	
		
		if(limit < 2) {
			throw new IllegalArgumentException("El limite debe ser mayor a dos"); 
		}
		
		int a= 0;
		int b = 1;
		result.add(a);
		result.add(b);
		int next = a + b;
		
		while(next <= limit) {
			result.add(next);
			a = b;
			b = next;
			next = a + b;
		}

		return result;
	}

	public static void main(String[] args) {
		
		findFibonacciNumbers(100).forEach(System.out::println);
		
	}

}
