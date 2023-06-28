package com.loiane.cursojava.aula34labs;


public class Exerc01 {

	static void imprimirValor() {
		System.out.println(Contador.obterValor());
	}
	
	public static void main(String[] args) {
		
		imprimirValor();
		
		Contador.incrementar();
		
		imprimirValor();
		
		Contador.zerar();
		
		imprimirValor();
		
		Contador c1 = new Contador();
		Contador c2 = new Contador();
		Contador c3 = new Contador();
		
		System.out.println("Após novas instanciações: ");
		imprimirValor();
		//valor será 3, pois o valor é trata-se de uma variável estática
		 //...todos os valaores dela são iguais entre todas as classes
	}
}
