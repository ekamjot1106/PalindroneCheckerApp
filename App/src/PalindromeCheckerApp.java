
public class UseCase3PalindromeCheckerApp {

    /**
     * Application entry point for UC3
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Original string
        String original = "level";
        String reversed = "";

        // Reverse using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare using equals()
        if (original.equals(reversed)) {
            System.out.println("The word \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + original + "\" is NOT a Palindrome.");
        }
    }}
