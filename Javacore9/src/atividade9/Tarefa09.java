package atividade9;

import java.util.Scanner;

public class  Tarefa09 {
	public static void main(String[] args) {

		int valor, maiorValor = 0, menorValor = 0;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.print("Digite um valor: ");
			valor = sc.nextInt();

			if (valor > maiorValor) {
				maiorValor = valor;
			} else {
				menorValor = valor;
			}

		} while (valor >= 0);

		System.out.println(maiorValor);
		System.out.println(menorValor);

		sc.close();

	}

}
