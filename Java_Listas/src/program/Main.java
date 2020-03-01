package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		List<String> pessoas = new ArrayList<>();
		
			
		pessoas.add("Maria"); 
		pessoas.add("Alex"); 
		pessoas.add(0 ,"Bob"); 
		pessoas.add("Anna"); 
		pessoas.add(2, "Marco");
		
		System.out.printf("Quantity of peoples= %d \n\n", pessoas.size());
		
		for (String x : pessoas) {
			System.out.println(x);
		}
		
		System.out.println("---------------------"); 
		
		pessoas.removeIf(x -> x.charAt(0) == 'M'); 
		
		
		for (String x : pessoas) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		System.out.println("Index of Bob: " + pessoas.indexOf("Bob"));
		System.out.println("Index of Marco: " + pessoas.indexOf("Marco")); 
		System.out.println("---------------------");
		
		List<String> result = pessoas.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		String name = pessoas.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
		ler.close();
	}
}