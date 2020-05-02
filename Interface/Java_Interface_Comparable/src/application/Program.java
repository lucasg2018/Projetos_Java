package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		List<Funcionario> funcionario = new ArrayList<>();
		String path = "C:\\Users\\Lucas Gabriel\\Documents\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] lines = line.split(",");
				funcionario.add(new Funcionario(lines[0], Double.parseDouble(lines[1])));
				line = br.readLine();
			}
			Collections.sort(funcionario);
			for (Funcionario func : funcionario) {
				System.out.println(func.getName() + " | " + func.getSalary());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
