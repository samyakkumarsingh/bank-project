import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = null;

        System.out.println("Welcome to the Bank Account System");

        // Step 1: Choose account type
        System.out.println("Select Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        // Step 2: Enter account details
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        String number = sc.nextLine();

        System.out.print("Enter Initial Balance: ₹");
        double balance = sc.nextDouble();

        // Step 3: Create account based on user choice
        if (choice == 1) {
            account = new SavingAccount(name, number, balance);
        } else if (choice == 2) {
            account = new CurrentAccount(name, number, balance);
        } else {
            System.out.println("Invalid choice. Exiting...");
            return;
        }

        // Step 4: Menu loop
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Account Info");
            System.out.println("4. Exit");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double wd = sc.nextDouble();
                    account.withdraw(wd);
                    break;
                case 3:
                    account.displayAccountInfo();
                    break;
                case 4:
                    System.out.println("Thank you for using our service.");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}

