package program;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strpath = ler.nextLine();
		
		File path = new File(strpath);
		
		System.out.println();
		File[] folders = path.listFiles(File::isDirectory);//Está função restorna todos os diretorios contidos no caminho que foi passado
		for (File folder : folders) {
			System.out.println(folder.getName());
		}
		
		System.out.println();
		File[] files = path.listFiles(File::isFile);
		for (File file : files) {
			System.out.println(file.getName());
		}
		
		//mkdir() Cria uma subpasta
		boolean success = new File(strpath + "\\sub").mkdir();
		System.out.println(success);
		
		ler.close();
	}
}
