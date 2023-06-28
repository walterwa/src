package aula20;

import java.util.Random;
import java.util.random.*;

public class ForEach {

	public static void main(String[] args) {
		
		int[] notas = new int[10];
		
		Random random = new Random();
		
		for(int i = 0; i < notas.length; i++) {
			
			notas[i] = random.nextInt(10);
		}
		
		for(int i = 0; i < notas.length; i++) {
			int nota = notas[i];
			System.out.println(notas[i]);
		}
		System.out.println();
		System.out.println("Usando ForEach: "); //não teremos acesso ao i (contador)
		for (int nota : notas) {
			System.out.println(nota);
		}
	}

}
