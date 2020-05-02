package program;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc1 = new Account(1001, "Lucas", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Lavinia", 1000.0, 0.01);
		acc2.withdraw(200);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Caroline", 1000.0, 500.0);
		acc3.withdraw(200);
		System.out.println(acc3.getBalance());
		
		/*
		BusinessAccount bacc = new BusinessAccount(1002, "Lavinia", 0.0, 500.0);
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Caroline", 0.0, 600.0);
		Account acc3 = new SavingsAccount(1006, "Gabriel", 0.0, 0.01);
		
		//DOWNCASTING
		
		BusinessAccount bacc1 = (BusinessAccount)acc2;
		bacc1.loan(100.0);
		
		
		//Aqui da erro pelo fato da acc3 não ser instacia de BusinessAccount e sim SanvingsAccount
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(20);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		*/
		
		System.out.println();
		
		//Polimorfismo 
		System.out.println("Polimorfismo:\n");
		Account x = new Account(2000, "José", 1000);
		Account y = new SavingsAccount(2001, "Maria", 1000, 0.01);
		
		x.withdraw(50);
		y.withdraw(50);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}
}