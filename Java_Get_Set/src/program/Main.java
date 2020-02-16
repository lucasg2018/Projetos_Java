package program;

import java.util.Scanner;

import entities.Produto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o nome do produto:");
		String nome = sc.next();
		System.out.println("Insira o preço:");
		double preco = sc.nextDouble();
		System.out.println("Insira a quantidade:");
		int quantidade = sc.nextInt();	
		Produto p = new Produto(nome, preco, quantidade);
		
		p.setNome("teto");
		System.out.println(p.getNome());
		
		System.out.println();
		System.out.println(p.toString());
		
		System.out.println("\nInforme a quantidade a ser adicionada: ");
		int x = sc.nextInt();
		p.AddQuantidade(x);
		
		System.out.println();
		System.out.println("Dados atualizados:" + p.toString());
		
		System.out.println("\nInforme a quantidade a ser removida: ");
		x = sc.nextInt();
		p.RemoveQuantidade(x);
		
		System.out.println();
		System.out.println("Dados atualizados:" + p.toString());
		
		sc.close();
	}
}