package orientacao_obj;

public class Livro {
String nome;
String autor;
String descricao;
String isbn;
double preco;
String dataPub;
// declarando os metodos
void infoLivro() {
	System.out.println("Nome do Livro" + nome );
	System.out.println("Autor do Livro" + autor);
	System.out.println("Pre�o do Livro" + preco);
	System.out.println("Data de Publi��o do Livro: " + dataPub + "\n");
	} 
}
