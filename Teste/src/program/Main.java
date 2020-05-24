package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double pedagio = 300;
		
		System.out.print("Informe a quantidade de dias úteis: ");
		int diasU = ler.nextInt();
		System.out.print("Informe a quantidade de dias não úteis: ");
		int diasNU = ler.nextInt();

		double valNU = pedagio / ((diasU * 0.66) + diasNU);
		double valU = valNU * 0.66;
		
		System.out.printf("Valor do pedágio em dias úteis: %.2f reais.", valU);
		System.out.printf("\nValor do pedágio em dias não úteis: %.2f reais.", valNU);
		
		ler.close();
	}
}
