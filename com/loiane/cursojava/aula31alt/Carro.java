package com.loiane.cursojava.aula31alt;

public class Carro {


	String carro;
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " Km");
	}
	
	//métodos com retorno
	double obterAutonomia() {
		System.out.println("Método obter autonomia foi chamado.");
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	private double divideKmPorConsumoCombustivel(double km) {
		return km/this.consumoCombustivel;
	}
	
	public double calcularCombustivel(double km) {
						
		return divideKmPorConsumoCombustivel(km);
	}
}
