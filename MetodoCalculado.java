package aula4;
public class MetodoCalculado {
double n1, n2, media;
String nome;
void mostraNome(String nome) {
	System.out.printf("Olá,%s Seja Bem Vindo(a)",nome);
	
	}

double calcMedia(double n1, double n2) {
	double m;
	m =(n1 + n2)/2;
	return m; 
	}
}