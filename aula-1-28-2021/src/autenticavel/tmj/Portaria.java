package autenticavel.tmj;

import java.util.Scanner;

public class Portaria {

	void autorizaEntrada(Autorizavel autorizavel) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite sua senha: ");
		int senha = scanner.nextInt();

		boolean ok = autorizavel.autoriza(senha);
		if (ok) {
			System.out.println("Voc� est� autorizado!");

		} else {
			System.out.println("Voc� n�o est� autorizado!");
			
		}
		
		scanner.close();

	}

}
