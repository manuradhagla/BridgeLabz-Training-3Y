import java.util.Scanner;

public class Digitfrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String s = sc.next();

        // Frequency array for digits 0-9
        int[] freq = new int[10];

        // Count digits
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int d = ch - '0';
                freq[d]++;
            }
        }

        // Display frequency
        System.out.println("Digit frequencies:");
        for (int d = 0; d <= 9; d++) {
            System.out.println("Digit " + d + ": " + freq[d]);
        }

        sc.close();
    }
}
