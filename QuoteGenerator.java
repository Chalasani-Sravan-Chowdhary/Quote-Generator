
import java.util.Random;
import java.util.Scanner;

public class QuoteGenerator {
    public static void main(String[] args) {

        // The quotes are being stored in the form of array string.(array: similar datatypes, here quotes are similar dataypes string)
        String[] quotes = {
                "The only way to do great work is to love what you do. – Steve Jobs",
                "In the middle of every difficulty lies opportunity. – Albert Einstein",
                "Life is what happens when you're busy making other plans. – John Lennon",
                "Success is not the key to happiness. Happiness is the key to success. – Albert Schweitzer",
                "Believe you can and you're halfway there. – Theodore Roosevelt "
            
        };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String userInput;

        System.out.println("Welcome to the Quote Generator! where u can find the quotes of ur interest");
        
        do {
           
            int index = random.nextInt(quotes.length);
            System.out.println("Here's a quote u asked for:");
            System.out.println(quotes[index]);
            
            
            System.out.print("need to find more similar quotes? (yes/no): ");
            userInput = scanner.nextLine().trim().toLowerCase();
        } while (userInput.equals("yes")); //quotes are generated aas long as while condition keeps on running and here yes/no are the objects (need to get answers)

        System.out.println("Have a great time and here to help u");
        scanner.close();
    }
}