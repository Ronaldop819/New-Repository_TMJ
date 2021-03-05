package pacote.princeso;

/* vaga de estacionamento de um supermercado
 * somente 1 subsolo
 * no estacionamento do supermercado, 100 vagas
 * elas est�o dividas em 4 setores*/

public class Vaga {
	
//	Atributos
	int identificador;
	boolean ocupada;
	double area;
	String setor;
	String tipo;
	Placa placa;
	
//	M�todos construtor
	Vaga(String setor, int identificador) {
		this.setor = setor;
		this.identificador = identificador;
		System.out.println("Oi estou criando uma vaga no setor " + setor + " com ID " + identificador);
	}
	
 //	M�todos
	boolean estaOcupada() {
		return ocupada;
	}
	
	void ocupar(Placa placa) {
		this.placa = placa;
		this.ocupada = true;
		
	}
	
}
