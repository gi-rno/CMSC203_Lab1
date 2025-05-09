
public class CheckingAccount extends BankAccount{

	private static final double FEE = .15;
	
	public CheckingAccount(String name, double initialAmount) {
		
		super(name, initialAmount);
		
		String oldAccNum = getAccountNumber();
		
		setAccountNumber(oldAccNum + "-10");
	}
	
	@Override
	public boolean withdraw(double amount) {
		
		return super.withdraw(amount + FEE);
	}
}
