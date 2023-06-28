package com.loiane.cursojava.aula35;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
		System.out.println("Resultado Fatorial NÃO RECURSIVO: " + fatorialNR);
		
		System.out.println();
		
		int fatorialR = Calculadora.fatorialNaoRecursivo(5);
		System.out.println("Resultado Fatorial RECURSIVO: " + fatorialR);


	}

}
