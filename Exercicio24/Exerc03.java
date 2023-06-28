package Exercicio24;

public class Exerc03 {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2015;
		livro.preco = 50;
		
		System.out.println("O livro " + livro.nome + " da autora " + livro.autor + " foi lançado em " + livro.anoLancamento);
		System.out.println("Ele custa R$" + livro.preco);
	}
}
