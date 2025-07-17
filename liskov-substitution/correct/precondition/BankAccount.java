package correct.precondition;

public class BankAccount {
	protected float balance;

	public BankAccount() {
		this.balance = 0.f;
	}

	public float getBalance() {
		return this.balance;
	}

	public void deposit(float amount) {
		this.balance += amount;
	}
}
