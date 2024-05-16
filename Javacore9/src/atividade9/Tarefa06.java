package atividade9;

import java.util.Scanner;

public class  Tarefa06 {
	public static void main(String[] args) {

		float numero;
		int valoresLidos = 0;
		float soma = 0;
		float media = 0;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Digite um valor ");
			numero = sc.nextFloat();

			valoresLidos = valoresLidos + 1;
			soma = numero + soma;
			media = soma / valoresLidos;

			if (numero <= 0) {
				valoresLidos = valoresLidos - 1;
				soma = soma - (+numero);
				media = soma / valoresLidos;

				if (valoresLidos == 0) {
					media = 0;
				}

			}

		} while (numero >= 0);

		System.out.println("Valores Lidos " + (valoresLidos));
		System.out.println("Soma " + soma);
		System.out.println("Média " + media);
		sc.close();

	}

}
