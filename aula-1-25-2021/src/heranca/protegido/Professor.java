package heranca.protegido;

public class Professor extends Pessoa {

	private double salario;

	public void imprimeInformacoesDoProfessor() {
		System.out.println("Informa��es do Professor: "+ this.getNome());
		System.out.println("CPF: "+ this.getCpf());
		System.out.println("Salario: "+ this.salario);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
