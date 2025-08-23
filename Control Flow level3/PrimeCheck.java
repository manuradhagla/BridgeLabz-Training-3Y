import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        boolean isPrime = isPrime(n);

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

        sc.close();
    }
    private static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false; 
        long limit = (long) Math.sqrt(n);
        for (long i = 3; i <= limit; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}