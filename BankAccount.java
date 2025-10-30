class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolderName;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    

   

    void deposit(double amount) {
        if (amount > 0) {
          balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    double getBalance() {
        return balance;
    }
    String getAccountHolderName() {
        return accountHolderName;
    }
    int getAccountNumber() {
        return accountNumber;
    }

}