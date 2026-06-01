import java.util.Scanner;
import java.util.Random;

public class BookSuggestionSystem {
    
    public static void main(String[] args) {

    public String[] bookTitles = new String[100];
    public int bookCount = 0;
    
        Scanner userInput = new Scanner(System.in);
 
        bookTitles[0] = "The Hobbit";
        bookTitles[1] = "The Mystery";
        bookTitles[2] = "Brave kind";
        bookCount = 3;

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nWelcome to the Book Suggestion System!");
            System.out.println("1. Get Suggestions");
            System.out.println("2. Add Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Update book");
            System.out.println("5. Show books");
            System.out.println("6. Exit");
            System.out.print("Enter operation: ");
            
            String homePage = userInput.nextLine();

            switch (homePage){

                case "1":
                    suggestBooks();
                    break;

                case "2":
                    addBook();
                    break;

                case "3":
                    removeBook();
                    break;

                case "4":
                    updateBook();
                    break;

                case "5":
                    showAllBooks();
                    break;

                case "6":
                    System.out.println("Goodbye!");
                    isRunning = false;
                    break;
    
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
}
        }
    }

    
    public static boolean suggestBooks() {
        if (bookCount == 0) {
            System.out.println("No books available to suggest!");
            return false;
        }
            int bookTitles;
            int randomPage;
        
            System.out.println("\nBook for the Day:");
            System.out.println("Book Title: " + bookTitles);
            System.out.println("Page: " + randomPage);

            System.out.print("Would you like to get another suggestion? (yes/no): ");
            String confirmation = userInput.nextLine();
            
        }
        return true;
    }

    public static boolean addBook() {
        if (bookCount >= 100) {
            System.out.println("Storage full! Cannot add more books.");
            return false;
        }

        System.out.print("Enter the book title: ");
        String newTitle = userInput.nextLine();

        for (int index = 0; index < bookCount; index++) {
               System.out.println("Book already exists!");
                return false;
            
        }

    }

    public static boolean removeBook() {
        if (bookCount == 0) {
            System.out.println("No books available to remove.");
            return false;
        }

        System.out.print("Enter the book title to remove: ");
        String targetTitle = userInput.nextLine();

        if (foundIndex == 0) {
            System.out.println("Book not found.");
            return false;
        }
    }

    public static boolean updateBook() {
        System.out.print("Enter the old title: ");
        String oldTitle = userInput.nextLine();

        for (int index = 0; index < bookCount; index++) {

                System.out.print("Enter the new title: ");
                String newTitle = userInput.nextLine();
                bookTitles[index] = newTitle;
                System.out.println("Book updated successfully!");
                return true;
            }
        }
        System.out.println("Book not found.");
        return false;
    }

    public static int showAllBooks() {
        if (bookCount == 0) {
            System.out.println("No books to display.");
            return 0;
        }

        System.out.println("\nAll Books");
        for (int index = 0; index < bookCount; index++) {
            
        }
        return bookCount;
    }
}

