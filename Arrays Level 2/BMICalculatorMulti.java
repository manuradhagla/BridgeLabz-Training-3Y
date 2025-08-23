import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BMICalculatorMulti {
    static class Person {
        double weight; // kg
        double heightCm; // cm
        double bmi;
        String status;

        Person(double w, double h) {
            this.weight = w;
            this.heightCm = h;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d - weight (kg): ", i + 1);
            double w = sc.nextDouble();
            System.out.printf("Person %d - height (cm): ", i + 1);
            double h = sc.nextDouble();
            Person p = new Person(w, h);

            // compute BMI
            double heightM = h / 100.0;
            if (heightM > 0) {
                p.bmi = w / (heightM * heightM);
            } else {
                p.bmi = Double.NaN;
            }

            // determine status
            p.status = determineStatus(p.bmi);
            people.add(p);
        }

        // Output header
        System.out.printf("%-12s %-12s %-8s %-12s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");

        for (int i = 0; i < people.size(); i++) {
            Person p = people.get(i);
            System.out.printf("%-12.2f %-12.2f %-8.2f %-12s%n",
                    p.weight, p.heightCm, p.bmi, p.status);
        }

        sc.close();
    }

    private static String determineStatus(double bmi) {
        if (Double.isNaN(bmi)) return "Invalid";
        if (bmi <= 18.4) return "Underweight";
        if (bmi <= 24.9) return "Normal";
        if (bmi <= 39.9) return "Overweight";
        return "Obese";
    }
}
