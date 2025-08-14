import java.util.Scanner;

public class SumNaturalnumberFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a natural number n: ");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("Input is not a natural number.");
            in.close();
            return;
        }
        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }
        int sumFormula = n * (n + 1) / 2;

        boolean correct = (sumFor == sumFormula);
        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Sum using for loop: " + sumFor);
        System.out.println("Both methods give the same result: " + correct);

        in.close();
    }
}