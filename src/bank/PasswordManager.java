package bank;

import utils.Utils;


import java.util.Scanner;

public class PasswordManager {
    private Scanner sc;
    private BankAccount bankAccount;

    public PasswordManager(Scanner sc, BankAccount bankAccount) {
        this.sc = sc;
        this.bankAccount = bankAccount;
    }

    public boolean login() {
        int attempts = 3;
        while (attempts > 0) {
            System.out.println("Informe sua senha de 4 digitos: ");
            String password = sc.nextLine();
            if (password.equals(bankAccount.getPassword())) {
                if (bankAccount.isFirstAccess()) {
                    setNewPassword();
                } else {
                    System.out.printf("Olá %s, seja bem vindo!\n", bankAccount.getUsername());
                }
                return true;
            }
            System.out.println("Senha incorreta! (Use apenas caracteres numéricos.)");
            attempts--;
        }
        System.out.println("Por motivos de segurança, sua conta foi bloqueada. Entre em contato com sua agência para solicitar o desbloqueio.");
        return false;
    }

    public void setNewPassword() {
        System.out.printf("Olá %s, seja bem vindo! Este é o seu primeiro acesso. Antes de prosseguir, vamos criar uma nova senha.\n", bankAccount.getUsername());
        while (true) {
            System.out.println("Informe uma nova senha de 4 caracteres. Use apenas caracteres numéricos: ");
            String newPassword = sc.nextLine();
            if (Utils.isValid(newPassword, 4) && !newPassword.equals(bankAccount.getPassword())) {
                bankAccount.setPassword(newPassword);
                System.out.println("Senha atualizada com sucesso!");
                break;
            } else {
                System.out.println("Senha inválida ou igual à anterior!");
            }
        }
    }
}