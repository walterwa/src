package Exercicios17;

import java.util.Scanner;

public class Exerc2 {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean infoValidas = false;
		String nomeUsuario;
		String senha;
		
		do {
			System.out.println("Entre com o nome do usuário: ");
			nomeUsuario = scan.next();
			
			System.out.println("Entre com a senha: ");
			senha = scan.next();
		
			if(nomeUsuario.equalsIgnoreCase(senha)) {
				
				System.out.println("Senha igual ao usuário, digite novamente: ");
			} else {
				infoValidas = true;
				System.out.println("Senha e usuários válidos.");
			}

		} while (!infoValidas);
		
	}
}
