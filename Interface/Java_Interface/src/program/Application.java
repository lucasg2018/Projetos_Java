package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Application {

	public static void main(String[] args) throws ParseException {
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		System.out.println("Enter rental data");
		System.out.print("Car model: ");
		String model = ler.nextLine();
		System.out.print("Pickup (DD/MM/YYYY HH:MM): ");
		Date start = sdf.parse(ler.nextLine());
		System.out.print("Return (DD/MM/YYYY HH:MM): ");
		Date finish = sdf.parse(ler.nextLine());
		
		CarRental cr = new CarRental(start, finish, new Vehicle(model));
		
		System.out.print("Enter price per hour: ");
		double pricePerHour = ler.nextDouble();
		System.out.print("Enter price per day: ");
		double pricePerDay = ler.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println("\nINVOICE:");
		System.out.println("Basic payment: " +  String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: " +  String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Total Payment: " +  String.format("%.2f", cr.getInvoice().totalPayment()));
		
		ler.close();
	}
}
