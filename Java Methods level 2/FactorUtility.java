import java.util.*;

public class FactorUtility {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) total += num;
        return total;
    }

    public static int product(int[] arr) {
        int result = 1;
        for (int num : arr) result *= num;
        return result;
    }

    public static double sumOfSquares(int[] arr) {
        double total = 0;
        for (int num : arr) total += Math.pow(num, 2);
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Sum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Sum of Squares: " + sumOfSquares(factors));
        sc.close();
    }
}

