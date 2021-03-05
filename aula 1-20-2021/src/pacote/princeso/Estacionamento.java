package pacote.princeso;

public class Estacionamento {

	public static void main(String[] args) {
		
		Vaga vaga0 = new Vaga("Amarelo", 1);
		Vaga vaga1 = new Vaga("Azul", 2);
		Vaga vaga2 = new Vaga("Laranja", 3);
		Vaga vaga3 = new Vaga("Azul Claro", 4);
		Vaga vaga4 = new Vaga("Vermelho", 5);
		
		Placa placa1 = new Placa("ABC-6D66");
		
		vaga0.area = 15.5;
		vaga1.tipo = "PCD";
		vaga2.tipo = "Gestante";
		vaga3.tipo = "Idoso";
		vaga4.tipo = "Moto";
		
		vaga0.ocupar(placa1);
		
		if (vaga0.estaOcupada()) {
			System.out.println("Est� ocupada");
			
		} else {
			System.out.println("Est� vaga");
		}

	}

}
