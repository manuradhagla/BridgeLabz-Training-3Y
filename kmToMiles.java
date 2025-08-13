import java.util.*;
public class kmToMiles {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double km = sc.nextDouble();
        double miles = km * 1.6;
        System.out.println("The distance " + km + " km in miles is " + miles);
        sc.close();
    }
    
}
