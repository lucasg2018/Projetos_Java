package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		try {
			Scanner ler = new Scanner(System.in);
			List<Product> product = new ArrayList<>();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			System.out.print("Enter the number of products: ");
			int n = ler.nextInt();
			ler.nextLine();

			for (int i = 1; i <= n; i++) {
				System.out.printf("\nProduct #%d data:", i);
				System.out.print("\nCommon, used or imported (c/u/i): ");
				char esc = ler.nextLine().charAt(0);
				System.out.print("Name: ");
				String name = ler.nextLine();
				System.out.print("Price: ");
				double price = ler.nextDouble();

				if (esc == 'i') {
					System.out.print("Customs fee: ");
					double customsFee = ler.nextDouble();
					ler.nextLine();

					Product p = new ImportedProduct(name, price, customsFee);
					product.add(p);
				} else if (esc == 'u') {
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					Date manufactureDate = sdf.parse(ler.next());
					
					Product p = new UsedProduct(name, price, manufactureDate);
					product.add(p);
				} else {
					ler.nextLine();
					Product p = new Product(name, price);
					product.add(p);
				}
			}
			
			System.out.println("\nPRICE TAGS: ");
			for (Product p : product) {
				System.out.println(p.priceTag());
			}

			ler.close();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}