package aula25;

//importando a classe Carro da aula 25
import aula25.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		//exibirAutonomia foi criado na classa Carro (aula 25)
		van.exibirAutonomia();

	}

}
