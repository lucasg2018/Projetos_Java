package program;

import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		try {
			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			int number = ler.nextInt();
			ler.nextLine();
			System.out.print("Holder: ");
			String holder = ler.nextLine();
			System.out.print("Initial balance: ");
			double balance = ler.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = ler.nextDouble();
			
			Account acc = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			double amount = ler.nextDouble();
			acc.withdraw(amount);
			
			System.out.println(acc);
		}catch(DomainException e) {
			System.out.println(e.getMessage());
		}catch (RuntimeException e) {
			System.out.println("Unexpected error!");
		}

		ler.close();
	}
}