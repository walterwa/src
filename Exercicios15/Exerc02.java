package Exercicios15;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int num1 = scan.nextInt();
		
		if(num1 >=0 ) {
			System.out.println("O número informado é positivo");
		} else {
			System.out.println("O número informado é negativo");
		}
		
	
	}
}
