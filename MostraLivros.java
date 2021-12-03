package packLivros;
public class MostraLivros {
	String arrayLivro [][]= {{"Algoritmos", "Tecnicas Digitais", "Calculo"},{ "1", "2","3"}};
double preco;

void mostraNomeLivro() {
	for(int i=0; i<3; i++) {
		for(int j=0; j<3;j++) {
			System.out.println(" livro correspondente é:  "+ arrayLivro[i][j]);
				
		}
		
	}
	
}
void mostraCodlivro(int cod) {
	double pc;
			if(cod== 1)  {
				pc = 105.90;
				System.out.printf(" o preço do livro é: %.2f R$"+ pc);
				
					} else if (cod== 2) {
						pc = 78.88;
						System.out.printf(" o preço do livro é: .%2f R$"+ pc);
												
					} else if (cod== 3) {
						pc = 178.67;
						System.out.printf(" preço do livro é: .%2f R$"+  pc);
						
							
					} else {
						System.out.println("A opção escolhida não há nenhum codigo ");
					}  
					
	}
	



}
