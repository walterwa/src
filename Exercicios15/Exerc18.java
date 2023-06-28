package Exercicios15;

import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número da pesquisa: ");
		int num = scan.nextInt();
		
		if(num % 2 == 0 ) {
			System.out.println("É um número par.");
		} else {
			System.out.println("É um número ímpar.");
		}		
	}
}
