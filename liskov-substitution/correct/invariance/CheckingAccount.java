package correct.invariance;

public class CheckingAccount extends BankAccount {
	protected float overdraftLimit;

	public CheckingAccount(float overdraftLimit) {
		super();
		this.overdraftLimit = overdraftLimit;
	}

	public void withdraw(float amount) {
		float availableBalance = this.balance + this.overdraftLimit;

		if (amount > availableBalance)
			throw new IllegalArgumentException("Saldo insuficiente e limite do Cheque Especial excedido");

		super.withdraw(amount);
	}
}
