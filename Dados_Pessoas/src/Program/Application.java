package Program;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao digitadas?");
		int n = leia.nextInt();
		
		double [] altura = new double [n];
		char [] sexo = new char [n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Altura da "+ (i+1) +"a pessoa:");
			altura[i] = leia.nextDouble();
			System.out.println("Sexo da "+ (i+1) +"a pessoa:");
			sexo[i] = leia.next().charAt(0);
			
		}
		
		double menor = altura[0];
		double maior = altura[0];
		
		for (int i = 0; i < n; i ++) {
			if ( menor < altura[i]) {
				menor = altura[i];
				System.out.printf("Menor altura = %.2f\n", menor );
			}
			if (maior > altura[i] ) {
				maior = altura[i];
				System.out.printf("Maior altura = %.2f\n", maior );
			}
		}
		
		double soma = 0;
		int cont1 = 0;
		int cont2 = 0;
		for (int i = 0; i < n; i++) {
			if (sexo[i] == 'f') {
				soma += altura[i];
				cont1++;		
			}
			else {
				cont2++;
			}
			
			
		}
		
		System.out.printf("Media das alturas das mulheres = %.2f\n", soma / cont1);
		System.out.print("Numero de homens = " + cont2);
		leia.close();
	}

}
