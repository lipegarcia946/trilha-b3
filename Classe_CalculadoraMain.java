package Aula4_2;
import java.util.*;
public class Classe_CalculadoraMain {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Adicao ad = new Adicao();
		Subtracao sb = new Subtracao();
		Multiplicacao mul = new Multiplicacao();
		Divisao div = new Divisao();
		int num1, num2, resp, op, i=0;
		System.out.println("Ola, seja bem vindo ao sistema de calculadora, por favor me diga as informa��es..............");
		System.out.println("digite um valor ");
		num1= teclado.nextInt();
		System.out.println("digite outro valor ");
		num2 = teclado.nextInt();
		do {
		System.out.println("escolha uma opera��o: 1 - Adicao, 2- subtra��o, 3 - multiplicacao e 4- divis�o");
		System.out.println("digite o numero da oper��o desejada:\n ");
		op = teclado.nextInt();
		switch (op) {
		case 1: 
			System.out.println("voce escolheu adi��o, somando......");
			resp = ad.operacaoSoma(num1, num2);
			System.out.printf("a Soma de: %d + %d = %d", num1,num2, resp);
			break;
		case 2: 
			System.out.println("voce escolheu subtra��o, subtraindo......");
			resp = sb.operacaoSubtracao(num1, num2);
			System.out.printf("a Subtra�ao de: %d- %d = %d", num1,num2, resp);
			break;
		case 3: 
			System.out.println("voce escolheu multiplica��o multiplicando......");
			resp = mul.operacaoMultiplicacao(num1, num2);
			System.out.printf("a multiplica��o de: %d X %d = %d", num1,num2, resp);
			break;
		case 4: 
			System.out.println("voce escolheu divis�o, Dividindo......");
			resp = div.operacaoDivisao(num1, num2);
			System.out.printf("a Divis�o de: %d / %d = %d", num1,num2, resp);
			break;
		default: 
			System.out.println("Ops, Voc� escolheu uma op��o invalida tente novamente com numeros de 1 a 4:");
			break;
		}
		i++;	
	} while(i!=op);
		teclado.close();

	}

}
