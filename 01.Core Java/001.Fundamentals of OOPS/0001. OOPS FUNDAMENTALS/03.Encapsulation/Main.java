import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========= Welcome to Our Bank Services ============");
        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();

        bank myBank = new bank(initialBalance);

        while (true) {

            System.out.println("\n========= Welcome to Our Bank Services ============");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Balance: " + myBank.getbalance());
                    break;

                case 2:
                    System.out.print("Enter the Amount: ");
                    double amount = sc.nextDouble();

                    myBank.deposti(amount);

                    System.out.println("Balance: " + myBank.getbalance());
                    break;

                case 3:
                    System.out.print("Enter the Amount: ");
                    double withdrawamount = sc.nextDouble();

                    myBank.withdraw(withdrawamount);

                    System.out.println("Balance: " + myBank.getbalance());
                    break;

                case 4:
                    System.out.println("Thank you for using our services!");
                    return;

                default:
                    System.out.println("Invalid choice!!");
            }
        }
    }
}