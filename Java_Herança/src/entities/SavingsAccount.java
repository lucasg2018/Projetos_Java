package entities;

public final class SavingsAccount extends Account{
	private double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, double balance, double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	/*Se torna necessario o uso do Override para informar ao compilador,
	que isso aqui é uma sobrecarga*/
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}
