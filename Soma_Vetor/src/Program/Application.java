package Program;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digíte a quantidade de números a serem testados: ");
		int n = leia.nextInt();
		double[] vetor = new double[n];
		
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.println("Digíte um número: ");
			vetor[i] = leia.nextDouble();
			
		}
		
		System.out.print("VALORES: ");
		
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.printf("%.2f ", vetor[i] );
		}
		
		double soma = 0;
		
		for (int i = 0; i < vetor.length;i++) {
			
			soma += vetor[i];
		}
		System.out.println();
		System.out.printf("SOMA: %.2f", soma );
		System.out.println();
		System.out.printf("MÉDIA: %.2f", soma / n);
		
		leia.close();
	}

}
