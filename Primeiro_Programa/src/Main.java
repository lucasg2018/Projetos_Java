import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Lucas";
		double x = 10.58434;
		System.out.println("Olá meus guerreiros!");
		System.out.println(nome + " é o cara\n");
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("O valor de X é %.2f", x);
		
	}
} 