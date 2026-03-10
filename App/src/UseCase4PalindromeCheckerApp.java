
public class UseCase4PalindromeCheckerApp {

    /**
     * Application entry point for UC4
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Original string
        String word = "radar";

        // Convert to character array
        char[] characters = word.toCharArray();

        boolean isPalindrome = true;

        int left = 0;
        int right = characters.length - 1;

        // Two-pointer comparison
        while (left < right) {
            if (characters[left] != characters[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}

