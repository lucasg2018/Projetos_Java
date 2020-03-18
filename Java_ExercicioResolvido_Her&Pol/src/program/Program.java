package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		List<Employee> employee = new ArrayList<>();

		System.out.print("Enter the number of employee: ");
		int n = ler.nextInt();
		ler.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.print("Outsourced Employee(y or n)? ");
			char esc = ler.nextLine().charAt(0);

			System.out.printf("%dº Employee data\n", i);
			System.out.print("Name: ");
			String name = ler.nextLine();
			System.out.print("Hours: ");
			int hours = ler.nextInt();
			System.out.print("Value per hours: ");
			double valuePerHour = ler.nextDouble();

			if (esc == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = ler.nextDouble();
				ler.nextLine();

				Employee emp = new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employee.add(emp);
			} else {
				ler.nextLine();
				Employee emp = new Employee(name, hours, valuePerHour);
				employee.add(emp);
			}
		}

		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee emp : employee) {
			System.out.println(emp.getName() + " - $ " + emp.payment());
		}

		ler.close();
	}
}