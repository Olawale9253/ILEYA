import java.util.Scanner;

public class CheckoutApp {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double subTotal = 0;

        System.out.print("Enter customer name: ");
        String customerName = userInput.nextLine();

        System.out.print("Enter cashier name: ");
        String cashierName = userInput.nextLine();

        String customerChoice = "yes";

        while (customerChoice.equalsIgnoreCase("yes")) {

            System.out.print("Enter product name: ");
            String productName = userInput.nextLine();

            System.out.print("Enter quantity: ");
            int quantityOfGoods = userInput.nextInt();

            System.out.print("Enter price per unit: ");
            double priceOfProduct = userInput.nextDouble();

            double total = quantityOfGoods * priceOfProduct;
            subTotal += total;

            System.out.println(priceOfProduct + " = " + total);
            userInput.nextLine();

            System.out.print("Add another item? (yes/no): ");
            customerChoice = userInput.nextLine();
        }

        System.out.print("Enter discount percentage: ");
        double discountPercent = userInput.nextDouble();

        double discount = subTotal * discountPercent / 100;
        double valueAddedTax = subTotal * 0.075;
        double billTotal = subTotal - discount + valueAddedTax;
    System.out.println("");

        System.out.println("SEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03262727272");
        System.out.println("Date : 18-Dec-22 8:48:11 pm");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Cashier Name: " + cashierName);

      System.out.println("============================================================");
      System.out.println("        ITEM          QTY         PRICE      TOTAL(NGN)");

        System.out.println("Subtotal: " + subTotal);
        System.out.println("Discount: " + discount);
        System.out.println("VAT (7.5%): " + valueAddedTax);
        System.out.println("Bill Total: " + billTotal);
        System.out.println("===================");
    }
}
