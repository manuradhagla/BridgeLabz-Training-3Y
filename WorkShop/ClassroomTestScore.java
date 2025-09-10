import java.util.Scanner;

public class ClassroomTestScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[12];
        System.out.println("Enter marks of 12 students:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int total = 0;
        int highest = marks[0];
        int lowest = marks[0];
        for (int i = 0; i < 12; i++) {
            total += marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }
        double average = (double) total / 12;
        int countAboveAvg = 0;
        boolean anyFail = false;

        for (int i = 0; i < 12; i++) {
            if (marks[i] > average) {
                countAboveAvg++;
            }
            if (marks[i] < 40) {
                anyFail = true;
            }
        }
        System.out.println("--- Class Report ---");
        System.out.printf("Class Average: %.2f\n", average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
        System.out.println("Number of students scoring above average: " + countAboveAvg);

        if (anyFail) {
            System.out.println("Some students scored below passing marks (40).");
        } else {
            System.out.println("All students scored above passing marks.");
        }

        sc.close();
    }
}