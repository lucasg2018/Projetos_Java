package program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		List<Produto> p = new ArrayList<>();

		System.out.print("Enter file path: ");
		String sourceFileStr = ler.nextLine();

		File sourceFile = new File(sourceFileStr);
		String sourceFolder = sourceFile.getParent();

		boolean sucesso = new File(sourceFolder + "\\out").mkdir();

		String targetFileStr = sourceFolder + "\\out\\sumary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
			String line = br.readLine();

			while (line != null) {
				String[] lines = line.split(",");
				String nome = lines[0];
				double preco = Double.parseDouble(lines[1]);
				int quantia = Integer.parseInt(lines[2]);

				p.add(new Produto(nome, preco, quantia));

				line = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
				
				for (Produto produto : p) {
					bw.write(produto.getNome() + "," + String.format("%.2f",produto.total()));
					bw.newLine();
				}
				
				System.out.println("File Created!");
				
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		ler.close();
	}
}
