import java.util.Scanner;

public class HeightConertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();
        // 1 inch = 2.54 cm, 1 foot = 12 inches
        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);
        int inches = (int) Math.round(totalInches % 12);
        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + feet + " and inches is " + inches);
        sc.close();
    }
    
}
