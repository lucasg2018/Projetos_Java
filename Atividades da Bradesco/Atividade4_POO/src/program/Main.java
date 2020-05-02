package program;

import java.util.Scanner;
import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Informe o nome do empregado:");
		funcionario.nome = sc.next();
		System.out.println("Informe o seu salário:");
		funcionario.salario = sc.nextDouble();
		System.out.println("Informe a taxa de imposto:");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println(funcionario.toString());
		
		System.out.println("Insira a porcentagem de incremento do salário:");
		double porcent = sc.nextDouble();
		funcionario.IncrementoS(porcent);
		
		System.out.println(funcionario.toString());
		
		sc.close();
	}
}