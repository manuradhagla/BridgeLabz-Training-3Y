import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = getInput("Enter first number: ");
        int b = getInput("Enter second number: ");
        int c = getInput("Enter third number: ");
        sc.close();
        System.out.println("Maximum is: " + findMax(a, b, c));
    }

    static int getInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        sc.close();
        return sc.nextInt();
    }

    static int findMax(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }

}

