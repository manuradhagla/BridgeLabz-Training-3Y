import java.util.*;

public class NumberChecker {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) if (digits[i] == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int[] digits, int num) {
        int sum = 0;
        int power = digits.length;
        for (int d : digits) sum += Math.pow(d, power);
        return sum == num;
    }

    public static int[] findLargestTwo(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max1) {
                max2 = max1;
                max1 = d;
            } else if (d > max2 && d != max1) {
                max2 = d;
            }
        }
        return new int[]{max1, max2};
    }

    public static int[] findSmallestTwo(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min1) {
                min2 = min1;
                min1 = d;
            } else if (d < min2 && d != min1) {
                min2 = d;
            }
        }
        return new int[]{min1, min2};
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static double sumSquares(int[] digits) {
        double sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int num, int[] digits) {
        return num % sumDigits(digits) == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) freq[d]++;
        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;
            result[i][1] = freq[i];
        }
        return result;
    }

    public static int[] reverseArray(int[] digits) {
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++) rev[i] = digits[digits.length - 1 - i];
        return rev;
    }

    public static boolean isPalindrome(int[] digits) {
        return Arrays.equals(digits, reverseArray(digits));
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) if (num % i == 0) return false;
        return true;
    }
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }
    public static boolean isSpy(int[] digits) {
        int sum = 0, product = 1;
        for (int d : digits) {
            sum += d;
            product *= d;
        }
        return sum == product;
    }
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        return String.valueOf(square).endsWith(String.valueOf(num));
    }
    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) if (num % i == 0) sum += i;
        return sum == num;
    }
    public static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) if (num % i == 0) sum += i;
        return sum > num;
    }
    public static boolean isDeficient(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) if (num % i == 0) sum += i;
        return sum < num;
    }
    public static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }
    private static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }
}

