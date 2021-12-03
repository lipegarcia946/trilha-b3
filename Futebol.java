// exemplo do uso dos getters e setters
package orientacao_obj;
// a classe Futebol contem os abributos: nome do time,  nome do tecnico do time, (ambos tipo String) e a posição do time 
//no campeonato (tipo inteiro) 
public class Futebol {
	private 
	String nomeTime, nomeTecnico;
	int posicao;
	// declaração dos métodos sets ("para setar" colocar as informações) e os métodos gets ("para pegar as informações")
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
	public int getPosicao() {// pega a posição do time no campeonato
		return posicao;
	}
	public void setPosicao(int posicao) { //seta a posição do time no campeonato
		this.posicao = posicao; 
	}
	void ClassificaPos(int p) { // método que classifica a o time no campeonato através da posição
		p=getPosicao();
		if (p==1) {
			System.out.println("Seu time é o lider do campeonato");
		} else if (p==2) {
			System.out.println("Seu time é o vice-lider do campeonato");
		}else if (p==3) {
			System.out.println("Seu time é o 3º no campeonato");
		} 	else if (p>=4 || p<=12 ) {
			System.out.println("Seu time está na parte intermediaria da tabela no campeonato");
		} else if (p>=14 || p<= 19) {
			System.out.println("Seu Time esta na zona de rebaixamento");
		} else {
			System.out.println("Seu Time caiu");
		}
		
	}

}
