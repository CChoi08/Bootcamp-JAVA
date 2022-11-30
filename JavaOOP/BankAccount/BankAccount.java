class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private double totalOfAccounts;

    public static int numOfAccounts = 0;

    // keeps track of how many accounts
    public BankAccount(double checkingBalanceParam, double savingsBalanceParam) {
        checkingBalance = checkingBalanceParam;
        savingsBalance = savingsBalanceParam;
        numOfAccounts ++;
        totalOfAccounts = checkingBalance + savingsBalance;
    }

    // deposit money to checking account
    public double depositChecking(double deposit) {
        checkingBalance += deposit;
        return checkingBalance;
    }
    // withdraw method
    public double withdrawChecking(double withdraw) {
        checkingBalance -= withdraw;
        return checkingBalance;
    }


    // getter for balances on account
    public double getChecking(){
        return checkingBalance;
    }
    public double getSavings(){
        return savingsBalance;
    }
    public double getTotal() {
        return totalOfAccounts;
    }
    public int getNumAccounts() {
        return numOfAccounts;
    }
}