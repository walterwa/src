package Exercicios15;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com uma letra (F - M): ");
		String input = scan.next();
		
		if(input.equalsIgnoreCase("f")) {
			System.out.println("F - Fazenda");
		} else if (input.equalsIgnoreCase("m")) {
			System.out.println("M - Montanha");
		} else {
			System.out.println("Valor inválido");
		}
	}
}
