package com.loiane.cursojava.aula42;

public class Teste {

	public static void main(String[] args) {
	
			Pessoa pessoa = new Pessoa();
			//Pessoa aluno = new Aluno();
			//Pessoa professor = new Professor();
			Aluno aluno = new Aluno();
			Professor professor = new Professor();
			
			
			System.out.println(Constantes.URL_BLOG);
			
			//não vai ser possível modificar
			//Constantes.URL_BLOG = "sajdlkjdaslksdhfdjd";
			System.out.println(Constantes.URL_BLOG);
	}

}
