package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		List<Contribuinte> c = new ArrayList<>();

		System.out.print("Insira o número de pagadores de impostos: ");
		int n = ler.nextInt();
		ler.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.printf("\nPagador de imposto #%d dados:", i);
			System.out.print("\nPessoa Física ou Jurídica(f/j)? ");
			char esc = ler.nextLine().charAt(0);
			System.out.print("Nome: ");
			String nome = ler.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = ler.nextDouble();
			if (esc == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastosSaude = ler.nextDouble();
				ler.nextLine();

				c.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			} else {
				System.out.print("Número de funcionários: ");
				int numeroFunc = ler.nextInt();
				ler.nextLine();
				
				c.add(new PessoaJuridica(nome, rendaAnual, numeroFunc));
			}
		}
		
		double total = 0;
		System.out.println("\nTAXAS DE IMPOSTOS:");
		
		for (Contribuinte contribuinte : c) {
			System.out.printf("%s: $ %.2f%n",contribuinte.getNome(), contribuinte.imposto());
			total += contribuinte.imposto();
		}
		
		System.out.println("Impostos totais: " + String.format("%.1f", total));		

		ler.close();
	}
}