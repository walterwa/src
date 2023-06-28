package Exercicios20;

import java.util.Scanner;
import java.util.Random;

public class Exer01 {

	public static void main(String[] args) {
		
		int[][] numerosAleatorios = new int[4][4];
		
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
		
		System.out.println("Maior valor = " + maior);
		System.out.println("Linha = " + linha);
		System.out.println("Coluna = " + col);
	}

}
