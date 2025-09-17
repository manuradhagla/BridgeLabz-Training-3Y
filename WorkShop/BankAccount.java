public class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor code 
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // for Depositing the money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // for Withdrawing the money from account 
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    // for checking the balance in account
    public void checkBalance(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current balance: ₹" + balance);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", 1000.0);
        account.checkBalance();
        account.deposit(500);
        account.withdraw(300);
        account.withdraw(1500);
        account.checkBalance();
    }
}

