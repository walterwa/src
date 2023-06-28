package com.loiane.cursojava.aula45;

public class Teste {

	public static void main(String[] args) {
			Aluno aluno = new Aluno();
			Pessoa pessoaAluno = aluno; //upcasting

			//conversão java, é um tipo de upcasting
			Pessoa aluno2 = (Pessoa) new Aluno();
			
			
			//downcasting
			Pessoa aluno3 = new Pessoa();
			Aluno aluno4 = (Aluno) aluno3; //a complicação acontece, mas o resultado é um erro
		}
}

