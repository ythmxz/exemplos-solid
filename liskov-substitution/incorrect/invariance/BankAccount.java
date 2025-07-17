package incorrect.invariance;

public class BankAccount {
	protected float balance;

	public BankAccount() {
		this.balance = 0.f;
	}

	public float getBalance() {
		return this.balance;
	}

	public void withdraw(float amount) {
		if (amount <= 0.f)
			throw new IllegalArgumentException("O valor de saque deve ser positivo");

		if (amount > this.balance)
			throw new IllegalArgumentException("Saldo insuficiente. O saldo não pode ficar negativo");

		this.balance -= amount;
	}
}
