package Exercicios15;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o ano da pesquisa: ");
		int ano = scan.nextInt();
		
		if((ano % 400 == 0) || (ano % 400 == 0 && ano % 100 != 0)) {
			System.out.println("É um ano bissexto.");
		} else {
			System.out.println("Não é um ano bissexto.");
		}
		
		
		
	}
}
