package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double somaE = 0, somaA = 0;
		
		System.out.print("Informe a quantidade de dias que deseja saber a média de consumo: ");
		int n = ler.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("\n%dº dia", i + 1);
			System.out.printf("\nInforme o consumo de energia(Kw): ");
			double consE = ler.nextDouble();
			System.out.printf("Informe o consumo de água(Litros): ");
			double consA = ler.nextDouble();
			
			somaE += consE;
			somaA += consA;
		}
		
		double mediaE = somaE / n;
		double mediaA = somaA / n;
		
		System.out.println("\nA média de consumo de energia é de " + mediaE + " quilowatts.");
		System.out.println("A média de consumo de água é de " + mediaA + " litros.");
		
		ler.close();
	}
}
