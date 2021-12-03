// Main que executa as classes <processaMetodo e a Classe Mensagem> 
package aula4;
import java.util.*;
public class Main_processa_Mensagem {

	public static void main(String[] args) {
	ClasseMensagem msg = new ClasseMensagem();
	processaMetodo procm = new processaMetodo();
	int AnoAtual = 2021, AnoDeNasc,idade;
	System.out.println("Você tem uma notificação...........");
	msg.mensagem();
	System.out.println("***********************************************************************");
	Scanner teclado = new Scanner (System.in );
	System.out.println("Olá Qual o seu nomme? :");
	String Name = teclado.next();
	procm.recebeNome(Name);
	System.out.println("Para Calcular sua idade digite o Ano do seu Nascimento: ");
	AnoDeNasc = teclado.nextInt();
	idade = procm.calcIdade(AnoAtual, AnoDeNasc);
	System.out.println("sua idade é: "+ idade + "anos");
	teclado.close();

	}

}
