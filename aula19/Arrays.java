package aula19;

public class Arrays {

	public static void main(String[] args) {
		
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.3;
		temperaturas[3] = 34;
		temperaturas[4] = 33.3;
		
		System.out.println("O valor da temperatura do dia 1 é " + temperaturas[0]);
		
		System.out.println("O tamanho do array: " + temperaturas.length);
		
		System.out.println("Valores do array: ");
		
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
		}
	}

}
