import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the kilometer ");
        double km = sc.nextDouble();
        double price = 10 + (km * 2.20);
        if (price < 20) price = 20;

        // OR
        // price=(price<20)? 20 : price;

        System.out.println("Taximetre " + price);
    }
}
