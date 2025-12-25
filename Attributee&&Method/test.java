import java.util.*;
public class test {
    private String name;
    private double balance;

    public test(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // set name
    public void setName(String name) {
        this.name = name;

    }

    // get name
    public String getName() {
        return name;
    }

    // get balance
    public double getBalance() {
        return balance;
    }

    // deposit
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to make a withdrawal
    public boolean withdrawal(double amount) {
        if (amount >= balance) {
            System.out.println("Insufficient amount");
            return false;
        }
        balance -= amount; // Update the balance
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input name
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        // Input initial balance
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        // Create object
        test account = new test(name, balance);

        // Deposit
        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        // Withdrawal
        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = sc.nextDouble();
        account.withdrawal(withdrawAmount);

        // Final details
        System.out.println("\nAccount Holder: " + account.getName());
        System.out.println("Final Balance: " + account.getBalance());

        sc.close();

    }
}
