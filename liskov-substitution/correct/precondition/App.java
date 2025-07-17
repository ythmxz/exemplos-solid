package correct.precondition;

public class App {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		bankAccount.deposit(5.f);
		System.out.println("\n" + bankAccount.getBalance());

		CheckingAccount checkingAccount = new CheckingAccount();
		checkingAccount.deposit(5.f);
		System.out.println("\n" + checkingAccount.getBalance());

		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.deposit(5.f);
		System.out.println("\n" + savingsAccount.getBalance());
	}
}
