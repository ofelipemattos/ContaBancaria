package bank;

import java.util.Date;

public class BankAccount {
    private final String INITIAL_PASSWORD = "1234";
    private boolean firstAccess;
    private int accountNumber;
    private Date createDate;
    private String username;
    private String password;
    private double balance;

    public BankAccount(int accountNumber, String username) {
        this.accountNumber = accountNumber;
        this.username = username;
        this.createDate = new Date();
        this.balance = 0.0;
        this.password = INITIAL_PASSWORD;
        this.firstAccess = true;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isFirstAccess() {
        return firstAccess;
    }

    public void setFirstAccess(boolean firstAccess) {
        this.firstAccess = firstAccess;
    }
}
