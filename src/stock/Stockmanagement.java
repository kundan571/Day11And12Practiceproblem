package stock;

import java.util.Scanner;

public class Stockmanagement {
    public String companyName;
    public int price;
    public int numberOfShares;

    public int calculateSharePrice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter company Name: ");
        String companyName = scanner.nextLine();
        System.out.println("Enter Share Price: ");
        int price = scanner.nextInt();
        System.out.println("Enter Number of Share: ");
        int numberOfShares = scanner.nextInt();
        return price * numberOfShares;
    }

    public static void main(String[] args) {
        Stockmanagement stockmanagement = new Stockmanagement();
        System.out.println(stockmanagement.calculateSharePrice());

    }
}
