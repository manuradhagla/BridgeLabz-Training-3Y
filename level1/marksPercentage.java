import java.util.*;
public class marksPercentage {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double maths = sc.nextDouble();
        double physics = sc.nextDouble();
        double chemistry = sc.nextDouble();
        double average = (maths + physics + chemistry) / 3.0;
        System.out.println("Sam's average mark in PCM is " + average);
        sc.close();
    }
}
