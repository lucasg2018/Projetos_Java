package application;

import java.util.Scanner;

import services.InterestService;
import services.UsaInterestService;

public class program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = ler.nextDouble();
		System.out.print("Months: ");
		int months = ler.nextInt();
		
		InterestService is = new UsaInterestService(1.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
		
		ler.close();
	}
}
