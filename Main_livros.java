package packLivros;
import java.util.*;
public class Main_livros {

	public static void main(String[] args) {
		int  cod;
		Scanner tc = new Scanner(System.in);
		MostraLivros book =  new MostraLivros();
		System.out.println("Bem Vindo ao sistema de biblioteca....... ");
		System.out.println("para começar digite um codigo, para ser pesquisado: ");
		cod =tc.nextInt();
		System.out.println("livros");
		book.mostraNomeLivro();
		System.out.println("o codigo escolhido é: ");
		book.mostraCodlivro(cod);
		
		
	tc.close();
		

	}

}
