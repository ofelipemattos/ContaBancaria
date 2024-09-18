package bank;
// src/ATM.java
import java.util.Scanner;

public class ATM {
    private BankAccount bankAccount;
    private Scanner sc;
    private Menu menu;
    private PasswordManager passwordManager;

    public ATM(BankAccount account) {
        this.sc = new Scanner(System.in);
        this.bankAccount = account;
        this.menu = new Menu(sc);
        this.passwordManager = new PasswordManager(sc, bankAccount);
    }

    public boolean login() {
        return passwordManager.login();
    }

    public void menu() {
        int option = 0;
        printBalance();
        while (option != 4) {
            menu.displayMenu();
            option = menu.getOption();
            switch (option) {
                case 1 -> deposit();
                case 2 -> withdraw();
                case 3 -> printBalance();
                case 4 -> System.out.println("Até logo!");
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    public void deposit() {
        System.out.println("Qual valor deseja depositar?");
        try {
            double value = sc.nextDouble();
            bankAccount.setBalance(bankAccount.getBalance() + value);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Valor inválido!");
        }
        sc.nextLine();
    }

    public void withdraw() {
        System.out.println("Qual valor deseja sacar?");
        try {
            double value = sc.nextDouble();
            if (value > bankAccount.getBalance()) {
                System.out.println("Saldo insuficiente!");
            } else {
                bankAccount.setBalance(bankAccount.getBalance() - value);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Valor inválido!");
        }
        sc.nextLine();
    }

    public void printBalance() {
        System.out.printf("Seu saldo é R$ %.2f\n", bankAccount.getBalance());
    }
}