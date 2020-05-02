package program;

import java.util.Scanner;
import util.Cotacao;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a contação do dólar: ");
		double cot = sc.nextDouble();
		System.out.print("Insira o valor a ser convertido: ");
		double valor = sc.nextDouble();
		
		System.out.printf("\nValor convertido para reais: %.2f", Cotacao.converter(valor, cot));
		
		sc.close();
	}
}