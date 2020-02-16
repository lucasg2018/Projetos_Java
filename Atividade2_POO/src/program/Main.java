package program;

import java.util.Scanner;
import entities.Produto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		
		System.out.println("Informe o nome do produto:");
		produto.nome = sc.next();
		System.out.println("Informe o preço do produto:");
		produto.preco = sc.nextDouble();
		System.out.println("Insira a quantidade:");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println(produto.toString());
		
		System.out.print("Informe a quantidade a ser adicionada:");
		int quant = sc.nextInt();
		produto.AddProduto(quant);
		
		System.out.println();
		System.out.println(produto.toString());
		
		sc.close();
	}
}