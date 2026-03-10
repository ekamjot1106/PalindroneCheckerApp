

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC2
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        boolean isPalindrome = true;

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
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
