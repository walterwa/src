package Exercicios15;

import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor de A: ");
		int valorA = scan.nextInt();
		
		if (valorA == 0) {
			System.out.println("não é equação de segundo grau.");
		} else {
			System.out.println("Entre com o valor de B: ");
			int valorB = scan.nextInt();
			
			System.out.println("Entre com o valor de C: ");
			int valorC = scan.nextInt();
			
			double delta = (valorB*valorB) - (4*valorA*valorC);
			if (delta < 0) {
				System.out.println("Delta é negativo");
			} else {
				
				System.out.println("Delta = " + delta);
				//calculando a raiz quadrade de delta com sqr
				double x1 = ((-valorB) + Math.sqrt(delta))/ (2*valorA);
				double x2 = ((-valorB) - Math.sqrt(delta))/ (2*valorA);
				
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
		
		
		
	}
}
