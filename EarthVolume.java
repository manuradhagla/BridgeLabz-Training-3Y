import java.util.*;
public class EarthVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radiusKm = sc.nextDouble();
        double volumeKm3 = (4.0/3.0) * Math.PI * Math.pow(radiusKm, 3);

        // 1 km^3 to miles^3: 1 km = 0.621371 miles, so 1 km^3 = (0.621371)^3 miles^3
        double volumeMiles3 = volumeKm3 * Math.pow(0.621371, 3);

        System.out.println("The volume of earth in cubic kilometers is " +
                           volumeKm3 + " and cubic miles is " + volumeMiles3);
        sc.close();
    }
    
}
