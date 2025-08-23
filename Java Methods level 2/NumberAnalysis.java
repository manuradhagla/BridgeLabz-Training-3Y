import java.util.*;
public class NumberAnalysis {
    public static boolean isPositive(int num) { return num >= 0; }
    public static boolean isEven(int num) { return num % 2 == 0; }
    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a == b) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (isPositive(numbers[i])) {
                System.out.println("Positive and " + (isEven(numbers[i]) ? "Even" : "Odd"));
            } else {
                System.out.println("Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        System.out.println("Comparison of first and last: " +
            (result == 0 ? "Equal" : result == 1 ? "First is greater" : "First is smaller"));
            sc.close();
    }
}

