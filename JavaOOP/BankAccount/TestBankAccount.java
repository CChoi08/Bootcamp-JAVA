public class TestBankAccount {
    public static void main (String[] args) {

        BankAccount account1 = new BankAccount(100, 50);
        BankAccount account2 = new BankAccount(200, 10);


        System.out.println("Current Balance:");

        double checkingBalance = account1.getChecking();
        System.out.println("Checking Account: $" + checkingBalance);

        double savingsBalance = account1.getSavings();
        System.out.println("Savings Account: $" + savingsBalance);


        // double newBalance = account1.depositChecking(50);
        // System.out.println("Deposit to Checking Accountfor $50");
        // System.out.println("New Checking Account Balance of: $" + newBalance);

        double newBalance = account1.withdrawChecking(50);
        System.out.println("Withdraw from Checking Account for $50");
        System.out.println("New Checking Account Balance of: $" + newBalance);


        double totalBalance = account1.getTotal();
        System.out.println("Total balance of: $" + totalBalance);
        
        int numOfAccounts = account1.getNumAccounts();
        System.out.println("From: " + numOfAccounts +" accounts");

    }
}