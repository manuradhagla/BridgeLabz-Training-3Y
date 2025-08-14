import java.util.*;
public class Volume {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of cylinder: ");
        double r= sc.nextDouble();
        System.out.println("Enter the height of cylinder: ");
        double h= sc.nextDouble();
        double volume = 3.14*r*r*h;
        System.out.println("Volume of cylinder is: "+volume);
        sc.close();
    }
}
