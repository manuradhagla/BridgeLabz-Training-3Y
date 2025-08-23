import java.util.*;
public class NaturalSum {
    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number.");
            sc.close();
            return;
        }

        int recSum = recursiveSum(n);
        int formSum = formulaSum(n);
        System.out.println("Recursive Sum: " + recSum);
        System.out.println("Formula Sum: " + formSum);
        System.out.println("Both results match: " + (recSum == formSum));
        sc.close();
    }
}


