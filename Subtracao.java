package Aula4_2;

public class Subtracao {
	int a, b;
	int operacaoSubtracao(int num1, int num2) {
		int sub;
		if(num2>num1) {
			System.out.println("inverti num1 e num 2");
			sub = num2-num1;
		} else {
			sub= num1-num2;
		}
		
		return sub; 
		}

}
