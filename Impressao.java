package aula4;
import java.util.*;
public class Impressao {
	/*	Nome: Givanildo Vidal
	Endereço: Rua tito, 1000
	Cep: 05049-000
	Estado: SP
	Mande o email: givanildo@terra.com.br
	*/
	public static void main(String[] args) {
		String nome, endereco,estado,email, cep;
		Scanner teclado = new Scanner(System.in );
		System.out.println("digite algumas informações....");
		System.out.println("digite seu nome:");
		nome= teclado.nextLine();
		System.out.println("Seu Endereco:");
		endereco= teclado.nextLine();
		System.out.println("digite seu estado:");
		estado= teclado.nextLine();
		System.out.println("digite seu email:");
		email= teclado.nextLine();
		System.out.println("digite seu Cep");
		cep= teclado.nextLine();
		System.out.printf("ola %s\n, seu endereço è:%s \n, seu email é :%s\n, seu estado é:\n, seu cep é: %s" , nome, endereco,email,estado, cep );
		teclado.close();
		
	}

}
