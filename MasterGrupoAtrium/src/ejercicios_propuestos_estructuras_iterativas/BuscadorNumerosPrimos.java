package ejercicios_propuestos_estructuras_iterativas;

import java.util.ArrayList;
import java.util.List;

public class BuscadorNumerosPrimos {
	
	private static List<Integer>  getPrimeNumbers(int n) {
		List<Integer> result = new ArrayList<>();
	
		int count = 0;
		
		int number = 2; 
		
		while(count<n) {
			 boolean isNumberPrime = true;
			 int i = 2; 
			 
			 while(i*i <= number) {
				 if(number % i == 0) {
					 isNumberPrime = false;
					 break;
				 }
				 i++;
			 }
			 
			 if(isNumberPrime) {
				 result.add(number);
				 count++;
			 }
			 number++;
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		List<Integer> primeNumbers = getPrimeNumbers(25);
		primeNumbers.forEach(System.out::println);
	}

}
