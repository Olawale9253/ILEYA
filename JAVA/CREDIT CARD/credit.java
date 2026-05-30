import java.util.Scanner;

public class CreditCard{

public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter credit card number: ");

        int cardNumber = userInput.nextInt();

        if (cardNumber.length() < 13 || cardNumber.length > 16) {

            System.out.println("Invalid card length");
        }

        System.out.println("Card Type: " + getCardType(cardNumber));

        System.out.println("Card Length: " + cardNumber.length);

        if (isValid(cardNumber))

            System.out.println("Validity Status: Valid");

        else

            System.out.println("Validity Status: Invalid");

    }

    public static String getCardType(String cardNumber) {

        if (cardNumber == ("4")){

            return "Visa Card";
}

        else if (cardNumber == ("5")){

            return "MasterCard";
}

        else if (cardNumber == ("37")){

            return "American Express Card";
}

        else if (cardNumber == ("6")){

            return "Discover Card";
}

        else {

            return "Unknown Card";
}
    }

    public static boolean isValid(String cardNumber) {

        int sum = 0;

        boolean doubleDigit = false;

        for (int index = cardNumber.length - 1; index >= 0; index--) {
            
            if (doubleDigit) {

                digit *= 2;

                if (digit > 9) {
                    digit = (digit / 10) + (digit % 10);
                }
            }

            sum += digit;

        }

        return sum;
    }

    
}
