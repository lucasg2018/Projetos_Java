import java.util.Locale;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Informe seu nome:");
		String nome = sc.next();
		System.out.println("Informe a sua idade:");
		int idade = sc.nextInt();
		System.out.printf("Seu nome é %s e você tem %d anos.", nome, idade);
		
		sc.close();
	}
}