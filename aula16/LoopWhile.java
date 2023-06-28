package aula16;

public class LoopWhile {

	
	public static void main(String[] args) {
	
		int i = 1;
		int max = 10;
		
		System.out.println("Contando até " + max);
		
		//While: avalia a expressão e só depois executa
		//executa o println até i = 9
		while(i < max) {
			System.out.println("Valor de i: " + i);
			i++;
		}
		
		System.out.println(i); //valaor final do i 10)
		
		//Do While: primeiro executa e depois avalia a expressão
		
		do {
			i++;
			System.out.println("Valor de i: " + i);
		} while (i < 15);
		System.out.println(i); //valaor final do i 15)
	}
}
