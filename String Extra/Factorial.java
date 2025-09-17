import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num = getInput();
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }

    static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        sc.close();
        return sc.nextInt();
    }

    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}

