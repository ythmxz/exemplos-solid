package incorrect.invariance;

public class CheckingAccount extends BankAccount{
	protected float overdraftLimit;

	public CheckingAccount(float overdraftLimit) {
		super();
		this.overdraftLimit = overdraftLimit;
	}

	public void withdraw(float amount) {
		if (amount <= 0.f)
			throw new IllegalArgumentException("O valor de saque deve ser positivo");

		float availableBalance = this.balance + this.overdraftLimit;

		if (amount > availableBalance)
			throw new IllegalArgumentException("Saldo insuficiente e limite do Cheque Especial excedido");

		this.balance -= amount;
	}
}
