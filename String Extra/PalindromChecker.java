import java.util.Scanner;

public class PalindromChecker {
    public static void main(String[] args) {
        String input = getInput();
        boolean result = isPalindrome(input);
        displayResult(input, result);
    }

    static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        sc.close();
        return sc.nextLine();
    }

    static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    static void displayResult(String str, boolean isPalin) {
        System.out.println(str + " is " + (isPalin ? "a palindrome." : "not a palindrome."));
    }
}

