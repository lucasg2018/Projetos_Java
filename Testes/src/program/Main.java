package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double mesJ = 0, mesF = 0, mesM = 0, mesA = 0;

		for (int i = 1; i <= 6; i++) {
			System.out.printf("\n%dº Veículo\n", i);
			System.out.print("Informe o valor do carro: ");
			double valor = ler.nextDouble();
			ler.nextLine();
			System.out.print("Informe a placa do carro(KKK-1234): ");
			String placa = ler.nextLine();

			String letra = placa.substring(7, 8);

			if (letra.equals("1") || letra.equals("2") || letra.equals("3")) {
				System.out.println("O mês de pagamento é Janeiro!");
				mesJ += valor * 0.1;
			} else if (letra.equals("4") || letra.equals("5") || letra.equals("6")) {
				System.out.println("O mês de pagamento é Fevereiro!");
				mesF += valor * 0.1;
			} else if (letra.equals("7") || letra.equals("8") || letra.equals("9")) {
				System.out.println("O mês de pagamento é Março!");
				mesM += valor * 0.1;
			} else {
				System.out.println("O mês de pagamento é Abril!");
				mesA += valor * 0.1;
			}
		}
		
		System.out.print("\nTotal arrecadado no mês de Janeiro: " + mesJ + " Reais");
		System.out.print("\nTotal arrecadado no mês de Fevereiro: " + mesF + " Reais");
		System.out.print("\nTotal arrecadado no mês de Março: " + mesM + " Reais");
		System.out.print("\nTotal arrecadado no mês de Abril: " + mesA + " Reais");
		System.out.println("\nTotal geral: " + (mesJ + mesF + mesM + mesA) + " Reais");
		
		ler.close();
	}
}
