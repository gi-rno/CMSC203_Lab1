
public class SavingsAccount extends BankAccount{

	 private double rate = 0.025;

	    private int savingsNumber = 0;
	    
	    private String accountNumber;

	    public SavingsAccount(String name, double initialBalance) {
	        super(name, initialBalance);

	        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	    }

	    public void postInterest() {
	    	
	        double monthlyInterest = getBalance() * (rate/12);
	        
	        deposit(monthlyInterest);
	    }

	    @Override
	    public String getAccountNumber() {
	    	
	        return accountNumber;
	    }

	    public SavingsAccount(SavingsAccount originalSavAcc, double initialBalance) {
	    	
	        super(originalSavAcc, initialBalance); 
	        
	        savingsNumber = originalSavAcc.savingsNumber + 1;
	        
	        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	    }
}
