package atividade9;

import java.util.Scanner;

public class Tarefa10 {

	public static void main(String[] args) {

		int numero1, numero2, acumuladora, contadora = 1, soma = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("primeiro numero: ");
		numero1 = sc.nextInt();
		System.out.println("dividido por: ");
		numero2 = sc.nextInt();

		do {
			soma++;
			acumuladora = numero2 * contadora;

			contadora++;

		} while (acumuladora <= numero1);

		System.out.println(soma);

		sc.close();
	}

}
