package com.loiane.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Tyrion");
//		contato.setEndereco("Kings Landing");
//		contato.setTelefone("89 97785-1267");

		//criar objeto Endereço
		Endereco endereco = new Endereco();
		endereco.setNomeRua("Rua Game of Thrones");
		endereco.setNumero("N/a");
		endereco.setComplemento("-");
		endereco.setCidade("Kingslanding");
		endereco.setEstado("Westeros");
		endereco.setCep("99999-999");
		
		contato.setEndereco(endereco);
		
		//relacionamento tem-um telefone
		Telefone telefone = new Telefone();
		telefone.setTipo("Celular");
		telefone.setDdd("87");
		telefone.setNumero("97785-1267");
		
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("casa");
		telefone2.setDdd("11");
		telefone2.setNumero("8888-8888");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		//contato.setTelefone(telefone);
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
//		System.out.println(contato.getEndereco());
		
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade()); 
		}
		
		//forma antiga, quando era só 1 telefone
		/*if (contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		}*/
		
		if(contato != null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
	}

}
