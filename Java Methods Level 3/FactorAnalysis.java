public class FactorAnalysis {
    public static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) factors[index++] = i;
        return factors;
    }

    public static int getGreatestFactor(int[] factors) {
        return factors[factors.length - 2]; // last is number itself
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int n : arr) total += n;
        return total;
    }

    public static int product(int[] arr) {
        int result = 1;
        for (int n : arr) result *= n;
        return result;
    }

    public static double cubeProduct(int[] arr) {
        double result = 1;
        for (int n : arr) result *= Math.pow(n, 3);
        return result;
    }
}

