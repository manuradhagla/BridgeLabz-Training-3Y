import java.util.Scanner;

public class QuitentRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int number2 = sc.nextInt();

        int quotient = (number2 != 0) ? (number1 / number2) : 0;
        int remainder = (number2 != 0) ? (number1 % number2) : number1;

        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder +
                " of two number " + number1 + " and " + number2);
        sc.close();
    }
    
}
