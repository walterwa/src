package aula17;

public class For {

	public static void main(String[] args) {
						
		
		for(int i = 0; i < 5; i++ ) {
			System.out.println("Valor de i: " + i);
		}
		
		for(int i = 5; i > 0; i-- ) {
			System.out.println("Valor de i: " + i);
		}
		
		for(int i = 0, j = 10; i < j; i++, j-- ) {
			System.out.println("i = " + i + " j = " + j);
		}
//		
//		int count = 0;
//		for (; count < 10 ;) {
//			System.out.println("Valor de count: " + count);
//		}
		
		for(int cont = 0; cont < 10; cont += 2) {
			System.out.println("Valor de count: " + cont);
		}
		
		int soma = 0;
		for(int i = 1; i < 5; soma += i++) {
			System.out.println("Valor de soma: " + soma);
		}
		System.out.println("Valor Final de soma: " + soma);
	}
}
