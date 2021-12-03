package aula4;

public class processaMetodo {
void recebeNome(String nome) {
	System.out.println("Ola "+ nome);
	
}
int calcIdade(int anoAt, int anoNasc) {
	int idade;
	idade = (anoAt - anoNasc);
	return idade;
	}
}
