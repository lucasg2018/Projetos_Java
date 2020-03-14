package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		try {
			Scanner ler = new Scanner(System.in);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			System.out.println("Enter client data: ");
			System.out.print("Name: ");
			String name  = ler.nextLine();
			System.out.print("Email: ");
			String email = ler.nextLine();
			System.out.print("Birth date (DD/MM/YYYY): ");
		
			Date birthDate = sdf.parse(ler.nextLine());
			
			System.out.println();
			System.out.println("Enter order data: ");
			Date moment = new Date();
			System.out.print("Status: ");
			String status = ler.nextLine();
			
			Order order =  new Order(moment, OrderStatus.valueOf(status), new Client(name, email, birthDate));
			
			System.out.print("How many items to this order? ");
			int n = ler.nextInt();
			ler.nextLine();
			
			for (int i = 1; i <= n; i++) {
				System.out.println("Enter #" + i  + " item data: ");
				System.out.print("Product name: ");
				String productName = ler.nextLine();
				System.out.print("Product price: ");
				double price = ler.nextDouble();
				System.out.print("Quantity: ");
				int quantity = ler.nextInt();
				ler.nextLine();
				
				OrderItem orderItem = new OrderItem(quantity, price, new Product(productName, price));
				order.addItem(orderItem);
			}
			
			System.out.println();
			System.out.println(order.toString());
			
			ler.close();
		}catch(ParseException e) {
			e.printStackTrace();
		}
	}
}