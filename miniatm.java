import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int balance;

    static void showMenu() {
        System.out.println("\n--- ATM Menu ---");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    static void deposit() {
        System.out.print("Enter how much you want to deposit: ");
        int deposit = sc.nextInt();
        balance += deposit;
        System.out.println("✅ Amount deposited successfully!");
        System.out.println("Updated Balance: " + balance);
    }

    static void withdraw() {
        System.out.print("Enter how much you want to withdraw: ");
        int withdraw = sc.nextInt();
        if (withdraw > balance) {
            System.out.println("❌ Insufficient Balance!");
        } else {
            balance -= withdraw;
            System.out.println("✅ Withdrawal successful!");
            System.out.println("Updated Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter your initial balance: ");
        balance = sc.nextInt();

        while (true) {
            showMenu();
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your Current Balance: " + balance);
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM! 👋");
                    System.exit(0); // exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
