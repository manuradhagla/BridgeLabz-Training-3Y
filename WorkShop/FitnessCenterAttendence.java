import java.util.*;
public class FitnessCenterAttendence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] attendance=new int[10];
        System.out.println("Enter Attendance for 10 days: ");
        for(int i=0;i<10;i++){
            System.out.println("Enter attendance for day "+(i+1)+":");
            attendance[i]=sc.nextInt();
        }
        int total=0;
        int maxattendance=attendance[0];
        int dayOfMax=1;
        int minAttendance= attendance[0];
        int dayOfMin=1;

        for(int i=0;i<10;i++){
            total = total+attendance[0];

            if(attendance[i]>maxattendance){
                maxattendance=attendance[i];
                dayOfMax=i+1;
            }
            if(attendance[i]<minAttendance){
                minAttendance=attendance[i];
                dayOfMin=i+1;
            }
        }
        double avg= (double)total/10;
        System.out.println("---- Fitness Center Attendance Tracker ----");
        System.out.println("Total visitors in 10 days: "+total);
        System.out.println("Day with maximum attendance : day "+dayOfMax+" ("+maxattendance+ "visitors )");
        System.out.println("Day with minimum attendance : day "+dayOfMin+" ("+minAttendance+ "visitors )");
        System.out.println("Average attendance: "+avg);
        System.out.println("Days with attendance above average");
        for(int i=0;i<10;i++){
            if(attendance[i]>avg){
                System.out.println("Day "+(i+1)+" : "+attendance[i]+" visitors");
            }
        }
        sc.close();
    }
}
