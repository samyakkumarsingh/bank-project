public class SavingAccount extends Account
{
    private final double minimumBalance = 500;

    public SavingAccount(String name, String number, double initialBalance)
    {
        super(name, number, initialBalance); // call Account constructor
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= minimumBalance)
        {
            balance =balance- amount;
            System.out.println("Withdrawn: ₹" + amount);
        }
        else
        {
            System.out.println("Cannot withdraw. Minimum balance ₹" + minimumBalance + " must be maintained.");
        }
    }
}
