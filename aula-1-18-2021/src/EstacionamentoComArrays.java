
public class EstacionamentoComArrays {

	public static void main(String[] args) {
		
		/* Sistema de estacionamento com 15 vagas*/
		
		String[] vagas = new String[5];
		String[] clientes = new String[5];
		
		vagas[0] = "Vaga do setor Laranja - 01";
		vagas[1] = "Vaga do setor Laranja - 02";
		vagas[2] = "Vaga do setor Laranja - 03";
		vagas[3] = "Vaga do setor Laranja - 04";
		vagas[4] = "Vaga do setor Laranja - 05";
		
		clientes[0] = "Josias Filomeno";
		clientes[1] = "Maria Judite";
		clientes[2] = "Carlos Emanuel";
		clientes[3] = "Joao Ricardo";
		clientes[4] = "Jose Eduardo";
		
		System.out.println("O cliente " + clientes[0] + " esta em " + vagas[3]);
		System.out.println("O cliente " + clientes[1] + " esta em " + vagas[0]);
		System.out.println("O cliente " + clientes[2] + " esta em " + vagas[1]);
		System.out.println("O cliente " + clientes[3] + " esta em " + vagas[4]);
		System.out.println("O cliente " + clientes[4] + " esta em " + vagas[2]);

	}

}
