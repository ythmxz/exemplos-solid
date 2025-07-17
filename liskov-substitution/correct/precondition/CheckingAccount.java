package correct.precondition;

public class CheckingAccount extends BankAccount{
	public CheckingAccount() {
		super();
	}

	public void deposit(float amount) {
		if (amount <= 0.f)
			throw new IllegalArgumentException("O valor de depósito deve ser positivo");

		super.deposit(amount);
	}
}
