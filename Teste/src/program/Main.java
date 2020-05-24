package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double pedagio = 300;
		
		System.out.print("Informe a quantidade de dias �teis: ");
		int diasU = ler.nextInt();
		System.out.print("Informe a quantidade de dias n�o �teis: ");
		int diasNU = ler.nextInt();

		double valNU = pedagio / ((diasU * 0.66) + diasNU);
		double valU = valNU * 0.66;
		
		System.out.printf("Valor do ped�gio em dias �teis: %.2f reais.", valU);
		System.out.printf("\nValor do ped�gio em dias n�o �teis: %.2f reais.", valNU);
		
		ler.close();
	}
}
