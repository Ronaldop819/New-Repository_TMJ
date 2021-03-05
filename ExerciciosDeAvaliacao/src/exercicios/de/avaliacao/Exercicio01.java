package exercicios.de.avaliacao;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Pais pais = new Pais("BRA", "Brasil", 8514.876, 2400000.0);
		Pais pais2 = new Pais("WAK", "Wakanda", 4000.500, 400000.0);
		
		System.out.println("Informa��es do " + pais.getNome() );
		System.out.println("Codigo ISO: " + pais.getCodigoISO());
		System.out.println("Dimens�o km2: " + pais.getDimensao());
		System.out.println("Popula��o: " + pais.getPopulacao());
		
		System.out.println("Informa��es do " + pais2.getNome() );
		System.out.println("Codigo ISO: " + pais2.getCodigoISO());
		System.out.println("Dimens�o km2: " + pais2.getDimensao());
		System.out.println("Popula��o: " + pais2.getPopulacao());
		
		System.out.println("Os paises s�o iguais? " + pais.verificaIgualdade(pais2));
		System.out.println("Os paises s�o iguais? " + pais2.verificaIgualdade(pais));
		
		System.out.println("Densidade populacional de "+ pais.getNome() + " � " + pais.calculaDensidadePopulacional());
		System.out.println("Densidade populacional de "+ pais2.getNome() + " � " + pais2.calculaDensidadePopulacional());

	}

}
