package com.loiane.cursojava.aula35;

public class Calculadora {

		
		public static int soma(int num1, int num2) {
			return num1 + num2;
		}
		
		public double soma(double num1, double num2) {
			return num1 + num2;
		}
		
		public int soma(int num1, int num2, int num3) {
			return num1 + num2 + num3;
		}
		
		public int soma(int[] vetorInteiros) {
			
			int total = 0;
			
			for(int i = 0; i < vetorInteiros.length; i++) {
				total += vetorInteiros[i];
			}
			
		return total;
		}
		
		public static int fatorialNaoRecursivo(int num) {
			if(num == 0 ) {
				return 1;
			}
			
			int total = 1;
			for(int i=num; i>1; i--) {
				total *= i;
			}
			return total;
		}
		
		//Fatorial recursivo
		//fatorial(5) = 5 * fatorial(4)
		//fatorial(4) = 4 * fatorial(3)
		//fatorial(3) = 3 * fatorial(2)
		//fatorial(2) = 2 * fatorial(1)
		//fatorial(1) = 1 * fatorial(0)
		//fatorial(0) = 1
		public static int fatorial(int num){
			
			if (num == 0) {
				return 1;
			}
			return num * fatorial(num-1);
		}
}
