package aula26;

public class Carro {

	String carro;
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km");
	}
	
	//método com retorno
	double obterAutonomia() {
		System.out.println("Método obter autonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}
}
