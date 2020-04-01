package program;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		//Class abstract:
			List<Account> list = new ArrayList<Account>();
			
			list.add(new SavingsAccount(1001, "Alex", 500, 0.01));
			list.add(new BusinessAccount(1002, "Maria", 1000, 400));
			list.add(new SavingsAccount(1003, "Sergio", 300, 0.01));
			list.add(new BusinessAccount(1004, "Florinda", 600, 200));
	
			double sum = 0.0;
			for (Account acc : list) {
				sum += acc.getBalance();
			}
			
			System.out.println(sum);
			
			for (Account acc : list) {
				acc.deposit(10);
			}
			System.out.println();
			for (Account acc : list) {
				System.out.printf("Updated balance for %d: %.2f%n", acc.getNumber(),acc.getBalance());
			}
	}
}