// exemplo do uso dos getters e setters
package orientacao_obj;
// a classe Futebol contem os abributos: nome do time,  nome do tecnico do time, (ambos tipo String) e a posi��o do time 
//no campeonato (tipo inteiro) 
public class Futebol {
	private 
	String nomeTime, nomeTecnico;
	int posicao;
	// declara��o dos m�todos sets ("para setar" colocar as informa��es) e os m�todos gets ("para pegar as informa��es")
	public String getNomeTime() { // pega o nome do time 
		return nomeTime;
	}
	public void setNomeTime(String nomeTime) { //seta o nome do time
		this.nomeTime = nomeTime;
	}
	public String getNomeTecnico() { //pega o nome do tecnico do time
		return nomeTecnico;
	}
	public void setNomeTecnico(String nomeTecnico) { // seta o nome do tecnico do time
		this.nomeTecnico = nomeTecnico;
	}
	public int getPosicao() {// pega a posi��o do time no campeonato
		return posicao;
	}
	public void setPosicao(int posicao) { //seta a posi��o do time no campeonato
		this.posicao = posicao; 
	}
	void ClassificaPos(int p) { // m�todo que classifica a o time no campeonato atrav�s da posi��o
		p=getPosicao();
		if (p==1) {
			System.out.println("Seu time � o lider do campeonato");
		} else if (p==2) {
			System.out.println("Seu time � o vice-lider do campeonato");
		}else if (p==3) {
			System.out.println("Seu time � o 3� no campeonato");
		} 	else if (p>=4 || p<=12 ) {
			System.out.println("Seu time est� na parte intermediaria da tabela no campeonato");
		} else if (p>=14 || p<= 19) {
			System.out.println("Seu Time esta na zona de rebaixamento");
		} else {
			System.out.println("Seu Time caiu");
		}
		
	}

}
