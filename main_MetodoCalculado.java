package aula4;
import java.util.*;
public class main_MetodoCalculado {
		public static void main(String[] args) {
			double nota1, nota2, media;
			String name;
			Scanner teclado = new Scanner (System.in);
			MetodoCalculado calc= new MetodoCalculado();
			System.out.println("Digite Seu nome:");
			name = teclado.next();
			
			calc.mostraNome(name);
			System.out.println("Digite a 1ª Nota:");
			nota1 = teclado.nextDouble();
			
			System.out.println("Digite a 2ª Nota:");
			nota2 = teclado.nextDouble();

			
			media = calc.calcMedia(nota1, nota2);
			System.out.println("A sua Media é:"+ media);
			
			teclado.close();

		}
}
