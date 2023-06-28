package Exercicios17;

import java.util.Scanner;

public class Exerc3 {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome, genero, estadoCivil;
		int idade;
		double salario;
		
		do {
			System.out.println("Entre com o nome: ");
			nome = scan.next();
			
			if(nome.length() >= 3) {
				infoValida = true;
			} else {
				System.out.println("Nome precisa de no mínimo 3 caracteres");
			}

		} while (!infoValida);
		
		//setando novamente o valor da variável
		infoValida = false;
		
		do {
			System.out.println("Entre com a idade: ");
			idade = scan.nextInt();
			
			if(idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("A idade precisa ser enter 0 e 150.");
			}

		} while (!infoValida);
		
		//setando novamente o valor da variável
		infoValida = false;
		
		do {
			System.out.println("Entre com o salário: ");
			salario = scan.nextDouble();
			
			if(salario  > 0) {
				infoValida = true;
			} else {
				System.out.println("O salário precisa ser maior que R$ 0 ");
			}

		} while (!infoValida);
		
		
		do {
			System.out.println("Entre com a sua identidade de gênero: ");
			genero = scan.next();
			
			if(genero.equalsIgnoreCase("MC") || 
					genero.equalsIgnoreCase("HC") ||
			genero.equalsIgnoreCase("MT") || 
			genero.equalsIgnoreCase("HT") || 
			genero.equalsIgnoreCase("NB")) {
				infoValida = true;
			} else {
				System.out.println("Não encontramos a opção digitada");
			}

		} while (!infoValida);
		
		
		do {
			System.out.println("Entre com o seu estado civil: ");
			estadoCivil = scan.next();
			
			if(estadoCivil.equalsIgnoreCase("s") ||
					estadoCivil.equalsIgnoreCase("c") ||
					estadoCivil.equalsIgnoreCase("v") ||
					estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			} else {
				System.out.println("O estado civil precisa ser S, C, V ou D");
			}

		} while (!infoValida);
		
		System.out.println("Nome " + nome);
		System.out.println("Idade " + idade);
		System.out.println("Salário " + salario);
		System.out.println("Identidade de Gênero " + genero);
		System.out.println("Estado Civil " + estadoCivil);
	}
}
