import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main(String[] args) {
		
		 // Fa�a a implementa��o do Jogo Pedra, Papel e Tesoura (Jokemp�). O algoritmo dever� perguntar qual � a escolha do jogador 1 (Pedra [pe], Papel [pa], Tesoura [t]) e dever� fazer o mesmo para o jogador 2. No final da execu��o o algoritmo dever� dizer qual � o jogador vencedor ou se houve empate.

	      Scanner in = new Scanner(System.in);

	      final String pedra = "pe";
	      final String papel = "pa";
	      final String tesoura = "t";



	      System.out.println("Vamos jogar pedra (pe), papel (pa), tesoura (t)!");

	      System.out.println("Insira a escolha do jogador 1");
	      String escolhaJogador1 = in.next();

	      if (!(escolhaJogador1.equals(pedra) || escolhaJogador1.equals(papel) || escolhaJogador1.equals(tesoura))) {
	        System.out.println("O jogador 1 n�o escolheu uma op��o v�lida");
	        System.exit(0);
	      }

	      System.out.println("Insira a escolha do jogador 2");
	      String escolhaJogador2 = in.next();

	      if (!(escolhaJogador2.equals(pedra) || escolhaJogador2.equals(papel) || escolhaJogador2.equals(tesoura))) {
	        System.out.println("O jogador 2 n�o escolheu uma op��o v�lida");
	        System.exit(0);
	      }

	      if (escolhaJogador1.equals(escolhaJogador2)) {
	        System.out.println("Houve empate");
	        System.exit(0);
	      }


	      switch(escolhaJogador1) {
	        case pedra:
	          if (escolhaJogador2.equals(tesoura)) {
	            System.out.println("Vit�ria do jogador 1, pedra vence tesoura!");
	          } else if (escolhaJogador2.equals(papel)) {
	            System.out.println("Vit�ria do jogador 2, papel vence pedra!");
	          }
	          break;
	        case papel:
	          if (escolhaJogador2.equals(pedra)) {
	            System.out.println("Vit�ria do jogador 1, papel vence pedra!");
	          } else if (escolhaJogador2.equals(tesoura)) {
	            System.out.println("Vit�ria do jogador 2, tesoura vence papel!");
	          }
	          break;
	        case tesoura:
	          if (escolhaJogador2.equals(papel)) {
	            System.out.println("Vit�ria do jogador 1, tesoura vence papel!");
	          } else if (escolhaJogador2.equals(pedra)) {
	            System.out.println("Vit�ria do jogador 2, pedra vence tesoura!");
	          }
	          
	          break;
	   
	      }
	      
	      in.close();
	      
	    }

	}
