package orientacao_obj;
import java.util.*;
public class MainExpoente {

	public static void main(String[] args) {
	double base, e;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um valor para base e o expoente: ");
		base =teclado.nextDouble();
		e= teclado.nextDouble();
		System.out.println("O resultado é:"+ Expoente.elevar(base));
		System.out.println("O resultado é:"+ Expoente.elevar(base,e));
		teclado.close();
	}

}
