import java.util.*;

public class ATMInterface {
    private static double balance = 1000.0; // Initial account balance

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the ATM!");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdraw(scanner);
                    break;
                case 3:
                    deposit(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void checkBalance() {
        System.out.println("Your balance is: $" + balance);
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Your new balance is: $" + balance);
        }
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else {
            balance += amount;
            System.out.println("Deposit successful. Your new balance is: $" + balance);
        }
    }
}
