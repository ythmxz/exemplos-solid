package correct.precondition;

public class SavingsAccount extends BankAccount {
	public SavingsAccount() {
		super();
	}

	public void deposit(float amount) {
		if (amount < 10.f)
			throw new IllegalArgumentException("O depósito mínimo para Conta Poupança é de R$10,00");

		super.deposit(amount);
	}
}
