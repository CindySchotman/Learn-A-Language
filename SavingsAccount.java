public class SavingsAccount {

    // Properties of the class...
    private int balance;

    public SavingsAccount() {
   		balance = 0;
    }

    public SavingsAccount(int initialBalance) {
   		balance = initialBalance;
    }

    public void greet() {
    	System.out.println("Hallo");
    }

    public void deposit(int howMuch) {
    	if(howMuch<0) {
    		System.out.println("ERROR: Can not deposit a negative amount.");
    	} else {
	    	balance = balance + howMuch;
	    }
    }

    public void withdraw(int howMuch) {
    	if(howMuch<0) {
    		System.out.println("ERROR: Can not withdraw a negative amount.");
    	} else {
	    	balance = balance - howMuch;
	    }
    }

    public void showBalance() {
    	System.out.println("Balance: " + balance);
    }

}