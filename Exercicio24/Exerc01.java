package Exercicio24;

public class Exerc01 {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Amarela";
		lampada.tipoAbajur = true;
		
		//instanciando o array tipos para o objeto lampada
		lampada.tipos = new String[2];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampeões";
		
			

	}
}
