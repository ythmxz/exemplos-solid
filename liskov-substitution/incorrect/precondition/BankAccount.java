package incorrect.precondition;

public class BankAccount {
	protected float balance;

	public BankAccount() {
		this.balance = 0.f;
	}

	public float getBalance() {
		return this.balance;
	}

	public void deposit(float amount) {
		if (amount <= 0.f)
			throw new IllegalArgumentException("O valor de depósito deve ser positivo");

		this.balance += amount;
	}
}
