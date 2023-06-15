package Program;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor?");
		int n = leia.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = leia.nextDouble();

		}

		double soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		System.out.printf("MEDIA DO VETOR = %.3f\n", soma / n);

		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] <= 10) {
				System.out.println(vetor[i]);

			}
		}

		leia.close();
	}

}
