import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		System.out.println("Por favor digite um n�mero");
		Scanner in = new Scanner(System.in);
		int numero = in.nextInt();
		
		if (numero % 2 == 0) {
			
			System.out.println("� um n�mero par");
			
		} else {
			
			System.out.println("� um n�mero �mpar");
			
			in.close();
		}

	}

}
