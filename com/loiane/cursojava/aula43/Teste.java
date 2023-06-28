package com.loiane.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciência da Computação");
		double[] notas = {10, 9, 8, 7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		String s1 = "adab";
		String s2 = "adaB";
		
		System.out.println("A comparação é: " + s1.equals(s2));
		System.out.println("A comparação com Ignore Case é: " + s1.equalsIgnoreCase(s2));
		
		Aluno aluno2 = new Aluno();
			
		aluno.setCurso("Ciência da Computação");
		double[] notas2 = {9, 8, 6, 7};
		aluno2.setNotas(notas2);
		
		System.out.println("A comparação entre os alunos é: " + aluno.equals(aluno2));
	
	}

}
