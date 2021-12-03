package aula2;

public class ExMatCarro {

	public static void main(String[] args) {
	String [] car_mod= {"Uno", "Clio", "Palio", "Kangoo", "Chevet", "Ferrari" };
	/*for(int i=0; i<6; i++) {
		//System.out.println("carro"+i+1 + "modelo " + car_mod[i]); errado
		System.out.println(i+1 + " º modelo " + car_mod[i]);
	}*/
	String [] nomes= {"Antonio","Camila","Felipe","Will", "Guilherme","Janara","Marcos","Wendel","Ricardo"};
	 int cont = 0;
	 int tam= nomes.length;
	 while (cont<tam+1) {
		 System.out.println(cont+1 + " º nome " + nomes[cont]);
		 cont++;
	 }

	}

}
