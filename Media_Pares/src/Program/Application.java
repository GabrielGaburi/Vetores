package Program;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor?");
		int n = leia.nextInt();
		
		int [] vetor = new int [n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = leia.nextInt();
		}
		
		double soma = 0;
		int cont = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
				cont++;
				
			}
		}
		if (soma == 0) {
			System.out.println("NENHUM NUMERO PAR ");
		}
		else {
			System.out.printf("MEDIA DOS PARES = %.2f", soma / cont);
		}
		leia.close();
	}

}
