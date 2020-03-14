package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final double multa = 0.004, desconto = 0.05;
		double total = 0, juros;
		int vencimento = 5;

		System.out.print("Informe o valor da parcela: ");
		double valP = ler.nextDouble();
		System.out.print("Informe o dia do pagamento: ");
		int pagamento = ler.nextInt();

		if (vencimento < pagamento) {
			juros = ((pagamento - vencimento) * (valP * multa)) ;
			System.out.println("\nDias de atraso: " + (pagamento - vencimento));
			System.out.println("O juros: " + juros);
			total = valP + juros;
		} else {
			System.out.println("\nSem atrasos!");
			System.out.println("Desconto: " + (valP * desconto));
			total = valP - (valP * desconto);
		}

		System.out.println("Valor total do pagamento: " + total);

		ler.close();
	}
}
