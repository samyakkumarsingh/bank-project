public class CurrentAccount extends Account
{
    private final double overdraftLimit = 1000;

    public CurrentAccount(String name, String number, double initialBalance)
    {
        super(name, number, initialBalance);
    }

    @Override
    public void withdraw(double amount)
    {
        if (balance + overdraftLimit >= amount)
        {
            balance=balance-amount;
            System.out.println("Withdrawn using overdraft: ₹" + amount);
        }
        else
        {
            System.out.println("Overdraft limit exceeded. Cannot withdraw ₹" + amount);
        }
    }
}
