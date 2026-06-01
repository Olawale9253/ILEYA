import java.util.Scanner;

public class creditCardValidator {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Hello, Kindly Enter Card Details: ");
        String cardNumber = userInput.nextLine();
        
        String cardType = getCardType(cardNumber);
        int length = getDigitLength(cardNumber);
        boolean validStatus = isValid(cardNumber);
        String validity = validStatus ? "Valid" : "Invalid";
        
        System.out.println("========== Below Is Your Card Details ==========");
        System.out.println("Credit Card Type: " + cardType);
        System.out.println("Credit Card Number: " + cardNumber);
        System.out.println("Credit Card Digit Length: " + length);
        System.out.println("Credit Card Validity Status: " + validity);
        System.out.println("=================================================");
       
    }

    public static int getDigitLength(String cardNumber) {
        return cardNumber.length();
    }

    public static String getCardType(String cardNumber) {
        if (cardNumber.startsWith("4")) {
            return "Visa";
        } else if (cardNumber.startsWith("5")) {
            return "MasterCard";
        } else if (cardNumber.startsWith("37")) {
            return "American Express";
        } else if (cardNumber.startsWith("6")) {
            return "Discover cards";
        } else {
            return "Invalid Card";
        }
    }

    public static boolean isValid(String cardNumber) {
        int length = cardNumber.length();
        if (length < 13 || length > 16) {
            return false;
        }
        
        int sumOfEvens = sumOfDoubleEvenPlace(cardNumber);
        int sumOfOdds = sumOfOddPlace(cardNumber);
        
        return (sumOfEvens + sumOfOdds) % 10 == 0;
    }

    public static int sumOfDoubleEvenPlace(String cardNumber) {
        int sum = 0;
      
        for (int index = cardNumber.length - 2; index >= 0; index -= 2) {
            sum += getDigit(digit * 2);
        }
        return sum;
    }

    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        }
        return (number % 10) + (number / 10);
    }

    public static int sumOfOddPlace(String cardNumber) {
        int sum = 0;
     
        for (int index = cardNumber.length() - 1; index >= 0; index -= 2) {
            
            sum += digit;
        }
        return sum;
    }
}

