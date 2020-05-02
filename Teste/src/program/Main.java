package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double somaE = 0, somaA = 0;
		
		System.out.print("Informe a quantidade de dias que deseja saber a m�dia de consumo: ");
		int n = ler.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("\n%d� dia", i + 1);
			System.out.printf("\nInforme o consumo de energia(Kw): ");
			double consE = ler.nextDouble();
			System.out.printf("Informe o consumo de �gua(Litros): ");
			double consA = ler.nextDouble();
			
			somaE += consE;
			somaA += consA;
		}
		
		double mediaE = somaE / n;
		double mediaA = somaA / n;
		
		System.out.println("\nA m�dia de consumo de energia � de " + mediaE + " quilowatts.");
		System.out.println("A m�dia de consumo de �gua � de " + mediaA + " litros.");
		
		ler.close();
	}
}
