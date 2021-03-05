import java.util.Scanner;

public class Exercise04 {
	
	public static double calculaPercentualX(double tDeElei, double totalX) {
		
		double percentual = totalX * 100 / tDeElei;
		return percentual;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o total de votos");
		double totalVotos = scanner.nextDouble();
		
		System.out.println("Digite o total de votos em branco");
		double totalVotosBrancos = scanner.nextDouble();
		
		System.out.println("Digite o total de votos nulos");
		double totalVotosNulos = scanner.nextDouble();
		
		System.out.println("Digite o total de votos validos");
		double totalVotosValidos = scanner.nextDouble();
		
		System.out.println("A quantidade total de votos �: " + totalVotos);
		
		System.out.println("A quantidade total de votos em branco �: " + totalVotosBrancos);
		
		System.out.println("A quantidade total de votos em nulos �; " + totalVotosNulos);
		
		System.out.println("A quantidade de votos validos �: " + totalVotosValidos);
		
		double percentualVotosBrancos = Exercise04.calculaPercentualX(totalVotos, totalVotosBrancos);
		
		double percentualVotosNulos = Exercise04.calculaPercentualX(totalVotos, totalVotosNulos);
		
		double percentualVotosValidos = Exercise04.calculaPercentualX(totalVotos, totalVotosValidos);
		
		System.out.println("------------");
		
		System.out.println("O percentual total de votos em branco �: " + String.format("%.2f",percentualVotosBrancos));
		
		System.out.println("O percentual total de votos nulos �: " + String.format("%.2f", percentualVotosNulos));
		
		System.out.println("O percentual total de votos validos �: " + String.format("%.2f", percentualVotosValidos));
		
		
		scanner.close();
	}

}
