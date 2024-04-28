import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        String userInput = scanner.nextLine();

        try {
            // Attempt to parse the user input as an integer
            int number = Integer.parseInt(userInput);
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            // Catch the NumberFormatException if user input cannot be parsed as an integer
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            // Close the scanner in the finally block to ensure resources are cleaned up
            scanner.close();
        }
    }
}
