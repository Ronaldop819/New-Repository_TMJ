package resolucaoExercicios.classes.exercicio03;

public class TestaElevador {

	public static void main(String[] args) {
		int capacidadeElevador = 20;
		int totalDeAndares = 6;
		Elevador elevador = new Elevador(totalDeAndares, capacidadeElevador);

		System.out.println("Elevador criado com "+ elevador.getCapacidade() + " de capacidade");
		System.out.println("Total de andares do predio:" + elevador.getTotalDeAndares());
		System.out.println("Total de pessoas presente no elevador no momento da cria��o: "+ elevador.getTotalPessoasPresentes());
		System.out.println("Andar em que o elvador foi criado: "+ elevador.getAndarAtual());

		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		// esses n�o v�o pode entrar
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();

		System.out.println("Total de pessoas presente: "+ elevador.getTotalPessoasPresentes());

		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();

		System.out.println("Andar atual do elevador: " + elevador.getAndarAtual());

		elevador.desce();
		elevador.desce();
		System.out.println("Andar atual do elevador: " + elevador.getAndarAtual());
		elevador.desce();
		elevador.desce();
		elevador.desce();
		elevador.desce();
		elevador.desce();

		System.out.println("Andar atual do elevador: " + elevador.getAndarAtual());

	}
}
	
