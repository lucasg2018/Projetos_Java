package application;

import java.util.Scanner;

import service.PrintService;

public class program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		PrintService<String> ps = new PrintService<>();
		
		
		System.out.print("How many values? ");
		int n = ler.nextInt();
		
		for (int i = 0; i < n; i++) {
			String value = ler.next();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("\nFirst: " + ps.first());
		
		ler.close();
	}
}
