package program;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		DateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		List<Pessoa> pessoa = new ArrayList<Pessoa>();
		
		System.out.print("Enter the numbers of people: ");
		int n = read.nextInt();
		read.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("\n%dº", i + 1);
			System.out.print("\nEnter the name: ");
			String name = read.nextLine();
			System.out.print("Enter the age: ");
			int age = read.nextInt();
			read.nextLine();
			try {
				System.out.print("Type the date of birth: ");
				String conv = read.nextLine();
				
				Date date = sd.parse(conv);
				
				pessoa.add(new Pessoa(name, age, date));
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(pessoa.toString());
				
		read.close();
	}

}
