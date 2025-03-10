package ejercicios_propuestos_estructuras_iterativas;

import java.util.ArrayList;
import java.util.List;

public class BuscadorNumeroPerfecto {
	
	private static List<Integer> findPerfectNumbers(int range) {
		List<Integer> result = new ArrayList<>();
		
		int perfectNumber = 2;
		
		while(perfectNumber <= range) {
			int divisorsSum = 1;
			for(int i = 2; i*i < perfectNumber; i++) {
				if(perfectNumber % i == 0) {
					divisorsSum +=  i;
					
					if(i != perfectNumber / i) {
						divisorsSum += perfectNumber / i;
					}
				}
			}		
		if(divisorsSum == perfectNumber) {
			result.add(perfectNumber);
		}
		perfectNumber++;
		}
		return result;
	}

	public static void main(String[] args) {
		
		List<Integer> perfectNumbers = findPerfectNumbers(100);
		
		perfectNumbers.forEach(System.out::println);
	}

}
