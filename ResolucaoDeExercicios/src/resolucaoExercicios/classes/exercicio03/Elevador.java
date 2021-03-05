package resolucaoExercicios.classes.exercicio03;

/*
 * Crie uma classe denominada Elevador para armazenar as informa��es de um elevador dentro de um pr�dio. 
 * A classe deve armazenar o andar atual (t�rreo = 0), total de andares no pr�dio (desconsiderando o t�rreo), 
 * capacidade do elevador e quantas pessoas est�o presentes nele. 
 * A classe deve tamb�m disponibilizar os seguintes m�todos:
 * 
 * 	Inicializa : que deve receber como par�metros a capacidade do elevador e o total de andares no pr�dio (os elevadores sempre come�am no t�rreo e vazio);
	Entra : para acrescentar uma pessoa no elevador (s� deve acrescentar se ainda houver espa�o);
	Sai : para remover uma pessoa do elevador (s� deve remover se houver algu�m dentro dele);
	Sobe : para subir um andar (n�o deve subir se j� estiver no �ltimo andar);
	Desce : para descer um andar (n�o deve descer se j� estiver no t�rreo);
 * @author manoe*/

public class Elevador {

	private int andarAtual;
	private int totalDeAndares;
	private int capacidade;
	private int totalPessoasPresentes;
	
	
	public Elevador(int totalDeAndares, int capacidadeElevador) {
		
		this.andarAtual = 0;
		this.totalPessoasPresentes = 0;
		this.totalDeAndares = totalDeAndares - 1;
		this.capacidade = capacidadeElevador;
		
	}
	
	public void entrar() {
		if (this.totalPessoasPresentes < this.capacidade) {
			this.totalPessoasPresentes += 1;
			System.out.println("Entrando");
			
		} else {
			System.out.println("Capacidade alcan�ada " + this.capacidade + ", n�o pode mais entrar");
			
		}
	}
	
	public void sair() {
		if (this.totalPessoasPresentes > 0) {
			this.totalPessoasPresentes -= 1;
			System.out.println("Saindo");
			
		} else {
			System.out.println("N�o h� nenhuma pessoa presente para remover");
			
		}
	}
	
	public void sobe() {
		if (this.andarAtual <= this.totalDeAndares) {
			this.andarAtual += 1;
			System.out.println("Subindo");
			
		} else {
			System.out.println("Elevador est� o �ltimo andar");
			
		}
	}
	
	public void desce() {
		if (this.andarAtual > 0) {
			this.andarAtual -= 1;
			System.out.println("Descendo");
			
		} else {
			System.out.println("Elevador est� no terreo");
			
		}
	}
	
	public int getAndarAtual() {
		return andarAtual;
		
	}
	
	public int getTotalDeAndares() {
		return totalDeAndares;
		
	}
	
	public int getCapacidade() {
		return capacidade;
		
	}
	
	public int getTotalPessoasPresentes() {
		return totalPessoasPresentes;
	}
	
	
	
}
