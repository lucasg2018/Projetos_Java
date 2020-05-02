package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Colaborador;
import java.util.stream.Collector;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Enter with is number of employee: ");
		int n = ler.nextInt();
		List<Colaborador> colaborador = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("\nEmployee #%d", i);
			System.out.print("\nEnter the id of employee: ");
			int id = ler.nextInt();
			System.out.print("Enter the name of employee: ");
			ler.nextLine();
			String name = ler.nextLine();
			System.out.print("Enter the salary of employee: ");
			double salary = ler.nextDouble();
			
			colaborador.add(new Colaborador(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int find = ler.nextInt();
		
		for (Colaborador col : colaborador) {
			if(col.getId() == find) {
				System.out.println("\nEnter the percentage: ");
				double incremento = ler.nextDouble();
				
				col.incremento(incremento);
			}
		}
		
		System.out.println(colaborador.toString());

		ler.close();
	}
}