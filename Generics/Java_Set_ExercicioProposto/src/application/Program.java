package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Portal;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Set<Portal> set = new HashSet<>();
		int id;
		
		System.out.print("How many students for course A? ");
		int a = ler.nextInt();
		for (int i = 0; i < a; i++) {
			id = ler.nextInt();
			set.add(new Portal(id));
		}
		
		System.out.print("How many students for course B? ");
		int b = ler.nextInt();
		for (int i = 0; i < b; i++) {
			id = ler.nextInt();
			set.add(new Portal(id));
		}
		
		System.out.print("How many students for course C? ");
		int c = ler.nextInt();
		for (int i = 0; i < c; i++) {
			id = ler.nextInt();
			set.add(new Portal(id));
		}
		
		System.out.println("Total students: " + set.size());
		
		ler.close();
	}

}
