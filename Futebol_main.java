package orientacao_obj;// importa��o de pacotes
import java.util.*;;// importa��o da biblioteca
public class Futebol_main { // Classe da Fun��o Main da classe Futebol

	public static void main(String[] args) {//Fun��o Main da classe Futebol
	String TimeNome, TecNome; // declara��o das variaves
	int pos;
	Scanner tc = new Scanner(System.in); //instacia do objeto pra fazer a leitura de dados do teclado pelo usuario 
	Futebol cl = new Futebol(); //instancia do objeto da classe futebol
	System.out.println("Digite o nome do seu time:"); //mensagem na tela
	TimeNome=tc.nextLine(); // pega o nome do time a partir do teclado
	cl.setNomeTime(TimeNome); // chamada do metodo set p/ o nome do time
	System.out.println("Qual o nome do tecnico do seu time:");//mensagem na tela
	TecNome = tc.nextLine(); // pega o nome do tecnico do time a partir do teclado
	cl.setNomeTecnico(TecNome);
	System.out.println("Qual a posi��o do seu time no campeonato:"); //mensagem na tela
	pos=tc.nextInt(); // pega a posicao do time a partir do teclado 
	System.out.println("classificando......"); //mensagem na tela
	cl.ClassificaPos(pos); // chamada do metodo de classificar a posi��o do time passando a posi��o
	cl.setPosicao(pos);// chamada do metodo set para posi��o do time
	System.out.println("Time:" + "\n"+ cl.getNomeTime() +  "\n"+ "Tecnico: " + "\n" + cl.getNomeTecnico() + " � posi��o :" +  "\n"+ cl.getPosicao()); //impress�o dos resultados obtidos 
	//atraves dos metodos getters
	tc.close();// fechamento do objeto teclado

	} // fim da classe

} //fim do programa
