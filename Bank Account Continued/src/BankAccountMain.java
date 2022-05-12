import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountMain {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String a = System.lineSeparator();
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        System.out.println("Welcome to The Backrooms Bank.");

        while (true) {
            System.out.println("Are you an existing customer? Type '-1' to exit.");
            System.out.println("1. Yes" + a + "2. No");
            String response = scan.nextLine();

            if (response.equalsIgnoreCase("1")) {
                System.out.println("Please enter the ID of the account.");
                int query = Integer.valueOf(scan.nextLine());
                for (int i = 0; i < accounts.size(); i++) {
                    if (query == accounts.get(i).getAccountNumber()) {
                        mainMenu(accounts, accounts.get(i));
                    } else {
                        System.out.println("Invalid ID or account does not exist!");
                        continue;
                    }
                }

            } else if (response.equalsIgnoreCase("2")) {
                accounts.add(new BankAccount());
                int index = accounts.size() - 1;
                System.out.println("Let's create your account!");
                System.out.println("Please enter the name of the account holder.");
                String name = scan.nextLine();
                System.out.println("Please enter the beginning balance of the account.");
                int balance = Integer.valueOf(scan.nextLine());
                accounts.get(index).setName(name);
                accounts.get(index).setBalance(balance);
                accounts.get(index).setID(accounts.size());
                System.out.println(accounts.get(index));
                mainMenu(accounts, accounts.get(index));

            } else if (response.equalsIgnoreCase("-1")) {
                System.out.println("Thank you for using our system. Goodbye!");
                break;
            }
        }
    }

    public static void mainMenu(ArrayList<BankAccount> accounts, BankAccount currentAccount) {
        String a = System.lineSeparator();

        while (true) {
            System.out.println("Hello " + currentAccount.getName() + "!");
            System.out.println("Welcome to the main menu. What would you like to do today?");
            System.out.println("1. Check account balance" + a +
                    "2. Make a withdrawal" + a +
                    "3. Make a deposit" + a +
                    "4. Transfer money to another account" + a +
                    "5. Exit");
            String response = scan.nextLine();

            if (response.equalsIgnoreCase("1")) {
                System.out.println("Your balance is $" + currentAccount.getBalance());
                continue;

            } else if (response.equalsIgnoreCase("2")) {
                System.out.println("Please put the amount you wish to withdraw.");
                currentAccount.withdrawal(Double.valueOf(scan.nextLine()));
                System.out.println("Your remaining balance is $" + currentAccount.getBalance());
                continue;

            } else if (response.equalsIgnoreCase("3")) {
                System.out.println("Please put the amount you wish to deposit.");
                currentAccount.deposit(Double.valueOf(scan.nextLine()));
                System.out.println("Your new balance is $" + currentAccount.getBalance());
                continue;

            } else if (response.equalsIgnoreCase("4")) {
                System.out.println("Please enter the account ID to transfer to.");
                int id = Integer.valueOf(scan.nextLine());
                if (id > accounts.size()) {
                    System.out.println("Invalid ID or account does not exist!");
                    continue;
                } else {
                    BankAccount recipient = accounts.get(id - 1);
                    System.out.println("Please enter the amount to transfer.");
                    double amount = Double.valueOf(scan.nextLine());
                    if (amount > currentAccount.getBalance()) {
                        System.out.println("You have insufficient funds to transfer!");
                        continue;
                    } else {
                        currentAccount.transfer(recipient, amount);
                    }
                }
                
            } else if (response.equalsIgnoreCase("5")) {
                break;
            }
        }
    }
}