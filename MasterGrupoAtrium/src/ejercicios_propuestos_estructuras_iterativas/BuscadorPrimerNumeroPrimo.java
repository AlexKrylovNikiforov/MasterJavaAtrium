package ejercicios_propuestos_estructuras_iterativas;


public class BuscadorPrimerNumeroPrimo {


	public static void main(String[] args) {
		
		int count = 0;
			
		int number = 198; 
		
		while(true) {
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
					System.out.println(number);
					break;
					}
				number++;
		}
	}
		
}
