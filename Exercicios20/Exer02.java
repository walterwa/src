package Exercicios20;

import java.util.Random;
import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
	int[][] numerosAleatorios = new int[10][10];
		
		Random numeroRandom = new Random();

		//criando a matriz
		for(int i=0; i < numerosAleatorios.length; i++) {
			for(int j=0; j < numerosAleatorios.length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);	
			}
		}
		
		int maior = 0;
		int linha = 0;
		int col = 0;
		
		for(int i=0; i < numerosAleatorios.length; i++) {
			for(int j=0; j < numerosAleatorios.length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);	
				if(numerosAleatorios[i][j] > maior) {
					maior = numerosAleatorios[i][j];
					linha = i;
					col = j;
				}
			}
		}
		
		//imprimindo a matriz para checagem
		for(int i=0; i < numerosAleatorios.length; i++) {
			for(int j=0; j < numerosAleatorios.length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");
				
			}
			System.out.println();
		}
		
		int maiorL5 = 0;
		int menorL5 = 101;
		for (int i = 0; i < numerosAleatorios[5].length; i++) {
			if(numerosAleatorios[5][i] > maiorL5) {
				maiorL5 = numerosAleatorios[5][i];
			}
			if(numerosAleatorios[5][i] < menorL5) {
				menorL5 = numerosAleatorios[5][i];
		}
		
	}
		System.out.println();
		System.out.println("Maior valor da linha 5 = " + maiorL5);
		System.out.println("Menor valor da linha 5 = " + menorL5);
	
		int maiorL7 = 0;
		int menorL7 = 101;
		 
		for (int i = 0; i < numerosAleatorios[7].length; i++) {
			if(numerosAleatorios[i][7] > maiorL7) {
				maiorL7 = numerosAleatorios[6][i];
			}
			if(numerosAleatorios[i][7] < menorL7) {
				menorL7 = numerosAleatorios[7][i];
			}
		}
		
		System.out.println();
		System.out.println("Maior valor da linha 7 = " + maiorL7);
		System.out.println("Menor valor da linha 7 = " + menorL7);
	}
}

