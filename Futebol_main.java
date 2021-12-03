package orientacao_obj;// importação de pacotes
import java.util.*;;// importação da biblioteca
public class Futebol_main { // Classe da Função Main da classe Futebol

	public static void main(String[] args) {//Função Main da classe Futebol
	String TimeNome, TecNome; // declaração das variaves
	int pos;
	Scanner tc = new Scanner(System.in); //instacia do objeto pra fazer a leitura de dados do teclado pelo usuario 
	Futebol cl = new Futebol(); //instancia do objeto da classe futebol
	System.out.println("Digite o nome do seu time:"); //mensagem na tela
	TimeNome=tc.nextLine(); // pega o nome do time a partir do teclado
	cl.setNomeTime(TimeNome); // chamada do metodo set p/ o nome do time
	System.out.println("Qual o nome do tecnico do seu time:");//mensagem na tela
	TecNome = tc.nextLine(); // pega o nome do tecnico do time a partir do teclado
	cl.setNomeTecnico(TecNome);
	System.out.println("Qual a posição do seu time no campeonato:"); //mensagem na tela
	pos=tc.nextInt(); // pega a posicao do time a partir do teclado 
	System.out.println("classificando......"); //mensagem na tela
	cl.ClassificaPos(pos); // chamada do metodo de classificar a posição do time passando a posição
	cl.setPosicao(pos);// chamada do metodo set para posição do time
	System.out.println("Time:" + "\n"+ cl.getNomeTime() +  "\n"+ "Tecnico: " + "\n" + cl.getNomeTecnico() + " ª posição :" +  "\n"+ cl.getPosicao()); //impressão dos resultados obtidos 
	//atraves dos metodos getters
	tc.close();// fechamento do objeto teclado

	} // fim da classe

} //fim do programa
