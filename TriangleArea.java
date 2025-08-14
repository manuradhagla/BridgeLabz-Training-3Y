import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (cm): ");
        double baseCm = sc.nextDouble();
        System.out.print("Enter height (cm): ");
        double heightCm = sc.nextDouble();

        double areaCm2 = 0.5 * baseCm * heightCm;
        // 1 inch = 2.54 cm, so 1 cm = 1/2.54 inch; area in sq in: cm^2 / (2.54^2)
        double areaIn2 = areaCm2 / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaIn2 +
                " and sq cm is " + areaCm2);
        sc.close();
    }
    
}
