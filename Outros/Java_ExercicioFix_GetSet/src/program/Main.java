package program;

import java.util.Scanner;

import entities.Conta;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();
		
		System.out.print("Insira o n�mero da conta: ");
		int numConta = sc.nextInt();
		System.out.print("Informe o nome do titular: ");
		String nome = sc.next();
		System.out.print("Deseja inserir um dep�sito incial S/N? ");
		char esc = sc.next().charAt(0);
		if(esc == 'S') {
			System.out.print("Insira o valor:");
			double deposito = sc.nextDouble();
			conta = new Conta(numConta, nome, deposito);
		}else {
			conta = new Conta(numConta, nome);
		}
		
		System.out.println();
		System.out.println(conta.toString());
		
		System.out.print("Insira o valor para dep�sito: ");
		double x = sc.nextDouble();
		conta.AddDeposito(x);
		
		System.out.println();
		System.out.println("Atualiza��o da " + conta.toString());
		
		System.out.print("\nInsira o valor desejado para realizar o saque: ");
		x = sc.nextDouble();
		conta.Saque(x);
		
		System.out.println();
		System.out.println("Atualiza��o da " + conta.toString());
		
		sc.close();
	}	
}