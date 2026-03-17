// UC13: Performance Comparison
public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "level";

        long start = System.nanoTime();

        boolean isPalindrome = true;
        int left = 0, right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        long end = System.nanoTime();

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + (end - start) + " ns");
    }
}
