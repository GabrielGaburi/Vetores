package Program;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.print("Dígite a quantidade de Pessoas: ");
		int n = leia.nextInt();

		entities[] vetor = new entities[n];

		for (int i = 0; i < n; i++) {

			System.out.println("Digíte o Nome da " + (i + 1) + "º pessoa: ");
			String nome = leia.next();
			System.out.println("Digíte a idade da " + (i + 1) + "º pessoa: ");
			int idade = leia.nextInt();
			System.out.println("Digíte a altura da " + (i + 1) + "º pessoa: ");
			double altura = leia.nextDouble();
			vetor[i] = new entities(nome, idade, altura);
		}
		
		for (int i = 0; i < n; i++) {
			
			System.out.println("Dados da " + (i + 1) +  "º pessoa:" );
			System.out.println("Nome: " + vetor[i].getNome());
			System.out.println("Idade: " + vetor[i].getIdade());
			System.out.printf("Altura: %.2f%\n ", vetor[i].getAltura());
			
		}
		
		double somaAltura = 0;
		
		for (int i = 0; i < n; i++) {
			somaAltura += vetor[i].getAltura();
		}
		
		System.out.printf("Altura média: %.2f%n", somaAltura / n);
		
		int cont = 0;
		double porcentagemMenores = 0;
		
		for (int i = 0; i < n; i++) {
			if (vetor[i].getIdade() < 16) {
				cont += 1;
			}
		}
		
		porcentagemMenores =  (double) cont /  n * 100;
		System.out.println("Pessoas com menos de 16 anos: "+ String.format("%.2f", porcentagemMenores) + "%");
		System.out.println("Nome dos menores de idade: ");
		for (int i = 0; i < n; i++) {
			if (vetor[i].getIdade() < 16) {
				System.out.println(vetor[i].getNome());
			}
			
		}
		


		leia.close();
	}

}
