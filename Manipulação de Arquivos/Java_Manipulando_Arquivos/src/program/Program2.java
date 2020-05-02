package program;

import java.io.File;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Enter a file path: ");
		String strpath = ler.nextLine();
		
		File path = new File(strpath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		
		ler.close();
	}
}
