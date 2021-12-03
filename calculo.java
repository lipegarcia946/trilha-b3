package aula2;
import java.util.*;
public class calculo {

	public static void main(String[] args) {
	 int op, num1, num2, resultado; 
	 System.out.println("1- adicao");
	 System.out.println("2- subtracao");
	 System.out.println("3- Multiplicao");
	 System.out.println("4- divisao");
	 Scanner teclado = new Scanner(System.in);
	 System.out.println("digite um valor pra calcular:");
	 num1 = teclado.nextInt();
	 System.out.println("digite outro valor pra calcular:");
	 num2 = teclado.nextInt();
	 System.out.println("digite uma opcao para realizar:");
	 op = teclado.nextInt();
	 switch (op){
	 case 1:
		 System.out.println("Somando...");
		 resultado = num1 + num2;
		 System.out.println("o resultado da operção foi: " + resultado);
		 break;
	 case 2:
		 System.out.println("Subtraindo...");
		 resultado = num1 - num2;
		 System.out.println("o resultado da operção foi: " + resultado);
		 break;
	 case 3:
		 System.out.println("Multiplicando...");
		 resultado = num1 * num2;
		 System.out.println("o resultado da operção foi: " + resultado);
		 break;
	 case 4:
		 System.out.println("Dividindo.......");
		 resultado = num1 / num2;
		 System.out.println("o resultado da operção foi: " + resultado);
		 break;
	 
	 default:
		 System.out.println("opção invalida, digite valores de 1 a 4");
		 break;
		 
	}
	 teclado.close();

	}
}
	
