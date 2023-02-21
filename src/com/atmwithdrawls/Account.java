package com.atmwithdrawls;

public class Account {
    private String accountHoldersName;
    private double balance;

    public Account(String accountHoldersName, int balance) {
        this.accountHoldersName = accountHoldersName;
        do {
            if (balance > 0.0) {
                this.balance = balance;
            } else {
                System.out.println("The Balance is negative Please Deposit the amount: ");
            }
        }
        while (balance < 0.0);
    }


    public void depositAmount(double depositAmount) {

        if (depositAmount > 0.0) {
            System.out.println("your Account is deposited: " + depositAmount);
            balance = balance + depositAmount;
        } else {
            System.out.println("Deposit amount is invalid: ");
        }
    }

    public double withdraw(double withdrawAmount) {
        if (withdrawAmount <= balance) {
            System.out.println("your account is withdrawal:" + withdrawAmount);
            balance = balance - withdrawAmount;
            System.out.println(balance);
        } else {
            System.out.println("insufficient funds: ");
        }
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHoldersName() {
        return accountHoldersName;
    }

    public static void main(String[] args) {
        Account account = new Account("rahul", 2000);
        account.depositAmount(5000);
        account.withdraw(2000);
        System.out.println(account.getAccountHoldersName());
    }

}
