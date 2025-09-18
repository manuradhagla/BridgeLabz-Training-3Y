public class MathOperaton {


    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial is undefined for negative numbers.");
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

 
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    
    public static int gcd(int a, int b) {
        if (a == 0 && b == 0) throw new IllegalArgumentException("GCD is undefined for both numbers being zero.");
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    
    public static int fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("Fibonacci is undefined for negative numbers.");
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
       
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Factorial of 0: " + factorial(0));

        System.out.println("Is 7 prime? " + isPrime(7));
        System.out.println("Is 1 prime? " + isPrime(1));
        System.out.println("Is -3 prime? " + isPrime(-3));

        System.out.println("GCD of 54 and 24: " + gcd(54, 24));
        System.out.println("GCD of -54 and 24: " + gcd(-54, 24));

        System.out.println("Fibonacci of 7: " + fibonacci(7));
        System.out.println("Fibonacci of 0: " + fibonacci(0));
        System.out.println("Fibonacci of 1: " + fibonacci(1));
    }
}

