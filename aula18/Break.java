package aula18;

import java.util.Scanner;

public class Break {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite: ");
		int max = scan.nextInt();
		
		for (int i = num; i<=max; i++) {
			
			//verificar número divisível por 7
			if(i % 7 == 0) {
				System.out.println("O valaor de i é: " + i);
				break;
			}
		}
	}
}
