import java.util.Scanner;

public class StudentGradeTable {

    static class Student {
        double physics;
        double chemistry;
        double maths;
        double percentage;
        String grade;
        String remarks;

        Student(double p, double c, double m) {
            this.physics = p;
            this.chemistry = c;
            this.maths = m;
            this.percentage = (p + c + m) / 3.0;
            this.grade = "";
            this.remarks = "";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.print("  Physics mark: ");
            double p = sc.nextDouble();
            System.out.print("  Chemistry mark: ");
            double c = sc.nextDouble();
            System.out.print("  Maths mark: ");
            double m = sc.nextDouble();

            Student s = new Student(p, c, m);
            s.grade = determineGrade(s.percentage);
            s.remarks = determineRemarks(s.percentage, s.grade);

            students[i] = s;
        }

        // Output results
        System.out.println("\nResults:");
        System.out.printf("%-8s %-10s %-8s %-10s %-20s%n",
                "Stu", "Percentage", "Grade", "Remarks", "");
        for (int i = 0; i < n; i++) {
            Student s = students[i];
            System.out.printf("%-8d %-10.2f %-8s %-20s%n",
                    i + 1, s.percentage, s.grade, s.remarks);
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