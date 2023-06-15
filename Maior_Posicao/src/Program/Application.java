package Program;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar?");
		int n = leia.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = leia.nextDouble();
		}

		double max = vetor[0];
		int posMaior = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > max) {
				max = vetor[i];
				posMaior = i;

			}
		}

		System.out.println("MAIOR VALOR = " + max);
		System.out.println("POSICAO DO MAIOR VALOR =  " + posMaior);

		leia.close();
	}

}
