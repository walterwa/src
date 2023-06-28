package Exercicios15;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número da pesquisa: ");
		int num = scan.nextInt();
		System.out.println("Entre com o segundo número da pesquisa: ");
		int num2 = scan.nextInt();
		
		System.out.println("Entre com a operação: + - / * ");
		String operacao = scan.next();
		
		double resultado = 0;
		
		//criando uma flag para avaliar nossa operação
		boolean valida = true;
		
		switch(operacao) {
		case "+": resultado = num + num2; break;
		case "-": resultado = num - num2; break;
		case "/": resultado = num / num2; break;
		case "*": resultado = num * num2; break;
		default: 
			System.out.println("Operação inválida."); 
			valida = false;
		}
		
		if(valida) {
			if(resultado >= 0) {
				System.out.println("Resultado positivo");
			} else {
				System.out.println("Resultado negativo");
			}
			if (resultado % 2 == 0) {
				System.out.println("Resultado par.");
			} else {
				System.out.println("Resultado ímpar.");
			}
		}
	}
}
