package bank;

import utils.Utils;

import java.util.Scanner;

public class Menu {
    private final Scanner sc;

    public Menu(Scanner sc) {
        this.sc = sc;
    }

    public void displayMenu() {
        String menu = """
                Escolha a operação:
                1 - Depósito.
                2 - Saque.
                3 - Saldo.
                4 - Sair.""";
        System.out.println(menu);
    }

    public int getOption() {
        String nextLine = sc.nextLine();
        if (Utils.isValid(nextLine, 1)) {
            return Integer.parseInt(nextLine);
        } else {
            System.out.println("Opção inválida!");
            return -1;
        }
    }
}