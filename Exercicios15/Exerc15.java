package Exercicios15;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a primeiro lado: ");
		int lado1 = scan.nextInt();
		
		System.out.println("Entre com a segundo lado: ");
		int lado2 = scan.nextInt();
		
		System.out.println("Entre com a terceiro lado: ");
		int lado3 = scan.nextInt();
		
		if(((lado1 + lado2) > lado3) ||
		((lado1 + lado3) > lado2) ||
		((lado2 + lado3) > lado1)) {
			
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("É um triângo Equilátero.");
			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("É um triângo Escaleno.");
			}  else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("É um triângo Isóceles.");
			}
		} else {
			System.out.println("Não forma um triângulo");
		}
	}
}
