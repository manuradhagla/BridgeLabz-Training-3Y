import java.util.Scanner;

public class BMICalculator {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightMeters = data[i][1] / 100;
            data[i][2] = weight / (heightMeters * heightMeters);
        }
    }

    public static String[] determineStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 25) status[i] = "Normal";
            else if (bmi < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] personData = new double[10][3]; // weight, height(cm), BMI

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();
        }

        calculateBMI(personData);
        String[] status = determineStatus(personData);

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d: Weight = %.2f kg, Height = %.2f cm, BMI = %.2f, Status = %s\n",
                i + 1, personData[i][0], personData[i][1], personData[i][2], status[i]);
        }
        sc.close();
    }
}

