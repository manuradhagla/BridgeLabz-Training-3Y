import java.util.Scanner;

public class SumnaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a natural number n: ");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.println("Input is not a natural number.");
            in.close();
            return;
        }
        int sumWhile = 0;
        int i = 1;
        while (i <= n) {
            sumWhile += i;
            i++;
        }
        int sumFormula = n * (n + 1) / 2;
        boolean correct = (sumWhile == sumFormula);
        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Sum using while loop: " + sumWhile);
        System.out.println("Both methods give the same result: " + correct);

        in.close();
    }
}