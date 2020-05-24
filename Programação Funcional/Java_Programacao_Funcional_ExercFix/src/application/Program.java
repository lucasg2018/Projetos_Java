package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = ler.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			List<Employee> list = new ArrayList<>();
			while(line != null) {
				String[] lines = line.split(",");
				list.add(new Employee(lines[0], lines[1], Double.parseDouble(lines[2])));
				
				line = br.readLine();
			}
			
			System.out.print("Enter salary: ");
			double salary = ler.nextDouble();
			
			System.out.println("Email of people salary is more than " + salary + ":");
			List<String> emails = list.stream().filter(x -> x.getSalary() > salary)
							.map(x -> x.getEmail())
							.sorted()
							.collect(Collectors.toList());
			
			emails.forEach(System.out::println);
							
			double sum = list.stream().filter(x -> x.getName().charAt(0) == 'M')
							.map(x -> x.getSalary())
							.reduce(0.0, (x,y) -> x + y);
			
			System.out.println("Sum of salary people whose name starts  with 'M': " + sum);
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		ler.close();
	}
}
