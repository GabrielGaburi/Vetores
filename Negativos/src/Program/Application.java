package Program;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digíte a quantidade de números a serem testados: ");
		int n = leia.nextInt();
		int[] vetor = new int[n];
		
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.println("Digíte um número: ");
			vetor[i] = leia.nextInt();
			
		}
		
		System.out.println("NÚMEROS NEGATIVOS: ");
		
		for (int i = 0; i < vetor.length; i++) {
			
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}

	}

}
