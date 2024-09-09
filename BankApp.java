class BankAccount {
    int accountNumber;
    double balance;
    String owner;

    public BankAccount(int accountNumber, double balance, String owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(int accountNumber, double balance, String owner, double interestRate) {
        super(accountNumber, balance, owner);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * interestRate;
    }
}

class LoanAccount extends BankAccount {
    private double interestRate;
    private int loanTerm;

    public LoanAccount(int accountNumber, double balance, String owner, double interestRate, int loanTerm) {
        super(accountNumber, balance, owner);
        this.interestRate = interestRate;
        this.loanTerm = loanTerm;
    }

    public double calculateInterest() {
        return balance * interestRate * loanTerm / 12.0;
    }
}


class CheckingAccount extends BankAccount {
    public CheckingAccount(int accountNumber, double balance, String owner) {
        super(accountNumber, balance, owner);
    }

    public double calculateInterest() {
        return 0.0;
    }
}


public class BankApp {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1001, 5000.0, "Shamil", 0.02);
        LoanAccount loan = new LoanAccount(2001, 10000.0, "Irfan", 0.05, 24);
        CheckingAccount checking = new CheckingAccount(3001, 3000.0, "Rishi");

        System.out.println("Savings interest: " + savings.calculateInterest());
        System.out.println("Loan interest: " + loan.calculateInterest());
        System.out.println("Checking interest: " + checking.calculateInterest());
    }
}
