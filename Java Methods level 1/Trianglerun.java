import java.util.Scanner;

public class Trianglerun {
    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return (int)Math.ceil(5000 / perimeter); // 5km = 5000 meters
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side A (m): ");
        double a = sc.nextDouble();
        System.out.print("Enter side B (m): ");
        double b = sc.nextDouble();
        System.out.print("Enter side C (m): ");
        double c = sc.nextDouble();

        int rounds = calculateRounds(a, b, c);
        System.out.println("Athlete must complete " + rounds + " rounds to run 5 km.");
        sc.close();
    }
}
