package orientacao_obj;

public class Main_livro {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.nome = "Algoritmos";
		livro.descricao = "livro sobre algoritmos";
		livro.isbn = "998767676081";
		livro.preco = 105.90;
		livro.autor ="Tomas H. Cormen";
		livro.dataPub = "20/04/2011";
		//System.out.printf("A data de publicação do livro %s é %s ", livro.nome, livro.dataPub);
		livro.infoLivro(); //chamada do metodo
	}

}
