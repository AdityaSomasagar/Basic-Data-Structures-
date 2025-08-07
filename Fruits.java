import java.sql.SQLOutput;
import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        double discount = 0;
        double total = 0;
        double pricePerKg = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the fruit name(Apple/Banana/Mango/Orange): ");
        String fruit = scn.nextLine().toLowerCase();
        System.out.println("Quantity:  ");
        double qty = scn.nextInt();

        switch (fruit) {
            case "apple":
                pricePerKg = 100;
                break;
            case "banana":
                pricePerKg = 40;
                break;
            case "mango":
                pricePerKg = 60;
                break;
            case "orange":
                pricePerKg = 80;
                break;
            default:
                System.out.println("Enter a valid fruit name ");
        }
        total = pricePerKg * qty;

        if (total > 500 && total <= 1000) {
            discount = 0.10 * total;
        } else if (total > 1000) {
            discount = 0.15 * total;
        }

        double discountedAmount = total - discount;

        System.out.println("Fruit: " + fruit);
        System.out.println("Quantity: " + qty);
        System.out.println("Price per kg: " + pricePerKg);
        System.out.println("Total before discount: " + total);
        System.out.println("Total after discount: Rs " + discountedAmount);


    }

}
