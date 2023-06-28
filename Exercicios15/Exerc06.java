package Exercicios15;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com o segundo terceiro: ");
		int num3 = scan.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("Primeiro número, " + num1 + ", é o maior.");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("Segundo  número, " + num2 + ", é o maior.");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("Terceiro número, " + num3 + ", é o maior.");
		}
	}
}
