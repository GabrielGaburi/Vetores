package Program;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos alunos serao digitados? ");
		int n = leia.nextInt();
		
		String [] nome = new String [n];
		double [] nota1 = new double [n];
		double [] nota2 = new double [n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do "+ (i + 1) + "o aluno:");
			nome[i] = leia.next();
			nota1[i] = leia.nextDouble();
			nota2[i] = leia.nextDouble();
			
		}
		
		double media = 0;
		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < n; i++) {
			media = (nota1[i] + nota2[i]) / 2;
			if (media > 6) {
				System.out.println(nome[i]);
			}
			
			
		}
			
		
		leia.close();
	}

}
