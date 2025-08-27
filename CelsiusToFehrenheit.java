import java.util.*;
public class CelsiusToFehrenheit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter temperature in Celcius: ");
        double temp=sc.nextDouble();
        double feh= ((temp*9/5)+32);
        System.out.println("The temperature "+temp+ " in Fehrenheit is "+feh);
        sc.close();
    }
}
