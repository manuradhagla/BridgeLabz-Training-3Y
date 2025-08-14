import java.util.Scanner;
public class FactorialWhile {
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
        int i = 2;
        while (i <= n) {
            fact *= i;
            i++;
        }
        System.out.println(n + "! = " + fact);
        in.close();
    }
}
