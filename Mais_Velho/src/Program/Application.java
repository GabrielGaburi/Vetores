package Program;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Quantas pessoas voce vai digitar? "); 
		int n = leia.nextInt();
		
		String [] vetorNome = new String [n];
		int [] vetorIdade = new int [n];
		
		
		
		for ( int i = 0; i < n; i++) {
			System.out.println("Dados da "+ (i + 1) + " a pessoa: ");
			System.out.print("Nome: ");
			vetorNome[i] = leia.next();
			System.out.println("Idade");
			vetorIdade[i] = leia.nextInt();
			
			
		}
		
		int max = vetorIdade[0];
		int posMaior = 0;
		
		
		for (int i = 0; i < n; i++) {
			if (vetorIdade[i] > max) {
				max = vetorIdade[i];
				posMaior = i;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + vetorNome[posMaior]);
		
		leia.close();
	}

}
