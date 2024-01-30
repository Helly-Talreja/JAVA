import java.util.Scanner;

class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: $" + interest + ". New balance: $" + balance);
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Exceeded overdraft limit. Withdrawal failed.");
        }
    }
}

public class Exp_21_Banking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SavingsAccount savingsAccount = new SavingsAccount("SA123", 1000.0, 2.5);
        System.out.println("Savings Account created.");
        savingsAccount.displayAccountInfo();

        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);
        savingsAccount.addInterest();

        System.out.println(); // Separating output for clarity

        CurrentAccount currentAccount = new CurrentAccount("CA456", 2000.0, 1000.0);
        System.out.println("Current Account created.");
        currentAccount.displayAccountInfo();

        currentAccount.deposit(800.0);
        currentAccount.withdraw(2500.0);

        scanner.close();
    }
}
