package program;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		File file = new File("c:\\Users\\Lucas Gabriel\\Documents\\medidas.txt");
		Scanner ler = null;
		try {
			ler = new Scanner(file);
			while (ler.hasNextLine()) {
				System.out.println(ler.nextLine());
			}

		} catch (IOException e) {
			System.out.println("Erro!");
		} finally {
			if (ler != null) {
				ler.close();
			}
		}

	}
}
