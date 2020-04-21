package program;

import model.entities.Pessoa;
import model.exception.DomainException;

public class Main {

	public static void main(String[] args) {

		try {
			
			Pessoa pessoa = new Pessoa("Lucas", 19);

		} catch (DomainException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Qualquer exceção q dê");
		}

	}
}
