import java.util.Scanner;

public class Marks2DArray {
    static final int SUBJECTS = 3; // Physics, Chemistry, Maths

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // 2D array: marks[i][j] -> i: student, j: subject
        double[][] marks = new double[n][SUBJECTS];

        // Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.print("  Physics mark: ");
            marks[i][0] = sc.nextDouble();
            System.out.print("  Chemistry mark: ");
            marks[i][1] = sc.nextDouble();
            System.out.print("  Maths mark: ");
            marks[i][2] = sc.nextDouble();
        }

        // Compute percentage, grade, and remarks
        double[] percentage = new double[n];
        String[] grade = new String[n];
        String[] remarks = new String[n];

        for (int i = 0; i < n; i++) {
            double sum = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = sum / 3.0;
            grade[i] = determineGrade(percentage[i]);
            remarks[i] = determineRemarks(percentage[i], grade[i]);
        }

        // Output results
        System.out.println("\nResults:");
        System.out.printf("%-10s %-14s %-6s %-20s%n", "Student", "Marks (P,C,M)", "Pct", "Grade / Remarks");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d [%.0f, %.0f, %.0f] %-12.2f %-6s / %s%n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i], remarks[i]);
        }

        sc.close();
    }

    private static String determineGrade(double pct) {
        if (pct >= 80.0) return "A";
        if (pct >= 70.0) return "B";
        if (pct >= 60.0) return "C";
        if (pct >= 50.0) return "D";
        if (pct >= 40.0) return "E";
        return "R";
    }

    private static String determineRemarks(double pct, String grade) {
        switch (grade) {
            case "A": return "Level 4, above agency-normalized standards";
            case "B": return "Level 3, at agency-normalized standards";
            case "C": return "Level 2, below, but approaching agency-normalized standards";
            case "D": return "Level 1, well below agency-normalized standards";
            case "E": return "Level 1-, too below agency-normalized standards";
            default:  return "Remedial standards";
        }
    }
}
