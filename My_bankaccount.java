package fatimja;

public class My_bankaccount {

	public static void main(String[] args) {
		BankAccount my_account = new BankAccount(5000);
		my_account.deposit(150);
		my_account.withdraw(200);
		my_account.getBalance();
		char s = my_account.readCommand("Type D (for deposit) and W (for withdraw) followed by the amount: ");
		int amount = my_account.readCommand();
		if (s == 'W') {
			my_account.withdraw(amount);
		}
		else if (s == 'D') {
			my_account.deposit(amount);
		}
		else {
			 System.out.println("Invalid input");
		}
        System.out.println("You have " + (my_account.getBalance()/(100.0)) + " dollars in your Bank Account");
	}

}
