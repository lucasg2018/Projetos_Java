package program;

import java.util.Scanner;
import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("How many rooms will be rented?");
		int n = ler.nextInt();
		
		Pessoa[] aluga = new Pessoa[10];
		for (int i = 1; i <= n; i++) {
			System.out.printf("\nRent #%d%n", i);
			System.out.print("Name: ");
			ler.nextLine();
			String name = ler.nextLine();
			System.out.print("Email: ");
			String email = ler.nextLine();
			System.out.print("Room: ");
			int room = ler.nextInt();
			
			aluga[room] = new Pessoa(name, email);
		}
		
		System.out.print("Busy rooms: \n");
		
		for (int i = 0; i < aluga.length; i++) {
			if(aluga[i] != null) {
				System.out.println(i + ": "
						+ aluga[i].getName()
						+ ", " + aluga[i].getEmail()
						+ "\n");
			}
		}
		
		ler.close();
	}
}