package com.stockaccount;

import java.util.Scanner;

public class StockAccount {
    private final String name;     // customer name
    private double cash;           // cash balance
    private int n;                 // number of stocks in portfolio
    private int[] shares;          // shares[i] = number of shares of stock i
    private String[] stocks;       // stocks[i] = symbol of stock i

    // build data structure from file
    public StockAccount(String filename) {
        Scanner scanner = new Scanner(filename);
        name = scanner.nextLine();
        cash = scanner.nextDouble();
        n = scanner.nextInt();
        shares = new int[n];
        stocks = new String[n];
        for (int i = 0; i < n; i++) {
            shares[i] = scanner.nextInt();
            stocks[i] = scanner.nextLine();
        }
    }


    // value of account
    public double valueOf() {
        System.out.println(name);
        double total = cash;
        for (int i = 0; i < n; i++) {
            int amount = shares[i];

            double price = shares[i];
            total += amount * price;
        }
        return total;
    }


    // test client
    public static void main(String [] args) {
        String filename = args[0];
        StockAccount account = new StockAccount(filename);
        account.valueOf();
    }
}
