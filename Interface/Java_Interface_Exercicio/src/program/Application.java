package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Application {

	public static void main(String[] args) throws ParseException {
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = ler.nextInt();
		System.out.print("Date (dd/mm/yyyy): ");
		Date date = sdf.parse(ler.next());
		System.out.print("Contract value: ");
		double totalValue = ler.nextDouble();

		Contract contract = new Contract(number, date, totalValue);

		System.out.print("Enter number of installments: ");
		int n = ler.nextInt();

		ContractService contractService = new ContractService(new PaypalService());

		contractService.processContract(contract, n);

		System.out.println("Installments:");
		for (Installment x : contract.getInstallments()) {
			System.out.println(x);
		}
		
		
		ler.close();
	}
}
