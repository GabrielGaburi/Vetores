package Program;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor?");
		int n = leia.nextInt();
		int m = n;
		
		int [] vetorN = new int [n];
		int [] vetorM = new int [m];
		
		
		
		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < vetorN.length; i++) {
			vetorN[i] = leia.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < vetorM.length; i++) {
			vetorM[i] = leia.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		
		
		for (int i = 0; i < n; i ++) {
			System.out.println(vetorN[i] + vetorM[i]);
		}
		
		
		leia.close();
	}

}
