public class BankAccount {
    
    private String accountHolderName;
    private double accountBalance;
    private int accountNumber;

    public BankAccount () {
        this.accountHolderName = "";
        this.accountBalance = 0;
        this.accountNumber = 0;
    }

    public BankAccount (String name, double balance, int accNum) {
        this.accountHolderName = name;
        this.accountBalance = balance;
        this.accountNumber = accNum;
    }

    public double deposit (double amount) {
        System.out.println(accountHolderName + " deposited $" + amount);
        return accountBalance += amount;
    }

    public void withdrawal (double amount) {
        if (amount > accountBalance) {
            System.out.println(accountHolderName + " has insufficient funds!");
        } else {
            System.out.println(accountHolderName + " withdrew $" + amount);
            accountBalance -= amount;
        }
    }

    public void transfer (BankAccount recipient, double amount) {
        withdrawal(amount);
        System.out.println(accountHolderName + "'s balance is now " + accountBalance);
        recipient.deposit(amount);
        System.out.println(recipient.accountHolderName + "'s balance is now " + recipient.accountBalance);
    }

    public void getAccountInfo() {
        System.out.println(accountHolderName + "'s account balance: $" + accountBalance);
    }

    public String getName() {
        return accountHolderName;
    }

    public double getBalance() {
        return accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setName(String name) {
        this.accountHolderName = name;
    }

    public void setBalance (double balance) {
        this.accountBalance = balance;
    }

    public void setID(int length) {
        this.accountNumber = length;
    }

    @Override
    public String toString() {
        return "ID: " + getAccountNumber() + " " + getName() + "'s balance: " + getBalance();
    }

}