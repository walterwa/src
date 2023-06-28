package Exercicios19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posição: " + i);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i] % 2;
		}
		
		

		System.out.println("Vetor A = " );
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		//pular linha
		System.out.println();
		
		System.out.println("Vetor B = " );
		for(int i = 0; i < vetorB.length; i++) {
			System.out.println(vetorB[i] + " ");
		}
	}

}
