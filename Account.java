public class Account
{
    String accountHolderName;
    String accountNumber;
    double balance;

    // Constructor
    public Account(String name, String number, double initialBalance)
    {
        accountHolderName = name;
        accountNumber = number;
        balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount)
    {
        balance=balance+amount;
        System.out.println("Deposited: ₹" + amount);
    }

    // Overloaded deposit (default)
    public void deposit()
    {
        deposit(1000);  // default ₹1000
    }

    // Withdraw method
    public void withdraw(double amount)
    {
        if (balance >= amount) {
            balance =balance- amount;
            System.out.println("Withdrawn: ₹" + amount);
        }
        else
        {
            System.out.println("Insufficient balance.");
        }
    }

    // Show account info
    public void displayAccountInfo()
    {
        System.out.println("Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}
