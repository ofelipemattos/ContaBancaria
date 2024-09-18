package bank;

public class Bank {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Bank <accountNumber> <username>");
            System.exit(0);
        }
        int accountNumber = Integer.parseInt(args[0]);
        String username = args[1];
        BankAccount bankAccount = new BankAccount(accountNumber, username);
        ATM atm = new ATM(bankAccount);
        if (atm.login()) {
            atm.menu();
        }
    }
}
