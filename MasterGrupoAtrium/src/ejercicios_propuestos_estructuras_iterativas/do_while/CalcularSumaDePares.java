package ejercicios_propuestos_estructuras_iterativas.do_while;

public class CalcularSumaDePares {
	
	private static int evenNumbersSum(int begin, int finish) {
		
		int result = 0; 
		
		if (begin % 2 != 0) {
			begin += 1;
		}
		
		do {
				result += begin;
				begin += 2;
			} while (begin <= finish);
		
		return result;
		
		//version con progresion aritmetica
		/*
		int firstEven = begin % 2 == 0 ? begin : begin + 1;
		int lastEven =  finish % 2 == 0 ? finish : finish - 1;
		
		int n = ((lastEven - firstEven) / 2) + 1; 
		
		return (n * (begin + finish) / 2);
		*/
	}

	public static void main(String[] args) {
		
		System.out.println(evenNumbersSum(10, 50));
		System.out.println(evenNumbersSum(43, 97));
		

	}

}
