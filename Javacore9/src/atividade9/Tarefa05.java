package atividade9;

import java.util.Scanner;

public class  Tarefa05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = 0;
		int fatorial = 1;
		int contadora = 1;
		int contadora2 = 1;
		int soma;

		do {
			System.out.println("Digite o valor numero: " + contadora);
			numero = sc.nextInt();

			
			do {

				fatorial = fatorial * contadora2;
				soma = fatorial;

				contadora2++;

			} while (contadora2<=numero);

			
			System.out.println(soma);
			
			contadora++;
		} while (contadora <= 15);

		sc.close();
	}

}
