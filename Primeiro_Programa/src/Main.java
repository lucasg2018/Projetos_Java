import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Lucas";
		double x = 10.58434;
		System.out.println("Ol� meus guerreiros!");
		System.out.println(nome + " � o cara\n");
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("O valor de X � %.2f", x);
		
	}
} 