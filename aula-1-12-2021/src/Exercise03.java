
import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Esse algoritimo calcula a �rea de um ret�ngulo");
		
		System.out.println("Por favor digite a base do ret�ngulo");
		float base = scanner.nextFloat();
		
		System.out.println("Por favor digite a altura do ret�ngulo");
		float altura = scanner.nextFloat();
		
		float area = base * altura;
		
		System.out.println("A �rea do ret�ngulo �: " + area);
		
		scanner.close();
	}

}

