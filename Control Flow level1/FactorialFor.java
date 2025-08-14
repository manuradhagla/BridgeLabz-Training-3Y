import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer to compute factorial: ");
        int n = in.nextInt();
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            in.close();
            return;
        }
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        System.out.println(n + "! = " + fact);
        in.close();
    }
}
