package program;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		methd1();
		
		System.out.println("End of Program");
	}
	
	public static void methd1() {
		System.out.println("*** METHOD1 START ***\n");
		
		method2();
		
		System.out.println("*** METHOD1 END ***\n");
	}

	public static void method2() {
		System.out.println("*** METHOD2 START ***\n");

		Scanner ler = new Scanner(System.in);		
		try {

			String[] vect = ler.nextLine().split(" ");

			int position = ler.nextInt();
			System.out.println(vect[position]);

		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		} 
		catch (InputMismatchException e) {
			System.out.println("Input error!");
		}
		
		ler.close();
		System.out.println("*** METHOD2 END ***\n");
	}
}
