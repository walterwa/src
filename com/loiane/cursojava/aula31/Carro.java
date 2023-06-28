package com.loiane.cursojava.aula31;

public class Carro {
	
	String carro;
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " Km");
	}
	
	//métodos com retorno
	double obterAutonomia() {
		System.out.println("Método obter autonomia foi chamado.");
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/this.consumoCombustivel;  
				
		return qtdCombustivel;
	}
}
