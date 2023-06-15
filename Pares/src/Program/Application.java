package Program;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar?");
		int n = leia.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i = 0; i < vetor.length; i++ ) {
			System.out.print("Digite um numero: ");
			vetor[i] = leia.nextInt();
		}
		
		int cont = 0;
		
		System.out.println("NUMEROS PARES: ");
		for (int i = 0; i < vetor.length; i ++) {
			if ( vetor[i] % 2 == 0) {
				cont ++;
				System.out.print(vetor[i] + " ");
				
			}
		}
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + cont);

		leia.close();
	}

}
