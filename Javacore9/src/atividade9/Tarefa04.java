package atividade9;

public class  Tarefa04 {
	public static void main(String[] args) {
		int quadro = 0;
		float acumulador = 0;
		float grao = 1;

		do {

			
			acumulador = acumulador + grao;
			grao = grao * 2;

			System.out.println(acumulador);
			quadro++;
		} while (quadro < 63);

		System.out.println(acumulador);


	}

}
