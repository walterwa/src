package Exercicios17;

import java.util.Scanner;

public class Exerc5 {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double popA;
		double popB;
		double taxaA;
		double taxaB;
		int cont = 0;
		
		boolean valido = false;

		do {
			System.out.println("Entre com a População A: ");
			popA = scan.nextDouble();
			if (popA > 0 ) {
				valido = true;
			} else {
				System.out.println("A População A precisa ser maior que 0.");
			}
		} while (!valido);
		
		//reutilizando a flag
		valido = false;

		do {
			System.out.println("Entre com a População B: ");
			popB = scan.nextDouble();
			if (popB > 0 ) {
				valido = true;
			} else {
				System.out.println("A População B precisa ser maior que 0.");
			}
		} while (!valido);
		
		//reutilizando a flag
		valido = false;

		do {
			System.out.println("Entre com a taxa de crescimento da população A: ");
			taxaA = scan.nextDouble();
			if (taxaA > 0 ) {
				valido = true;
			} else {
				System.out.println("A taxa da População A precisa ser maior que 0.");
			}
		} while (!valido);
		
		//reutilizando a flag
		valido = false;

		do {
			System.out.println("Entre com a taxa de crescimento da população B: ");
			taxaB = scan.nextDouble();
			if (taxaB > 0 ) {
				valido = true;
			} else {
				System.out.println("A taxa da População B precisa ser maior que 0.");
			}
		} while (!valido);
		
		while (popA < popB) {
			popA += (popA/100) * taxaA;
			popB += (popB/100) * taxaB;
			cont++;
		}

		
		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("Quantidade de anos: " + cont);
	}
}
