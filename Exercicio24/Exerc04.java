package Exercicio24;

public class Exerc04 {

	public static void main(String[] args) {
		
		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2015;
		livro.qtdPaginas = 200;
		livro.isbn = "45Asdcx978";
		livro.emprestado = false;
		
		System.out.println("O livro " + livro.nome + " da autora " + livro.autor + " foi lançado em " + livro.anoLancamento);
		System.out.println("ISBN: " + livro.isbn);
		System.out.println("Páginas: " + livro.qtdPaginas);
		
		if (livro.emprestado == false) {
			System.out.println("Ele está disponível para empréstimo.");
		} else {
			System.out.println("Ele não está disponível para empréstimo.");
		}
		

	}

}
