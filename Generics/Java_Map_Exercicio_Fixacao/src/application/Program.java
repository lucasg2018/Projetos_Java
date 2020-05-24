package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = ler.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Map<String, Integer> votacao = new HashMap<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] lines = line.split(",");
				String name = lines[0];
				int vot = Integer.parseInt(lines[1]);
				
				votacao.put(name, vot);
				
				line = br.readLine();
			}
			
			for (String obj : votacao.keySet()) {
				System.out.println(obj + ": " + votacao.get(obj));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		ler.close();
	}

}
