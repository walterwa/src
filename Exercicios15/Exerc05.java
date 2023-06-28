package Exercicios15;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Entre com a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media == 10) {
			System.out.println("Parabéns, você foi aprovado com distinção pela nota: " + media);	
		}
		else if (media >= 7) {
			System.out.println("Parabéns, você foi aprovado, sua média foi: " + media);
		} else {
			System.out.println("Você não atingiu a nota mínima exigida: " + media);
		}
	}
}
