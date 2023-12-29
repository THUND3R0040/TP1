public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private int balance;

    public BankAccount(int accountNumber, String accountHolderName, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123, "John Doe", 1000);
        account.deposit(500);
        account.withdraw(200);
        System.out.println(account.getBalance());
    }
}