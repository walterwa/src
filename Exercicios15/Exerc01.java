package Exercicios15;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	System.out.println("Entre com o primeiro número: ");
	int num1 = scan.nextInt(); 
	
	System.out.println("Entre com o segundo número: ");
	int num2 = scan.nextInt();
	
	if (num1 > num2) {
		System.out.println("O número 1: " + num1 + " , é maior. " );
	}
	else {
		System.out.println("O número 2: " + num2 + " , é maior.");
	}
	}
}
