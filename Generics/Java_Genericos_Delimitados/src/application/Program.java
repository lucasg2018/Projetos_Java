package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Product;
import model.services.CalculationService;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		String path = "C:\\Users\\Lucas Gabriel\\Documents\\out.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] lines = line.split(",");
				list.add(new Product(lines[0], Double.parseDouble(lines[1])));
				line = br.readLine();
			}
			
			Integer x = CalculationService.max(list);
			System.out.println("Max:");
			System.out.print(x);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		ler.close();
	}
}
