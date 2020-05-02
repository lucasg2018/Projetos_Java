package program;

import java.util.Scanner;
import entities.Produto;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de produtos a serem adicionados: ");
		int n = sc.nextInt();
		
		Produto[] produto = new Produto[n]; 
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			
			produto[i] = new Produto(nome, preco);
		}
		
		double soma = 0.0;
		for(int i = 0; i < n; i++) {
			soma += produto[i].getPreco();
		}
		
		double media = soma / n;
		System.out.printf("Average: %.2f", media);
		sc.close();
	}
}