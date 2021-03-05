package resolucaoExercicios.arrays;

import java.util.Scanner;

public class Exercicios02array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Escolha a quantidade de numeros a armezenar: ");
		int quantidadeDeNumeros = scanner.nextInt();
		int quantidadeDeNumerosNegativos = 0;
		int[] numeros = new int[quantidadeDeNumeros];

		for (int indiceNumeros = 0; indiceNumeros < numeros.length; indiceNumeros++) {
			System.out.print("Digite o numero "+ (indiceNumeros + 1) + ": ");
			numeros[indiceNumeros] = scanner.nextInt();
		}

		for (int indiceNumeros = 0; indiceNumeros < numeros.length; indiceNumeros++) {
			if(numeros[indiceNumeros] < 0) {
				quantidadeDeNumerosNegativos += 1;
			}
		}

		System.out.println(quantidadeDeNumerosNegativos + " numeros negativos foram armazenados");

		scanner.close();
	}
}
	

