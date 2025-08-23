import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics mark (0-100): ");
        int physics = sc.nextInt();
        System.out.print("Enter Chemistry mark (0-100): ");
        int chemistry = sc.nextInt();
        System.out.print("Enter Maths mark (0-100): ");
        int maths = sc.nextInt();
        double average = (physics + chemistry + maths) / 3.0;
        String grade;
        String remarks;
        if (average >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >= 40) {
            grade = "E";
            remarks = "Level 1- , too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }
        System.out.printf("Average Mark: %.2f%n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        sc.close();
    }
}
