package resolucaoExercicios.classes.exercicio02;

import java.util.ArrayList;

import resolucaoExercicios.classes.exercicio01.Pessoa;

public class Agenda {

	private ArrayList<Pessoa> pessoas;
	
	public Agenda() {
		this.pessoas = new ArrayList<Pessoa>();
		
	}
	
	public void armazenaPessoa(Pessoa pessoa) {
		this.pessoas.add(pessoa);
		
	}
	
	public void removePessoa(String nome) {
		int posicaoAgendaPessoa = this.buscaPessoa(nome);
		this.pessoas.remove(posicaoAgendaPessoa);
		
	}
	
	public int buscaPessoa(String nome) {
		
//		informa em que posi��o da agenda est� a pessoa
		
		int posicaoAgendaPessoa = 0;
		for (int indicePessoaAgenda = 0; indicePessoaAgenda < this.pessoas.size(); indicePessoaAgenda++) {
			if(this.pessoas.get(indicePessoaAgenda).getNome() == nome) {
				posicaoAgendaPessoa = indicePessoaAgenda;
				break;
				
			}
		}
		return posicaoAgendaPessoa;
	}
	
	public void imprimeAgenda() {
		
//		imprime os dados de todas as pessoas da agenda
		
		for (int indicePessoaAgenda = 0; indicePessoaAgenda < this.pessoas.size(); indicePessoaAgenda++) {
			this.pessoas.get(indicePessoaAgenda).imprimeDados();
			System.out.println("-----------------------------------------------------");
			
		}
	}
	
	public void imprimePessoa(int index) {
//		imprime os dados da pessoa que est� na posi��o "i" da agenda.
		
		Pessoa pessoa = this.pessoas.get(index);
		pessoa.imprimeDados();
	}
	
}
