package exercicios06;

import java.util.Scanner;

//7. Efetuar a leitura de quatro números inteiros e apresentar os números que são divisíveis por 2 e 3.

public class Exercicio07 {

	public static void main(String[] args) {
		int numeroA, numeroB, numeroC, numeroD;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		numeroA = sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		numeroB = sc.nextInt();
		System.out.print("Digite o terceiro valor: ");
		numeroC = sc.nextInt();
		System.out.print("Digite o quarto valor: ");
		numeroD = sc.nextInt();

		if (numeroA % 2 == 0 || numeroA % 3 == 0) {
			System.out.println(numeroA);
		}
		if (numeroB % 2 == 0 || numeroB % 3 == 0) {
			System.out.println(numeroB);
		}
		if (numeroC % 2 == 0 || numeroC % 3 == 0) {
			System.out.println(numeroC);
		}
		if (numeroD % 2 == 0 || numeroD % 3 == 0) {
			System.out.println(numeroD);
		}
		sc.close();
	}
}